package es.cj.datos;

import java.util.Scanner;

public class Ejercicio08 {

	// Cadena espejo. Crea un programa que reciba una cadena de caracteres y la
	// devuelva invertida con efecto espejo, esto es, se concatena a la palabra
	// original su inversa, compartiendo la última letra, que hará de espejo, por lo
	// que la palabra obtenida se lee igual hacia adelante que hacia atrás. Por
	// ejemplo, al introducir “teclado” devolverá “tecladodalcet” y al introducir
	// “goma” devolverá “gomamog”

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Palabra: ");
		String palabra = sc.next();

		// 1ª Forma
		StringBuffer sb = new StringBuffer(palabra.substring(0, palabra.length() - 1)).reverse();
		System.out.println(palabra + sb.toString());

		// 2ª Forma
		System.out.println("Palabra espejo de " + palabra + ": " + espejo(palabra));
		
		sc.close();
	}

	private static String espejo(String palabra) {
		String resultado = palabra;
		
		for (int i = palabra.length() - 2; i >= 0; i--) {
			resultado += palabra.charAt(i);
		}
		
		return resultado;
	}

}
