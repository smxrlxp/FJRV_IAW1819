package es.cj.datos;

import java.util.Scanner;

public class Ejercicio11 {

	// Leer una frase y encontrar la palabra de mayor longitud. El programa debe
	// imprimir la palabra como el número de caracteres de la misma. Además,
	// visualice cada palabra de la frase en columnas, seguida del número de letras
	// que tiene cada palabra.

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Frase: ");
		String frase = sc.nextLine();

		String[] palabras = frase.split(" ");
		int pos = mostrarPalabrasYContar(palabras);
		mostrarMayor(pos, palabras);

		sc.close();
	}

	private static void mostrarMayor(int pos, String[] palabras) {
		System.out.println("Palabra Mayor: " + palabras[pos] + " -> " + palabras[pos].length());
	}

	private static int mostrarPalabrasYContar(String[] palabras) {
		int pos = -1, i = 0;
		int mayor = 0;

		for (String p : palabras) {
			if (p.length() > mayor) {
				mayor = p.length();
				pos = i;
			}
			// Mostrar la palabra y el número de caracteres
			System.out.println(p + ": " + p.length());

			i++;
		}

		return pos;
	}

}
