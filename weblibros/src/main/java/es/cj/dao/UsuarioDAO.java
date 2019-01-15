package es.cj.dao;

import es.cj.bean.Conexion;
import es.cj.bean.Usuario;

public interface UsuarioDAO {

	public Usuario comprobarUsuario(String login, String password, Conexion c);
}
