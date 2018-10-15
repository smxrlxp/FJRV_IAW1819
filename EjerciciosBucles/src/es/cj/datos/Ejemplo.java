package es.cj.datos;

import java.util.Scanner;

public class Ejemplo {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// do while
		int numero;
		do {
			System.out.println("Nº: ");
			numero = sc.nextInt();
		} while (numero < 0);
		
		// while
		while (numero >= 0) {
			System.out.println(numero);
			numero--;
		}
		
		// for
		for (int i = numero; i >= 0; i--) {
			System.out.println(i);
		}
		
		sc.close();
	}

}
