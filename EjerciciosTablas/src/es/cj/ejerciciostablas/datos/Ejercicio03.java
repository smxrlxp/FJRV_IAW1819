package es.cj.ejerciciostablas.datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio03 {

	// leer tabla de n números y guardar en otra los pares y en otra los impares

	private static Scanner sc = new Scanner(System.in);
	
	private static int [] numeros;
	private static int [] pares;
	private static int [] impares;
	
	private static int contPares = 0;
	private static int contImpares = 0;
	
	public static void main(String[] args) {
		int tamanyo;
		do {
			System.out.println("Nº de elementos: ");
			tamanyo = sc.nextInt();
		} while (tamanyo <= 0);
		
		numeros = new int [tamanyo];
		pares = new int [tamanyo];
		impares = new int [tamanyo];
		
		inicializarTablaNumeros();
		
		dividirParesImpares();
		
		mostrarResultado();
		
		sc.close();
	}

	private static void mostrarResultado() {
		System.out.println(Arrays.toString(numeros));
//		System.out.println(Arrays.toString(pares));
//		System.out.println(Arrays.toString(impares));
		
		String cadPares = "", cadImpares = "";
		
		for (int i = 0; i < numeros.length; i++) {
			if (i < contPares)
				cadPares += pares[i] + " ";
			if (i < contImpares)
				cadImpares += impares[i] + " ";
		}
		System.out.println(cadPares);
		System.out.println(cadImpares);
	}

	private static void dividirParesImpares() {		
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i]%2 == 0) {
				pares[contPares] = numeros[i];
				contPares++;
			} else {
				impares[contImpares] = numeros[i];
				contImpares++;
			}
		}
	}

	private static void inicializarTablaNumeros() {
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = new Random().nextInt(50) + 1;
		}
	}

}
