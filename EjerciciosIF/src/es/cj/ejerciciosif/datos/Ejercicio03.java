package es.cj.ejerciciosif.datos;

import java.util.Scanner;

public class Ejercicio03 {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente,
		// Suficiente, Bien...
		int nota;
		System.out.println("Introduzca una nota de 0 a 10");
		nota = sc.nextInt();
		if (nota > 10 || nota < 0)
			System.out.println("Nota no es Válida");
		else if (nota > 5)
			System.out.println("La nota es BIEN");
		else if (nota == 5)
			System.out.println("La nota es SUFICIENTE");
		else
			System.out.println("La nota es INSUFICIENTE");

	}

}
