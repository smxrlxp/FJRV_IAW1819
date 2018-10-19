package es.cj.ejerciciosif.datos;

import java.util.Scanner;

public class Ejercicio08 {

	// Usted ha sido contratado por FedEx para crear un programa que calcule el
	// costo de envío de paquetes. El problema reside en que hay múltiples
	// opciones de envío, es por esto que su programa debe preguntar por las
	// opciones escogidas y de acuerdo a esto calcular el costo. A continuación
	// se detallan los costos junto con el método escogido:
	// Se puede enviar el paquete de dos maneras, por avión con costo de 2000€ o
	// barco con costo 1000€.
	// En caso de enviarse por barco se puede escoger envío rápido con costo
	// €500 o normal con costo 250€.
	// Además se puede contratar un seguro contra pérdidas, en caso de escogerlo
	// esto suma 1000€ al costo.
	// Por último, existe la terrible posibilidad de pagar impuestos en aduana,
	// el impuesto sólo se paga si es que se escoge ir en avión y el costo es
	// mayor que 3000€ o si se escoge ir en barco y el costo es mayor a 1250€.
	// En caso de pagar impuesto el costo aumenta en 100€.

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		double costo;

		System.out.println("-- MENÚ DE OPCIONES --");
		System.out.println("1. Avión");
		System.out.println("2. Barco (Por defecto)");
		int opcionTransporte = sc.nextInt();

		switch (opcionTransporte) {
		case 1: // Avión
			costo = 2000;
			break;
		default: // Barco
			costo = 1000;

			System.out.println("-- MENÚ ENVÍO --");
			System.out.println("1. Rápido");
			System.out.println("2. Normal (Por defecto)");
			int opcionEnvio = sc.nextInt();

			switch (opcionEnvio) {
			case 1: // Rápido
				costo += 500;
				break;

			default: // Normal
				costo += 250;
				break;
			}

			break;
		}

		System.out.println("¿Desea seguro contra pérdidas? (S/N)");
		String respuesta = sc.next();
		if (respuesta.equalsIgnoreCase("s")) {
			costo += 1000;
		}

		// el impuesto sólo se paga si es que se escoge ir en avión y el costo
		// es
		// mayor que 3000€ o si se escoge ir en barco y el costo es mayor a
		// 1250€.
		if ((opcionTransporte == 1 && costo > 3000) 
				|| (opcionTransporte != 1 && costo > 1250)) {
			costo += 100;
		}

		System.out.println("El costo del envío del paquete es: " + costo);
		
		sc.close();
	}

}
