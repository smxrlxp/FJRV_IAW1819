package es.cj.datos;

import java.util.Scanner;

public class Ejercicio07 {

	// Pida un número al usuario e indique cuántos números primos hay entre 1 y el
	// número

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int numero = 0;
		do {
			System.out.println("Nº: ");
			numero = sc.nextInt();
		} while (numero < 1);
		
		long inicio = System.currentTimeMillis();

		int contadorDePrimos = 0;
		for (int i = 2; i < numero; i++) {
			if (esPrimo(i))
				contadorDePrimos++;
		}

		long fin = System.currentTimeMillis();
		
		System.out.println("Primos entre 1 y " + numero + ": " + contadorDePrimos);

		System.out.println("Tiempo: " + (fin-inicio) + " ms");
		
		sc.close();
	}

	private static boolean esPrimo(int num) {
		boolean primo = true;

		for (int j = 2; j < num && primo; j++) {
			if (num % j == 0)
				primo = false;
		}

		return primo;
	}

}
