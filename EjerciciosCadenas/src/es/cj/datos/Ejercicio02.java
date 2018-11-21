package es.cj.datos;

import java.util.Scanner;

public class Ejercicio02 {

	// Realizar un programa que reciba dos cadenas de caracteres y cuente el número
	// de apariciones de la primera en la segunda

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Frase:");
		String frase = sc.nextLine();

		System.out.println("Palabra: ");
		String palabra = sc.next();

		System.out.println(
				"El número de ocurrencias de " 
						+ palabra + " en " + frase + " es: " 
						+ ocurrencias(frase, palabra));

		sc.close();
	}

	private static int ocurrencias(String frase, String palabra) {
		int contador = 0;
		
		int pos = frase.indexOf(palabra);
		if (pos != -1) {
			do {
				contador++;
				pos = frase.indexOf(palabra, pos + palabra.length());
			} while (pos != -1);
		}
		
		return contador;
	}

}
