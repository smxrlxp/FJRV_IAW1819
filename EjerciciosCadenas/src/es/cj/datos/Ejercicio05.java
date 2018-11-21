package es.cj.datos;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio05 {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Cadena: ");
		String cadena = sc.next();

		int codigo = new Random().nextInt(11);
		
		cadena = cadena.toUpperCase();
		
		StringBuffer cadenaCifrada = new StringBuffer();
		
		for (int i = 0; i < cadena.length(); i++) {
			int car = cadena.charAt(i);
			
			car += codigo;
			
			if (car > 'Z') {
				car = car - 'Z';
				car = car + '@';
			}
			
			cadenaCifrada.append((char)car);
		}
		System.out.println(codigo);
		System.out.println(cadena);
		System.out.println(cadenaCifrada.toString());
		
		sc.close();
	}

}
