package es.cj.datos;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio10 {

	// Crea una función que reciba como parámetro una cadena de texto con una frase
	// y dicha función tendrá que devolver dicha cadena pero invirtiendo la primera
	// y la última palabra.Desde la función principal tendrás que pedir al usuario
	// que introduzca una frase y le mostrarás dicha frase con la primera y última
	// palabra intercambiada. Ejemplo: Introduzca una frase:> El cielo tiene nubes
	// negras.Resultado: negras cielo tiene nubes El

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Frase: ");
		String frase = sc.nextLine();
		
		String resultado = intercambiar(frase);
		System.out.println(resultado);
		
		sc.close();
	}

	private static String intercambiar(String frase) {
		String [] palabras = frase.split(" ");
		String aux = palabras[0];
		palabras[0] = palabras[palabras.length - 1];
		palabras[palabras.length - 1] = aux;
		
		String res = "";
		for (String pal : palabras) {
			res += pal + " ";
		}
		
		//return Arrays.toString(palabras);
		return res;
	}

}
