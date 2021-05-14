package ec.edu.ups.controlador;
import java.util.List;

import ec.edu.ups.modelo.*;


public interface UsuarioDAO {

	List<Usuario> listar();
	Usuario actualizar(int id);
	void registrar(Usuario usuario);
	void eliminar(Usuario usuario);
}
