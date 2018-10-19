package es.cj.datos;

import java.util.Scanner;

public class Ejercicio02 {

	// Pedir 5 números. Mostrar la media de los números positivos,
	// la media de los números negativos y la cantidad de ceros
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		double sumaP = 0, sumaN = 0;
		int contP = 0, contN = 0, contCeros = 0, num;
		
		int contadorVueltas = 1;
		while (contadorVueltas <= 10) {
			System.out.println("Nº " + contadorVueltas + ": ");
			num = sc.nextInt();
			
			if (num > 0) {
				// Es positivo
				sumaP += num;
				contP++;
			} else if (num < 0) {
				// Es negativo
				sumaN += num;
				contN++;
			} else {
				// Es Cero
				contCeros++;
			}
			contadorVueltas++;
		}
		if (contP > 0)
			System.out.println("Media de Positivos: " + (sumaP/contP));
		else
			System.out.println("No hay positivos");
		
		if (contN > 0)
			System.out.println("Media de Negativos: " + (sumaN/contN));
		else
			System.out.println("No hay negativos");
		
		System.out.println("Nº de Ceros: " + contCeros);
		
		sc.close();

	}

}
