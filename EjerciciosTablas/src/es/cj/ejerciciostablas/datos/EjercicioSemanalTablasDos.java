package es.cj.ejerciciostablas.datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class EjercicioSemanalTablasDos {

	// Rellena una tabla de 10 números (valores aleatorios del 1 al 6). Realiza una
	// función que devuelva el número que más se repite

	private static int [] numeros;
	private static int [] contadores;
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int num = 0;
		do {
			System.out.println("¿Cuántos números? ");
			num = sc.nextInt();
		} while (num <= 0);
		
		numeros = new int [num];
		
		int max = 0;
		do {
			System.out.println("¿Valor máximo? ");
			max = sc.nextInt();
		} while (max <= 1);
		
		contadores = new int [max + 1];
		
		rellenarNumeros(max);
		
		mostrarNumeros();
		
		calcularContadores();
		
		mostrarContadores();
		
		System.out.println("El que más se repite es: " + mostrarMasRepetido());
		
		System.out.println("Números que se repiten: " + numerosRepetidos());
		
		sc.close();
	}

	private static String numerosRepetidos() {
		String numerosRepes = "";
		
		for (int i = 0; i < contadores.length; i++) {
			if (contadores[i]!=0)
				numerosRepes += i + "(" + contadores[i] + ") ";
		}
		
		return numerosRepes;
	}

	private static void mostrarContadores() {
		System.out.println(Arrays.toString(contadores));
	}

	private static int mostrarMasRepetido() {
		int mayor = 0, pos = 0;
		for (int i = 0; i < contadores.length; i++) {
			if (contadores[i] > mayor) {
				mayor = contadores[i];
				pos = i;
			}
		}		
		
		return pos;
	}

	private static void mostrarNumeros() {
		System.out.println(Arrays.toString(numeros));
	}

	private static void calcularContadores() {
		for (int i = 0; i < numeros.length; i++) {
			contadores[numeros[i]]++;
		}
	}

	private static void rellenarNumeros(int max) {
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = new Random().nextInt(max) + 1;
		}
	}

}
