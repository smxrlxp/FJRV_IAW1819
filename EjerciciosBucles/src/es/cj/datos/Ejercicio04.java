package es.cj.datos;

import java.util.Scanner;

public class Ejercicio04 {

	// Escribir un programa que lea un n�mero desde el teclado y realice la suma de
	// los 100 n�meros siguientes, mostrando el resultado en pantalla

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("N�: ");
		int num = sc.nextInt();

		long suma = 0;

		for (int i = num + 1; i <= (100 + num); i++) {
			//System.out.println(i);
			suma += i;
		}
		System.out.println("La suma es: " + suma);
		
		suma = 0;
		
		int contador = 0;
		int i = num + 1;
		while (contador < 100) {
			//System.out.println(i);
			suma += i;
			i++;
			
			contador++;
		}
		System.out.println("La suma es: " + suma);

		sc.close();
	}

}
