package es.cj.ejerciciosif.datos;

import java.util.Scanner;

public class Explicacion {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// Pedir dos n�meros y comprobar si son iguales
		System.out.println("N� 1: ");
		int num1 = sc.nextInt();
		
		System.out.println("N� 2: ");
		int num2 = sc.nextInt();
		
		if (num1 == num2) {
			System.out.println(num1 + " es igual a " + num2);
		} else {
			System.out.println(num1 + " no es igual a " + num2);
		}
		
		boolean condicion = num1 == num2;
		if (!condicion)
			System.out.println(num1 + " no es igual a " + num2);
		else
			System.out.println(num1 + " es igual a " + num2);
		
		// Pedir un n�mero e indicar si es positivo, negativo o cero
		if (num1 > 0)
			System.out.println(num1 + " es positivo");
		else if (num1 < 0)
			System.out.println(num1 + " es negativo");
		else
			System.out.println(num1 + " es cero");
		
		// Pedir 2 n�meros y decir si uno es m�ltiplo del otro
		if (num1 % num2 == 0)
			System.out.println(num1 + " es m�ltiplo de " + num2);
		else if (num2 % num1 == 0)
			System.out.println(num2 + " es m�ltiplo de " + num1);
		else
			System.out.println("No son m�ltiplos");
		
		// Pedir 2 n�meros e indicar cual es el mayor o si son iguales
		if (num1 > num2)
			System.out.println(num1 + " es mayor que " + num2);
		else if (num2 > num1)
			System.out.println(num2 + " es mayor que " + num1);
		else
			System.out.println(num1 + " es igual que " + num2);
		
		// Pedir 3 n�meros y mostrarlos ordenados
		System.out.println("N� 3: ");
		int num3 = sc.nextInt();
		if (num1 > num2 && num1 > num3) {
			if (num2 > num3)
				System.out.println("Orden: " + num1 + "," + num2 + "," + num3);
			else
				System.out.println("Orden: " + num1 + "," + num3 + "," + num2);
		} else if (num2 > num1 && num2 > num3) {
			if (num1 > num3)
				System.out.println("Orden: " + num2 + "," + num1 + "," + num3);
			else
				System.out.println("Orden: " + num2 + "," + num3 + "," + num1);
		} else if (num3 > num1 && num3 > num2) {
			if (num1 > num2)
				System.out.println("Orden: " + num3 + "," + num1 + "," + num2);
			else
				System.out.println("Orden: " + num3 + "," + num2 + "," + num1);
		} else
			System.out.println("Iguales");
		
		
		sc.close();
	}

}
