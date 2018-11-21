package es.cj.datos;

import java.util.Scanner;

public class Ejercicio12 {

	// Recibir una cadena de caracteres con formato de correo electrónico. Hacer una
	// función que devuelva un boolean indicando si el formato de email es correcto

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Email: ");
		String email = sc.next();

		if (emailCorrecto(email))
			System.out.println(email + " es correcto");
		else
			System.out.println(email + " no es correcto");

		sc.close();
	}

	private static boolean emailCorrecto(String email) {
		if (email.length() > 0) {
			int pos = email.indexOf('@');
			if (pos != -1 && pos != 0) {
				int posPunto = email.indexOf('.', pos);
				if ((posPunto != -1) 
						&& (posPunto != email.length() - 1) 
						&& (pos + 1 != posPunto))
					return true;
			}
		}

		return false;
	}

}
