package datos;

import java.util.Scanner;

public class Principal {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Nº: ");
		int num = Leer.datoInt();
		System.out.println(num);

	}

}
