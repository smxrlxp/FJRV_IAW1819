package es.cj.datos;

import java.util.Scanner;

public class Ejercicio06 {

	// Diseñe una aplicación que muestre las tablas de multiplicar del 1 al 10
	// Además, solicite al usuario que tabla quiere mostrar

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Mostrar todas las tablas
		for (int i = 1; i <= 10; i++) {
			mostrarTablaMultiplicar(i);
		}
		
		// Pedir una tabla en particular
		int num = 0;
		do {
			System.out.println("Nº: ");
			num = sc.nextInt();
		} while (num < 1 || num > 10);

		mostrarTablaMultiplicar(num);

		sc.close();
	}

	
	public static void mostrarTablaMultiplicar(int num) {
		System.out.println("Tabla del " + num);
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " x " + i + " = " + (num * i));
		}
	}
}
