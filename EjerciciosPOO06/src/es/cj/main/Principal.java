package es.cj.main;

import es.cj.bean.Alumno;
import es.cj.dao.AlumnoDAO;
import es.cj.dao.AlumnoDAOListas;

public class Principal {

	public static void main(String[] args) {
		AlumnoDAO alumDAO = new AlumnoDAOListas();
		
		Alumno a1 = new Alumno("yo", "yo yo", 23, 3.4F);
		Alumno a2 = new Alumno("tu", "tu tu", 32, 3.4F);
		
		alumDAO.anadir(a1);
		alumDAO.anadir(a2);
		
		alumDAO.mostrarTodos();
	}

}
