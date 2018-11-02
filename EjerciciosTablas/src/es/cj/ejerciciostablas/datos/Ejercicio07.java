package es.cj.ejerciciostablas.datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio07 {

	// Se pretende desarrollar una aplicaci�n que nos ayude a gestionar las notas de
	// un centro educativo. Cada clase est� compuesta por 10 alumnos. Se pide leer
	// las notas del primer, segundo y tercer trimestre almacen�ndolas en una tabla.
	// Debemos mostrar la nota media final de cada alumno y de cada clase en cada
	// trimestre. Por �ltimo, desarrolle un m�todo que se le pase un n�mero de
	// alumno y devuelve la media final de ese alumno

	// Datos de alumnos (notas)
	private static int alumnos[][];
	
	// Medias por trimestres
	private static double mediasT[];
	
	// Medias por alumnos
	private static double mediasA[];
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int numAlumnos = 0;
		do {
			System.out.println("N� Alumnos: ");
			numAlumnos = sc.nextInt();
		} while (numAlumnos <= 0);
		
		int trimestres = 0;
		do {
			System.out.println("N� Trimestres: ");
			trimestres = sc.nextInt();
		} while (trimestres <= 0);
		
		// Datos de alumnos (notas)
		alumnos = new int[numAlumnos][trimestres];
		
		// Medias por trimestres
		mediasT = new double [alumnos[0].length];
		
		// Medias por alumnos
		mediasA = new double [alumnos.length];
		
		leerNotas();
		
		mostrarNotas();

		calcularMedias();
		
		mostrarMedias();
		
		sc.close();
	}

	private static void mostrarMedias() {
		System.out.println("--- MEDIAS ---");
		System.out.println(Arrays.toString(mediasA));
		System.out.println(Arrays.toString(mediasT));
	}

	private static void mostrarNotas() {
		System.out.println("--- NOTAS ---");
		for (int i = 0; i < alumnos.length; i++) {
			for (int j = 0; j < alumnos[i].length; j++) {
				System.out.print(alumnos[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static void calcularMedias() {
		for (int i = 0; i < alumnos.length; i++) {
			for (int j = 0; j < alumnos[i].length; j++) {
				mediasT[j] += alumnos[i][j];
				mediasA[i] += alumnos[i][j];
			}
			mediasA[i] = Math.rint((mediasA[i] / mediasT.length)*100)/100;
		}
		calcularMediasTrimestre();
	}

	private static void calcularMediasTrimestre() {
		for (int i = 0; i < mediasT.length; i++) {
			mediasT[i] = Math.rint((mediasT[i] / mediasA.length)*100)/100;
		}
	}

	private static void leerNotas() {
		for (int i = 0; i < alumnos.length; i++) {
			for (int j = 0; j < alumnos[i].length; j++) {
				alumnos[i][j] = new Random().nextInt(11);
			}
		}
	}

}
