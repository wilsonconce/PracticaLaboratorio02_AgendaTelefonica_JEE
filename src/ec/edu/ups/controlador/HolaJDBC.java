package ec.edu.ups.controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HolaJDBC {

	public static void main(String[] args) {
		Connection conexion = null;
		Statement sentecia = null;
		ResultSet result = null;

		String url = "jdbc:mysql://localhost:3306/jee";
		String user = "root";
		String pass = "admin";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conexion = DriverManager.getConnection(url, user, pass);
			sentecia = conexion.createStatement();
		} catch (ClassNotFoundException e) {
			System.out.println("Imposible cargar driver:" + e.getMessage());
		} catch (SQLException e) {
			System.out.println("Imposible Conectar:" + e.getMessage());
		}
		try {
			sentecia.executeUpdate("DROP TABLE IF EXISTS tabla1");
			sentecia.executeUpdate("CREATE TABLE tabla1 (id1 INT PRIMARY KEY, nombre CHAR(20) DEFAULT '-')");
		} catch (SQLException e) {
			System.out.println("Creacion de tabla Fallida:" + e.getMessage());
		}
		try {
			sentecia.executeUpdate("INSERT tabla1 (id1) VALUES (3)");
			sentecia.executeUpdate("INSERT tabla1 VALUES (4,'Jesus')");
			sentecia.executeUpdate("INSERT tabla1 VALUES (5,'Juan')");
		} catch (SQLException e) {
			System.out.println("Insersion de datos fallida:" + e.getMessage());
		}
		try {
			result = sentecia.executeQuery("SELECT * FROM tabla1");
			while (result.next()) {
				System.out.println("id1:" + result.getLong("id1")+ ", nombre:" + result.getString("nombre"));
			}

		} catch (SQLException e) {
			System.out.println("Consulta Fallida:" + e.getMessage());
		}
	}
}
