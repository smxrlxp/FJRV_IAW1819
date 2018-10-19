package es.cj.ejerciciosif.datos;

import java.util.Scanner;

public class Ejercicio08 {

	// Usted ha sido contratado por FedEx para crear un programa que calcule el
	// costo de env�o de paquetes. El problema reside en que hay m�ltiples
	// opciones de env�o, es por esto que su programa debe preguntar por las
	// opciones escogidas y de acuerdo a esto calcular el costo. A continuaci�n
	// se detallan los costos junto con el m�todo escogido:
	// Se puede enviar el paquete de dos maneras, por avi�n con costo de 2000� o
	// barco con costo 1000�.
	// En caso de enviarse por barco se puede escoger env�o r�pido con costo
	// �500 o normal con costo 250�.
	// Adem�s se puede contratar un seguro contra p�rdidas, en caso de escogerlo
	// esto suma 1000� al costo.
	// Por �ltimo, existe la terrible posibilidad de pagar impuestos en aduana,
	// el impuesto s�lo se paga si es que se escoge ir en avi�n y el costo es
	// mayor que 3000� o si se escoge ir en barco y el costo es mayor a 1250�.
	// En caso de pagar impuesto el costo aumenta en 100�.

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		double costo;

		System.out.println("-- MEN� DE OPCIONES --");
		System.out.println("1. Avi�n");
		System.out.println("2. Barco (Por defecto)");
		int opcionTransporte = sc.nextInt();

		switch (opcionTransporte) {
		case 1: // Avi�n
			costo = 2000;
			break;
		default: // Barco
			costo = 1000;

			System.out.println("-- MEN� ENV�O --");
			System.out.println("1. R�pido");
			System.out.println("2. Normal (Por defecto)");
			int opcionEnvio = sc.nextInt();

			switch (opcionEnvio) {
			case 1: // R�pido
				costo += 500;
				break;

			default: // Normal
				costo += 250;
				break;
			}

			break;
		}

		System.out.println("�Desea seguro contra p�rdidas? (S/N)");
		String respuesta = sc.next();
		if (respuesta.equalsIgnoreCase("s")) {
			costo += 1000;
		}

		// el impuesto s�lo se paga si es que se escoge ir en avi�n y el costo
		// es
		// mayor que 3000� o si se escoge ir en barco y el costo es mayor a
		// 1250�.
		if ((opcionTransporte == 1 && costo > 3000) 
				|| (opcionTransporte != 1 && costo > 1250)) {
			costo += 100;
		}

		System.out.println("El costo del env�o del paquete es: " + costo);
		
		sc.close();
	}

}
