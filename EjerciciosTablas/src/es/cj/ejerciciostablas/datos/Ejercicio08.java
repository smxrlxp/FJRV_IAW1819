package es.cj.ejerciciostablas.datos;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio08 {

	// Cree una tabla de n elementos. Muestre la tabla ordenada
	
	private static Scanner sc = new Scanner(System.in);
	
	private static int [] tabla;
	
	public static void main(String[] args) {
		int tamanyo = 0;
		do {
			System.out.println("Nº de Elementos: ");
			tamanyo = sc.nextInt();
		} while (tamanyo <= 0);
		
		tabla = new int[tamanyo];
		
		rellenar();
		
		mostrar();
		
		ordenar();
		
		mostrar();
		
		sc.close();
	}

	private static void ordenar() {
		// ordenación por intercambio
		for (int i = 0; i < tabla.length - 1; i++) {
			for (int j = i+1; j < tabla.length; j++) {
				if (tabla[i] > tabla[j]) {
					int aux = tabla[i];
					tabla[i] = tabla[j];
					tabla[j] = aux;
				}
			}
		}
		
	}

	private static void mostrar() {
		System.out.println("-- TABLA --");
		for (int i = 0; i < tabla.length; i++) {
			System.out.print(tabla[i] + " ");
		}
		System.out.println("\n-----------");
	}

	private static void rellenar() {
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = new Random().nextInt(50) + 1;
		}
	}

}
