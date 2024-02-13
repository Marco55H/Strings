package parte1;

import java.util.Scanner;

public class Ej1 {
	public static void main(String[] args) {
		// Iniciamos escaner
		Scanner sc = new Scanner(System.in);
		// Iniciamos la primera frase
		String frase1;
		// Iniciamos la segunda frase
		String frase2;

		// Pedimos la primera frase
		System.out.println("Escribe la primera frase");
		frase1 = sc.next();
		// Pedimos la segunda frase
		System.out.println("Escribe la segunda frase");
		frase2 = sc.next();

		// If para comprar el tamaño de las frases
		// Si la frase dos es mayor haremos lo siguiente
		if (frase1.length() < frase2.length()) {
			System.out.println("la frase dos es la más larga");
			// Si la frase uno es mayor
		} else if (frase2.length() < frase1.length()) {
			System.out.println("La frase uno es más larga");
			// Si las frases son iguales
		} else {
			System.out.println("Las frases son iguales");
		}
		// Cerramos escaner
		sc.close();
	}
}
