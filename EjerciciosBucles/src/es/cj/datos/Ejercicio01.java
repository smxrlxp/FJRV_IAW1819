package es.cj.datos;

import java.util.Scanner;

public class Ejercicio01 {

	// Debe solicitar un n�mero positivo al usuario
	// Muestre todos los n�meros desde el solicitado hasta el 0
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int num;
		do {
			System.out.println("N�: ");
			num = sc.nextInt();
		} while (num < 0);
		
		while (num > 0) {
			System.out.println(num);
			num--;
		}
		
		
		sc.close();
	}

}
