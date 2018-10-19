package es.cj.datos;

import java.util.Scanner;

public class Ejercicio10 {

	// Dados dos números introducidos por teclado, indique si son amigos o no. Dos
	// números son amigos si la suma de los divisores propios de uno de ellos es
	// igual al otro (la unidad se considera divisor propio, pero no lo es el mismo
	// número)
	
	// 220 y 284
	// 284 = 1 + 2 + 4 + 71 + 142 = 220
	// 220 = 1 + 2 + 4 + 5 + 10 + 11 + 20 + 22 + 44 + 55 + 110 = 284

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Nº 1: ");
		int num1 = sc.nextInt();
		
		System.out.println("Nº 2: ");
		int num2 = sc.nextInt();
		
		if (sonAmigos(num1, num2))
			System.out.println(num1 + " es amigo de " + num2);
		else
			System.out.println(num1 + " no es amigo de " + num2);
		
		
		sc.close();
	}

	private static boolean sonAmigos(int numero1, int numero2) {
		boolean amigos = false;
		if (sumaDivisores(numero1) == numero2 && sumaDivisores(numero2) == numero1)
			amigos = true;
		
		return amigos;
	}

	private static int sumaDivisores(int numero) {
		int suma = 0;
		
		for (int i = 1; i < numero; i++) {
			if (numero%i==0)
				suma += i;
		}
		
		return suma;
	}

}
