package parte1;

import java.util.Arrays;
import java.util.Scanner;

public class Ej13 {
	public static void main(String[] args) {
		// Iniciamos escaner.
		Scanner sc = new Scanner(System.in);
		// Para guardar la palabra
		String palabra;
		// El posible anagrama
		String anagrama;
		//EL resultado de la función
		boolean equivalente;
		
		
		// pedimos la palabra
		System.out.println("Introduce la palabra");
		palabra = sc.next().toLowerCase();

		

		// Pedimos el anagrama
		System.out.println("Introduce el anagrama");
		anagrama = sc.next().toLowerCase();

		
		equivalente=iguales(palabra, anagrama);
		System.out.println(equivalente);
		
		sc.close();
	}

	public static boolean iguales(String palabra, String anagrama) {
		// Array para letras de palabras
		char[] letra1;
		// Array para letras de palabras
		char[] letra2;

		letra1 = palabra.toCharArray();
		letra2 = anagrama.toCharArray();

		Arrays.sort(letra1);
		Arrays.sort(letra2);

		return Arrays.equals(letra1, letra2);

	}
}