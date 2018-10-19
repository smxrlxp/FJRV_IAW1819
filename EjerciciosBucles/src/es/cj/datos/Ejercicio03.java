package es.cj.datos;

import java.util.Scanner;

public class Ejercicio03 {

	// Programa que muestre y calcule el producto de los n primeros números impares
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		long producto = 1;
		
		System.out.println("Indique el nº de impares: ");
		int num_impares = sc.nextInt();
		int i = num_impares;
		
		int impar = 1;
		while (num_impares > 0) {
			System.out.println(impar);
			
			producto = producto * impar;
			
			impar+=2;
						
			num_impares--;
		}
		
		System.out.println("Producto de los " + i + " primeros impares: " + producto);
		
//		for (int i = num_impares; i > 0; i--) {
//			System.out.println(impar);
//			
//			producto *= impar;
//			
//			impar+=2;
//		}
		
		sc.close();
	}

}
