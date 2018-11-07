package es.cj.ejerciciostablas.datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio09 {

	// Leer dos series de n números. Almacenarlos en 2 tablas. Ordena las tablas.
	// Fusiona las 2 tablas en una tabla de 2*n elementos de forma que esta tabla
	// esté ordenada
	
	private static int [] a;
	private static int [] b;
	private static int [] c;

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int num_elementos = 0;
		do {
			System.out.println("Nº: ");
			num_elementos = sc.nextInt();
		} while (num_elementos <= 0);
		
		// Inicializar a,b,c
		a = new int[num_elementos];
		b = new int[num_elementos];
		c = new int[num_elementos*2];
		
		rellenarYOrdenar();
		
		mostrar();
		
		fusionar();
		
		mostrar();
		
		sc.close();
	}

	private static void fusionar() {
		int i=0; // contador de a
		int j=0; // contador de b
		int h=0; // contador de c
		
		while (i<a.length && j<b.length) {
			if (a[i]<b[j]) {
				c[h] = a[i];
				i++;
			} else {
				c[h] = b[j];
				j++;
			}
			h++;
		}
		if (i == a.length) {
			while (j<b.length) {
				c[h] = b[j];
				j++;
				h++;
			}
		} else {
			while (i<a.length) {
				c[h] = a[i];
				i++;
				h++;
			}
		}
	}

	private static void mostrar() {
		System.out.println("-- A --");
		System.out.println(Arrays.toString(a));
		System.out.println("-- B --");
		System.out.println(Arrays.toString(b));
		System.out.println("-- C --");
		System.out.println(Arrays.toString(c));
	}

	private static void rellenarYOrdenar() {
		for (int i = 0; i < a.length; i++) {
			a[i] = new Random().nextInt(50) + 1;
			b[i] = new Random().nextInt(50) + 1;
		}
		Arrays.sort(a);
		Arrays.sort(b);
	}

}
