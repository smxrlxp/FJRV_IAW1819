package es.cj.datos;

public class Ejercicio04 {

	// Escriba un método que, dada una cadena de caracteres, de la suma de todos los
	// dígitos que hay en ella. Por ejemplo, si la cadena es abc12de3f4, dará como
	// resultado 10.

	public static void main(String[] args) {
		String cadena = "abc12de3f4";

		System.out.println("Suma: " + sumaDigitosV1(cadena));
		System.out.println("Suma: " + sumaDigitosV2(cadena));
		System.out.println("Suma: " + sumaDigitosV3(cadena));

	}

	private static int sumaDigitosV3(String cadena) {
		int sumaTotal = 0;

		for (int i = 0; i < cadena.length(); i++) {
			if (Character.isDigit(cadena.charAt(i))) {
				sumaTotal += Character.getNumericValue(cadena.charAt(i));
			}
		}

		return sumaTotal;
	}

	private static int sumaDigitosV2(String cadena) {
		int sumaTotal = 0;

		for (int i = 0; i < cadena.length(); i++) {
			try {
				int c = Integer.parseInt(cadena.substring(i, i+1));
				sumaTotal += c;
			} catch (NumberFormatException e) {
				System.out.println("Error al convertir string en int");
			}
		}

		return sumaTotal;
	}

	private static int sumaDigitosV1(String cadena) {
		int sumaTotal = 0;

		for (int i = 0; i < cadena.length(); i++) {
			int c = cadena.charAt(i) - '0';
			//System.out.println(cadena.charAt(i) + " " + c);
			if (c >= 0 && c <= 9) {
				sumaTotal += c;
			}
		}

		return sumaTotal;
	}

}
