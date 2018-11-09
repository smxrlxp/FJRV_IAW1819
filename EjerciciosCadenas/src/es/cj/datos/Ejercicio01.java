package es.cj.datos;

public class Ejercicio01 {

	public static void main(String[] args) {
		String palabra = "CiUdnDjcRdcN";
		
		// MAY�SCULAS
		System.out.println(palabra.toUpperCase());
		
		// MIN�SCULAS
		System.out.println(palabra.toLowerCase());
		
		// Mostrar los 2 primeros y los 2 �ltimos
		if (palabra.length() >= 2) {
			System.out.println(palabra.substring(0, 2));
			System.out.println(
					palabra.substring(palabra.length()-2));
		}
		
		// N�mero de veces que se repite el �ltimo caracter
		String ultimo = palabra.substring(palabra.length()-1);
		System.out.println(ultimo);
		int contador = 0;
		for (int i = 0; i < palabra.length(); i++) {
			if (palabra.substring(i, i+1).equalsIgnoreCase(ultimo))
				contador++;
		}
		
		System.out.println(contador);
		
		// reemplazar todas las veces del primer caracter por el primer
		// caracter en may�sculas
		String primero = palabra.substring(0, 1);
		palabra = palabra.replaceAll(primero.toLowerCase(), primero.toUpperCase());
		System.out.println(palabra);
		
		// A�adir por el principio y por el final la cadena "***"
		//palabra = "***" + palabra + "***";
		
		StringBuffer sb = new StringBuffer(palabra);
		sb.append("***");
		sb.insert(0, "***");
		System.out.println(sb.toString());
	}

}




