package ec.edu.ups.controlador;

import java.util.List;

import ec.edu.ups.modelo.Telefono;


public interface TelefonoDAO {
	List<Telefono> listar();
	Telefono actualizar(int id);
	void registrar(Telefono usuario);
	void eliminar(Telefono usuario);
}
