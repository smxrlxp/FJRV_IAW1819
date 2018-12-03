package es.cj.main;

import java.util.Random;
import java.util.Scanner;

import es.cj.clases.Password;

public class Principal {

	private static Scanner sc = new Scanner(System.in);
	private static Password p[];

	public static void main(String[] args) {
		System.out.println("Nº de Passwords: ");
		int numpass = sc.nextInt();

		p = new Password[numpass];

		crearPassword();

		mostrarPasswords();

		comprobarFuerte();

		sc.close();
	}

	private static void comprobarFuerte() {
		for (int i = 0; i < p.length; i++) {
			if (p[i].esFuerte())
				System.out.println("La contraseña " + p[i].getContrasena() 
						+ " es fuerte");
			else
				System.out.println("La contraseña " + p[i].getContrasena() 
						+ " no es fuerte");
		}
	}

	private static void mostrarPasswords() {
		for (int i = 0; i < p.length; i++) {
			System.out.println(p[i].getContrasena());
		}
	}

	private static void crearPassword() {
		for (int i = 0; i < p.length; i++) {
			p[i] = new Password(new Random().nextInt(15) + 8);
		}
	}

}
