package es.cj.datos;

public class Explicacion {

	public static void main(String[] args) {
//		String cadena1 = "valar1";
//		String cadena2 = "Valor2";
//		if(cadena1.compareToIgnoreCase(cadena2)==0)
//			System.out.println("iguales");
//		else
//			System.out.println("distintas");
//		
//		String res = cadena1.concat(cadena2);
//		System.out.println(res);
//		
//		if (cadena1.contains("Or1"))
//			System.out.println("Sí");
//		else
//			System.out.println("No");
//		
//		if (cadena1.endsWith("or2"))
//			System.out.println("Sí Termina");
//		else
//			System.out.println("No Termina");
//		
//		System.out.println(cadena1.indexOf("a"));
//		System.out.println(cadena1.lastIndexOf("a"));
//		
//		if (cadena1.equals("") || cadena1.length() == 0 || cadena1.isEmpty())
//			System.out.println("Cadena vacía");
//		
//		cadena1 = cadena1.replace("a", "o");
//		System.out.println(cadena1.replace("a", "o"));
//		
//		String texto = "1 javier ruano 38 sevilla";
//		String [] tabla = texto.split(" ");
//		for (String aux : tabla) {
//			System.out.println(aux);
//		}
//		
//		System.out.println("TEXTO: " + texto.substring(2, 8));
//		
//		char [] letras = texto.toCharArray();
//		for (char c : letras) {
//			System.out.println(c);
//		}
//		for (int i = 0; i < letras.length; i++) {
//			System.out.println(letras[i]);
//		}
//		
//		String nombre = " JAVIER ";
//		System.out.println(nombre.trim().length());
//	
//		int a = 23;
//		String aa = String.valueOf(a);
//		System.out.println(aa);
		
		
		
		
		StringBuffer sb = new StringBuffer("hola");
		sb.append(" que tal");
		System.out.println(sb);
		sb.delete(4, sb.length());
		System.out.println(sb);
		sb.deleteCharAt(0);
		System.out.println(sb);
		sb.insert(2, "texto largo");
		System.out.println(sb);
		sb.replace(0, 3, "Nuevo");
		System.out.println(sb);
		System.out.println(sb.reverse());
	}

}
