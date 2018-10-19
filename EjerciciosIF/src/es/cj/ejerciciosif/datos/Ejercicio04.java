package es.cj.ejerciciosif.datos;

import java.util.Scanner;

public class Ejercicio04 {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("dia:");
		int dia = sc.nextInt();

		System.out.println("mes:");
		int mes = sc.nextInt();

		System.out.println("año:");
		int anno = sc.nextInt();

		if ((dia <= 31 && dia > 0) && (mes <= 12 && mes > 0) && (anno > 0))
			if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && (dia > 31))
				System.out.println("No es correcto");
			else if ((mes == 2) && (dia > 28))
				System.out.println("No es correcto");
			else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia > 30))
				System.out.println("No es correcto");
			else
				System.out.println("Es correcto");
		else
			System.out.println("No es correcta la fecha");

		sc.close();
	}
}
