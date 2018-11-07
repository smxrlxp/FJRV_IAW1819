package es.cj.ejerciciostablas.datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio02 {

	// Leer n n�meros ordenados crecientemente. Pedir al usuario un n�mero y
	// buscarlo en la tabla. Se debe mostrar la posici�n en la que se encuentra. Si
	// no est�, indicarlo con un mensaje

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("N� de Elementos: ");
		int tamanyo = sc.nextInt();

		int[] numeros = new int[tamanyo];

		inicializarTabla(numeros);

		mostrarTabla(numeros);

		System.out.println("N� a Buscar: ");
		int num = sc.nextInt();

		int posicion = buscarEnTabla(numeros, num);
		if (posicion != -1)
			System.out.println(num + " est� en la posici�n " + posicion);
		else
			System.out.println(num + " no se encuentra en la tabla de n�meros");

		System.out.println("Posiciones de " + num + ": " + buscarTodasEnTabla(numeros, num));
	}

	private static String buscarTodasEnTabla(int[] numeros, int num) {
		String posiciones = "";
		
		for (int i = 0; i < numeros.length && numeros[i] <= num; i++) {
			if (numeros[i] == num)
				posiciones += i + " ";
		}
		
		return posiciones;
	}

	private static int buscarEnTabla(int[] numeros, int num) {
		int posicion = -1;

		for (int i = 0; i < numeros.length && numeros[i] <= num && posicion == -1; i++) {
			if (numeros[i] == num)
				posicion = i;
		}

		return posicion;
	}

	private static void mostrarTabla(int[] numeros) {
		for (int i : numeros) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println(Arrays.toString(numeros));
	}

	private static void inicializarTabla(int[] numeros) {
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = new Random().nextInt(50);
		}

		Arrays.sort(numeros);
	}

}
