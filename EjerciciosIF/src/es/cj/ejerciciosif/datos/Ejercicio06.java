package es.cj.ejerciciosif.datos;

import java.util.Scanner;

public class Ejercicio06 {

	// Construir un programa que calcule el índice de masa corporal de una
	// persona
	// (IMC = peso [kg] / altura2 [m]) e indique el estado en el que se
	// encuentra esa persona en función del valor de IMC:
	// Valor de IMC Diagnóstico
	// < 16 Criterio de ingreso en hospital
	// de 16 a 17 infrapeso
	// de 17 a 18 bajo peso
	// de 18 a 25 peso normal (saludable)
	// de 25 a 30 sobrepeso (obesidad de grado I)
	// de 30 a 35 sobrepeso crónico (obesidad de grado II)
	// de 35 a 40 obesidad premórbida (obesidad de grado III)
	// >40 obesidad mórbida (obesidad de grado IV)

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		double peso, altura, imc;

		do {
			System.out.println("Introduzca su peso:");
			peso = sc.nextDouble();
			if (peso <= 0)
				System.out.println("Error,numero no valido");
		} while (peso <= 0);

		do {
			System.out.println("Introduzca su altura:");
			altura = sc.nextDouble();
			if (altura <= 0)
				System.out.println("Error,numero no valido");
		} while (altura <= 0);

		imc = peso / Math.pow(altura, 2);
		if (imc < 16)
			System.out.println("Criterio de ingreso en hospital");
		else if (imc >= 16 && imc < 17)
			System.out.println("infrapeso");
		else if (imc >= 17 && imc < 18)
			System.out.println("bajo peso");
		else if (imc >= 18 && imc < 25)
			System.out.println("peso normal (saludable)");
		else if (imc >= 25 && imc < 30)
			System.out.println("sobrepeso (obesidad de grado I)");
		else if (imc >= 30 && imc < 35)
			System.out.println("sobrepeso crónico (obesidad de grado II)");
		else if (imc >= 35 && imc < 40)
			System.out.println("obesidad premórbida (obesidad de grado III)");
		else
			System.out.println("obesidad mórbida (obesidad de grado IV)");

	}

}
