package es.cj.datos;

import java.util.Scanner;

public class Ejercicio09 {

	// Subcadena may�scula. Crea un programa en Java que solicite al usuario dos
	// cadenas de caracteres y que devuelva la primera cadena, pero transformando en
	// may�sculas la parte que coincide con la segunda cadena introducida. Por
	// ejemplo, si se introducen las cadenas �Este es mi amigo Juan� y �amigo�,
	// devolver� �Este es mi AMIGO Juan�.
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Frase: ");
		String frase = sc.nextLine();
		
		System.out.println("Palabra: ");
		String palabra = sc.next();
		
		System.out.println(frase.replaceAll(palabra, palabra.toUpperCase()));
		
		sc.close();
	}

}
