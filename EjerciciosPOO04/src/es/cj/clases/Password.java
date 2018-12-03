package es.cj.clases;

import java.util.UUID;

public class Password {

	private int longitud;
	private String contrasena;
	
	public Password() {
		this.longitud = 8;
		this.contrasena = generarPassword();
	}

	public Password(int longitud) {
		super();
		this.longitud = longitud;
		this.contrasena = generarPassword();
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
	public boolean esFuerte() {
		int mayus = 0, minus = 0, numeros = 0;
		for (int i = 0; i < contrasena.length(); i++) {
			char letra = contrasena.charAt(i);
			// mayus
			if (Character.isUpperCase(letra))
				mayus++;
			else if (Character.isLowerCase(letra))
				minus++;
			else if (Character.isDigit(letra))
				numeros++;
		}
		return (mayus >= 2) && (minus >= 1) && (numeros >= 5);
	}
	
	public String generarPassword() {
		return UUID.randomUUID().toString().substring(0, longitud);
	}
}
