package es.cj.ejerciciostablas.datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio04 {

	// Leer 2 tablas de n números y mezclarla en una tercera tabla de la siguiente
	// forma:
	// 1º de A, 1º de B, 2º de A, 2º de B, 3º de A, 3º de B,...
	
	private static Scanner sc = new Scanner(System.in);
	
	private static int [] numerosA;
	private static int [] numerosB;
	private static int [] numerosAB;

	public static void main(String[] args) {
		int tamanyo;
		do {
			System.out.println("Nº de Elementos: ");
			tamanyo = sc.nextInt();
		} while (tamanyo <= 0);
		
		numerosA = new int[tamanyo];
		numerosB = new int[tamanyo];
		numerosAB = new int[tamanyo*2];
		
		iniciarTablaAyB();
		
		crearTablaAB();
		
		mostrarTablas();
		
		sc.close();
	}

	private static void mostrarTablas() {
		System.out.println("A: " + Arrays.toString(numerosA));
		System.out.println("B: " + Arrays.toString(numerosB));
		System.out.println("AB: " + Arrays.toString(numerosAB));
	}

	private static void crearTablaAB() {
		int j = 0;
		for (int i = 0; i < numerosA.length; i++) {
			numerosAB[j] = numerosA[i];
			j++;
			numerosAB[j] = numerosB[i];
			j++;
		}
	}

	private static void iniciarTablaAyB() {
		for (int i = 0; i < numerosA.length; i++) {
			numerosA[i] = new Random().nextInt(50);
			numerosB[i] = new Random().nextInt(50);
		}
	}

}
