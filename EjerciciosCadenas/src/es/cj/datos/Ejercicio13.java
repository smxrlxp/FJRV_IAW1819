package es.cj.datos;

import java.util.Scanner;

public class Ejercicio13 {

	// Escriba un programa que calcule la frecuencia de aparición de las vocales de
	// un texto proporcionado por el usuario. Esta solución se debe presentar en forma
	// de histograma, por ejmplo:
	// a 15 ***************
	// e 8 ********

	private static Scanner sc = new Scanner(System.in);
	
	private static char vocales [] = {'a','e','i','o','u'};
	private static int contadores [] = new int[5];
	
	public static void main(String[] args) {
		System.out.println("Texto: ");
		String texto = sc.nextLine();
		
		crearHistograma(texto);
		mostrarHistograma();
		
		sc.close();
	}

	private static void mostrarHistograma() {
		for (int i = 0; i < contadores.length; i++) {
			System.out.println(vocales[i] + " " 
					+ contadores[i] + " " + mostrarComodin(contadores[i]));
		}
	}

	private static String mostrarComodin(int tam) {
		String cadena = "";
		for (int i = 0; i < tam; i++) {
			cadena += "*";
		}
		return cadena;
	}

	private static void crearHistograma(String texto) {
		for (int i = 0; i < texto.length(); i++) {
			char c = texto.charAt(i);
			
			int pos = buscaVocal(c);
			if (pos != -1) {
				contadores[pos]++;
			}
		}
	}

	private static int buscaVocal(char c) {
		int pos = -1;
		
		for (int i = 0; i < vocales.length && pos == -1; i++) {
			if (vocales[i] == c)
				pos = i;
		}
		
		return pos;
	}

}
