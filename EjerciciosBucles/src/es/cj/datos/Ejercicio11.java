package es.cj.datos;

import java.util.Scanner;

public class Ejercicio11 {

	// Solicite un número y muestre el cuadrado del número
	// El cuadrado de un número se obtiene de sumar tantos números impares como
	// indique el número
	// El cuadrado de 1 es 1
	// El cuadrado de 2 es 4, es decir, 1 + 3
	// El cuadrado de 3 es 9, es decir, 1 + 3 + 5
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int num = 0;
		do {
			System.out.println("Nº: ");
			num = sc.nextInt();
		} while (num < 1);
		
		System.out.println("El cuadrado de " + num + " es: " + cuadradoNumero(num));
		
		sc.close();
	}

	private static long cuadradoNumero(int num) {
		int cuadrado = 0;
		int saltos = 1;
		
		for (int i = 0; i < num; i++) {
			cuadrado = cuadrado + saltos;
			saltos+=2;
		}
		
		return cuadrado;
	}

}
