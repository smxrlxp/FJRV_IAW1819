package es.cj.datos;

public class Ejercicio03 {

	// Aplicar las operaciones básicas de modificación de Strings a la cadena “Uno
	// dosuno”, añadiéndole caracteres al final, cambiando la “o” por “e” y
	// pasándola a mayúscula.

	public static void main(String[] args) {
		String cadena = "Unodosuno";
		
		//cadena = cadena.concat("tres");
		
		//StringBuffer sb = new StringBuffer(cadena);
		//sb.append("tres");

		cadena = cadena.replace("o", "e");
		cadena = cadena.toUpperCase();
	}

}
