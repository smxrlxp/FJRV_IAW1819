package es.cj.datos;

import java.util.Scanner;

public class Ejercicio06 {

	private static String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-",
			".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..",
			"|" };

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Cadena: ");
		String cadena = sc.nextLine();

		cadena = cadena.toLowerCase();

		String cadenaMorse = pasarAMorse(cadena);
		System.out.println(cadenaMorse);

		System.out.println(pasarAESP(cadenaMorse));

		sc.close();
	}

	private static String pasarAESP(String cadenaMorse) {
		String cadenaesp = "";

		String[] palabras = cadenaMorse.split("   ");
		for (String pal : palabras) {
			String[] letras = pal.split(" ");
			// decodificar la letra
			for (String letMorse : letras) {
				int pos = buscarLetra(letMorse);
				if (pos != -1) {
					cadenaesp += String.valueOf((char) ('a' + pos));
				}
			}
			cadenaesp += " ";
		}
		cadenaesp = cadenaesp.trim();
		// for (int i = 0; i < palabras.length; i++) {
		//
		// }

		return cadenaesp;
	}

	private static int buscarLetra(String letMorse) {
		int pos = -1;

		boolean enc = false;
		for (int i = 0; i < morse.length && !enc; i++) {
			if (morse[i].equals(letMorse)) {
				enc = true;
				pos = i;
			}
		}

		return pos;
	}

	private static String pasarAMorse(String cadena) {
		String codigoMorse = "";

		for (int i = 0; i < cadena.length(); i++) {
			int c = cadena.charAt(i);
			if (c == 32) {
				// espacio
				codigoMorse = codigoMorse.trim() + "   ";
			} else {
				int pos = c - 'a';
				codigoMorse += morse[pos] + " ";
			}
		}

		return codigoMorse.trim();
	}

}
