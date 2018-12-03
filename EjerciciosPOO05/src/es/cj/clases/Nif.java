package es.cj.clases;

public class Nif {

	private int dni;
	private char letra;

	private static char[] codigos = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V',
			'H', 'L', 'C', 'K', 'E' };

	public Nif() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Nif(int dni) {
		super();
		this.dni = dni;
		this.letra = calcularLetra(dni);
	}

	public static char leer(int dni) {
		return calcularLetra(dni);
	}

	@Override
	public String toString() {
		return this.dni + "-" + Character.toUpperCase(this.letra);
	}

	private static char calcularLetra(int dni) {
		int resto = dni % 23;
		return codigos[resto];
	}
}
