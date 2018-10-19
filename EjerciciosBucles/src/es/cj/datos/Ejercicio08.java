package es.cj.datos;

import java.util.Scanner;

public class Ejercicio08 {

	// Pida al usuario n números y muéstrelos ordenados
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int cantidad = 0;
		do {
			System.out.println("Introduzca Tamaño: ");
			cantidad = sc.nextInt();
		} while (cantidad < 0);
		
		
		
		
		
		
		sc.close();
	}

}
