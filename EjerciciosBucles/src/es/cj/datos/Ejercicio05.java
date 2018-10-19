package es.cj.datos;

import java.util.Scanner;

public class Ejercicio05 {

	// Pedir un número y calcular su factorial
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Nº: ");
		int num = sc.nextInt();
		
		System.out.println("El factorial de " + num + " es: " + calcularFactorial(num));
		
		sc.close();
	}

	
	public static long calcularFactorial(int num) {
		long factorial = 1;
		
		for (int i = num; i > 0; i--) {
			factorial = factorial * i;
		}
		
		return factorial;
	}
}
