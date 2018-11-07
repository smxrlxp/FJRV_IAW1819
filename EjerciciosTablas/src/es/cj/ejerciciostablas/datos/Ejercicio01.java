package es.cj.ejerciciostablas.datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio01 {

	// Leer n números enteros, guardarlos en la tabla y
	// mostrar la media de los positivos, media negativos y el número de ceros

	private static Scanner sc = new Scanner(System.in);
	
	private static int [] tabla;
	
	public static void main(String[] args) {
		System.out.println("Nº de elementos: ");
		int tamanyo = sc.nextInt();
		
		tabla = new int[tamanyo];
		
		rellenaTabla();
		mostrarTabla();
		calcularDatos();
		
		sc.close();
	}

	private static void calcularDatos() {
		int contCeros = 0, contPos = 0, contNeg = 0;
		int sumaPos = 0, sumaNeg = 0;
		for (int i = 0; i < tabla.length; i++) {
			if (tabla[i] > 0) {
				contPos++;
				sumaPos+=tabla[i];
			} else if (tabla[i] < 0) {
				contNeg++;
				sumaNeg+=tabla[i];
			} else {
				contCeros++;
			}
		}
		
		System.out.println("Nº de Ceros: " + contCeros);
		if (contPos > 0)
			System.out.println("Media de Positivos: " + ((double)sumaPos/(double)contPos));
		if (contNeg > 0)
			System.out.println("Media de Negativos: " + ((double)sumaNeg/(double)contNeg));
	}

	private static void mostrarTabla() {
		for (int i = 0; i < tabla.length; i++) {
			System.out.print(tabla[i] + " ");
		}
		// System.out.println(Arrays.toString(tabla));
	}

	private static void rellenaTabla() {
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = generaAleatorioYNegativo(-100, 100);
		}
	}

	private static int generaAleatorioYNegativo(int min, int max) {
		return new Random().nextInt(max - min + 1) + min;
	}

}
