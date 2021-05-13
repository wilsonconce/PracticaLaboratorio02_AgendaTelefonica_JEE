package ec.edu.ups.modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConexionDB {

	Connection conexion = null;
	Statement sentecia = null;
	ResultSet result = null;

	public ConexionDB() {
		String url = "jdbc:mysql://localhost:3306/jee";
		String user = "root";
		String pass = "admin";
	}

	public Connection getConexion() {
		return conexion;
	}

	public void setConexion(Connection conexion) {
		this.conexion = conexion;
	}

	public Statement getSentecia() {
		return sentecia;
	}

	public void setSentecia(Statement sentecia) {
		this.sentecia = sentecia;
	}

	public ResultSet getResult() {
		return result;
	}

	public void setResult(ResultSet result) {
		this.result = result;
	}
	
	
}
