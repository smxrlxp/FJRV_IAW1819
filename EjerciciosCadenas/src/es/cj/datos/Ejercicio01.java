package es.cj.datos;

public class Ejercicio01 {

	public static void main(String[] args) {
		String palabra = "colegioconcoche";

		// Muestra el string en Mayúsculas
		System.out.println(palabra.toUpperCase());

		// Muestra el string en Minúsculas
		System.out.println(palabra.toLowerCase());

		// Mostrar los 2 primeros caracteres y los 2 últimos
		if (palabra.length() >= 2) {
			System.out.println(palabra.substring(0, 2));
			System.out.println(palabra.substring(palabra.length() - 2));
		}

		// Número de veces que aparece el último carácter
		int contador = 0;
		for (int i = 0; i < palabra.length(); i++) {
			if (String.valueOf(palabra.charAt(i))
					.equalsIgnoreCase(String.valueOf(palabra.charAt(palabra.length() - 1)))) {
				contador++;
			}
		}
		System.out.println("Nº de Veces de " + palabra.charAt(palabra.length() - 1) + ": " + contador);

		// Reemplazar todas las veces que se repite el primer caracter por el primer
		// caracter en mayúscula
		palabra = palabra.replaceAll(palabra.substring(0, 1), palabra.substring(0, 1).toUpperCase());
		System.out.println(palabra);
		
		StringBuffer sb = new StringBuffer(palabra);
		
		// Añadir por el principio y por el final la cadena "***"
		sb.insert(0, "***");
		sb.append("***");
		System.out.println(sb);
	}

}
