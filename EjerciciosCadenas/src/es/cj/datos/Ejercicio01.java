package es.cj.datos;

public class Ejercicio01 {

	public static void main(String[] args) {
		String palabra = "colegioconcoche";

		// Muestra el string en May�sculas
		System.out.println(palabra.toUpperCase());

		// Muestra el string en Min�sculas
		System.out.println(palabra.toLowerCase());

		// Mostrar los 2 primeros caracteres y los 2 �ltimos
		if (palabra.length() >= 2) {
			System.out.println(palabra.substring(0, 2));
			System.out.println(palabra.substring(palabra.length() - 2));
		}

		// N�mero de veces que aparece el �ltimo car�cter
		int contador = 0;
		for (int i = 0; i < palabra.length(); i++) {
			if (String.valueOf(palabra.charAt(i))
					.equalsIgnoreCase(String.valueOf(palabra.charAt(palabra.length() - 1)))) {
				contador++;
			}
		}
		System.out.println("N� de Veces de " + palabra.charAt(palabra.length() - 1) + ": " + contador);

		// Reemplazar todas las veces que se repite el primer caracter por el primer
		// caracter en may�scula
		palabra = palabra.replaceAll(palabra.substring(0, 1), palabra.substring(0, 1).toUpperCase());
		System.out.println(palabra);
		
		StringBuffer sb = new StringBuffer(palabra);
		
		// A�adir por el principio y por el final la cadena "***"
		sb.insert(0, "***");
		sb.append("***");
		System.out.println(sb);
	}

}
