package es.cj.datos;

public class Ejercicio03 {

	// Aplicar las operaciones b�sicas de modificaci�n de Strings a la cadena �Uno
	// dosuno�, a�adi�ndole caracteres al final, cambiando la �o� por �e� y
	// pas�ndola a may�scula.

	public static void main(String[] args) {
		String cadena = "Unodosuno";
		
		//cadena = cadena.concat("tres");
		
		//StringBuffer sb = new StringBuffer(cadena);
		//sb.append("tres");

		cadena = cadena.replace("o", "e");
		cadena = cadena.toUpperCase();
	}

}
