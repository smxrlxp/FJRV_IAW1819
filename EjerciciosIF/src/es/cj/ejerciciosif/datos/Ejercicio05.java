package es.cj.ejerciciosif.datos;

import java.util.Scanner;

public class Ejercicio05 {
	private static Scanner sc = new Scanner(System.in);
	// Pedir el d�a, mes y a�o de una fecha correcta y mostrar la fecha del d�a
	// siguiente. suponer que todos los meses tienen 30 d�as.

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int anno, mes, dia;
		System.out.println("Introduzca el a�o que desee: ");
		anno = sc.nextInt();
		System.out.println("Introduzca el mes que desee: ");
		mes = sc.nextInt();
		System.out.println("Introduzca el dia que desee: ");
		dia = sc.nextInt();

		if (anno < 1 || mes < 1 || mes > 12 || dia > 30 || dia < 1)
			System.out.println("La fecha es incorrecta ");
		else {
			if (mes == 12 && dia == 30) {
				mes = 1;
				dia = 1;
				anno = anno + 1;

			} else {
				if (dia == 30) {
					dia = 1;
					mes = mes + 1;
				} else {
					dia = dia + 1;
				}
			}
			System.out.println("Ma�ana ser� " + dia + " del " + mes + " del " + anno);
		}

	}

}
