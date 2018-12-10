package es.cj.main;

import es.cj.bean.Palabra;
import es.cj.dao.PalabraDAO;
import es.cj.dao.PalabraDAOListas;

public class Principal {

	public static void main(String[] args) {
		PalabraDAO pDAO = new PalabraDAOListas();
		
		Palabra p1 = new Palabra("hola", "saludo formal");
		Palabra p2 = new Palabra("adios", "despedida formal");
		Palabra p3 = new Palabra("mesa", "mueble para colocar cosas");
		
		pDAO.anadir(p1);
		pDAO.anadir(p2);
		pDAO.anadir(p2);
		pDAO.anadir(p3);
		
		pDAO.listar();
		
		if (pDAO.borrar(p3))
			System.out.println("Palabra borrada");
		else
			System.out.println("No existe la palabra");
		
		pDAO.listar();
		
		if (pDAO.buscar(p3))
			System.out.println("Palabra encontrada");
		else
			System.out.println("Palabra no encontrada");
		
		System.out.println("Definición de Hola: " 
				+ pDAO.obtenerDefinicion("Hola"));
	}

}
