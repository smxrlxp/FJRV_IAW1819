package es.cj.main;

import java.util.Scanner;

import es.cj.clases.Nif;

public class Principal {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int dni;
		do {
			System.out.println("DNI: ");
			dni = sc.nextInt();
		} while (String.valueOf(dni).length() != 8);
		
		Nif n = new Nif(dni);
		
		System.out.println(n);
		
		mostrarLetras();
		
		sc.close();
	}

	private static void mostrarLetras() {
		int dni = 0;
		do {
			System.out.println("DNI: ");
			dni = sc.nextInt();
			if (String.valueOf(dni).length()==8)
				System.out.println(dni + "-" + Nif.leer(dni));
			else
				System.out.println("DNI Incorrecto");
		} while (dni != 0);
	}

}
