package es.cj.datos;

import java.util.Scanner;

public class Ejercicio07 {

	// Pida un n�mero al usuario e indique cuantos n�meros primos hay entre 1 y el
	// n�mero
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int num = 0;
		do {
			System.out.println("N�: ");
			num = sc.nextInt();
		} while (num < 1);
		
		long inicio = System.currentTimeMillis();
		
		int contadorDePrimos = 0;
		for (int i = 2; i < num; i++) {
			if (esPrimo(i))
				contadorDePrimos++;
		}
		
		System.out.println("Primos entre 1 y " + num + ": " + contadorDePrimos);
		
		long fin = System.currentTimeMillis();
		
		System.out.println("Tiempo: " + (fin - inicio) + " ms");
		
		sc.close();
	}

	private static boolean esPrimo(int numero) {
		boolean primo = true;
		
		for (int j = 2; j < numero && primo; j++) {
			if (numero%j==0)
				primo = false;
		}	
		
		return primo;
	}

}
