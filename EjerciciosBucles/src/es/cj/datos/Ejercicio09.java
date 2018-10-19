package es.cj.datos;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio09 {

	// Leer por teclado una serie de n números. La aplicación debe indicarnos si los
	// números están ordenados de forma creciente, decreciente o si no están ordenados

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int cantidad = 0;
		do {
			System.out.println("Cantidad: ");
			cantidad = sc.nextInt();
		} while (cantidad < 0);
		
		// 1: Creciente, -1: Decreciente, 0: Desordenados
		int orden = comprobarOrden(cantidad);
		
		switch (orden) {
		case 1:
			System.out.println("CRECIENTE");
			break;
		case -1:
			System.out.println("DECRECIENTE");
			break;
		case 0:
			System.out.println("DESORDENADOS");
			break;
		default:
			System.out.println("ERROR");
			break;
		}
		
		sc.close();
	}

	private static int comprobarOrden(int cantidad) {
		int orden = 0;
		
		boolean creciente = false, decreciente = false;
		int numero = 0, auxiliar = 0;
		
		for (int i = 0; i < cantidad; i++) {
			numero = new Random().nextInt(100);
			System.out.print(numero + " ");
			if (i == 0) {
				auxiliar = numero;
			} else {
				if (numero > auxiliar)
					creciente = true;
				else if (numero < auxiliar)
					decreciente = true;
				auxiliar = numero;
			}
		}
		if (creciente && !decreciente)
			orden = 1;
		else if (!creciente && decreciente)
			orden = -1;		
		
		return orden;
	}

}
