package es.cj.datos;

import java.util.Scanner;

public class Ejercicio07 {

	// 1. Una palabra se dice abecedaria si las letras que la forman se encuentran
	// en orden alfabético si son leídas de izquierda a derecha. Por ejemplo, las
	// siguientes palabras cumplen con ser abecedarias: amor, filo, chintz, luz,
	// dinos. Escriba un método que permita determinar si una palabra es abecedaria.
	// El método debe recibir un string como parámetro y retornar verdadero en caso
	// que la palabra sea abecedaria, y falso en caso contrario.

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Palabra: ");
		String palabra = sc.next();
		
		if (esAbecedaria(palabra))
			System.out.println(palabra + " es abecedaria");
		else
			System.out.println(palabra + " no es abecedaria");
		
		sc.close();
	}

	private static boolean esAbecedaria(String palabra) {
		boolean abece = true;
		
		for (int i = 0; i < palabra.length() - 1 && abece; i++) {
			if (palabra.charAt(i) > palabra.charAt(i+1))
				abece = false;
		}
		
		return abece;
	}

}
