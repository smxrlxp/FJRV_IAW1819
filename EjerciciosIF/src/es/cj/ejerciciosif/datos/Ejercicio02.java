package es.cj.ejerciciosif.datos;

import java.util.Scanner;

public class Ejercicio02 {

	// Pedir al usuario día, mes y año y comprobar que la fecha es correcta
	// incluidos bisiestos

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Día: ");
		int dia = sc.nextInt();

		System.out.println("Mes: ");
		int mes = sc.nextInt();

		System.out.println("Año: ");
		int anyo = sc.nextInt();

		boolean fechaCorrecta = false;

		if (anyo >= 0) {
			boolean esBisiesto = ((anyo % 4 == 0 && anyo % 100 != 0) 
					|| (anyo % 400 == 0));
			if (mes >= 1 && mes <= 12) {
				switch (mes) {
				case 2:
					if (dia >= 1 && dia <= 29 && esBisiesto)
						fechaCorrecta = true;
					else if (dia >= 1 && dia <= 28 && !esBisiesto)
						fechaCorrecta = true;
					break;
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					if (dia >= 1 && dia <= 31)
						fechaCorrecta = true;
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					if (dia >= 1 && dia <= 30)
						fechaCorrecta = true;
					break;
				default:
					break;
				}
			}
		}
		
		if (fechaCorrecta)
			System.out.println("Fecha correcta: " + dia + "/" + mes + "/" + anyo);
		else
			System.out.println("Fecha incorrecta: " + dia + "/" + mes + "/" + anyo);

		sc.close();
	}

}
