package parte1;

import java.util.Scanner;

public class Ej3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// String que introducirá el usuario
		String frase = "";
		// Contador de espacios
		int contEspacios;

		// Pedimos la frase a usuario
		System.out.println("Introduzca la frase");
		frase = sc.nextLine();

		// LLamamos a la función y metemos el valor devuelto en la variable
		contEspacios = espacios(frase);

		// Imprimmos el resultado
		System.out.println("Tu frase tiene " + contEspacios + " espacios");
		sc.close();
	}

	// Función que devolverá el número de espacios de la frase
	public static int espacios(String frase) {
		// Contador de espacios
		int contEspacios = 0;
		// For each que recorrerá el string
		for (char valor : frase.toCharArray()) {
			// Un if para comprobar que el carácter es el espacio
			if (valor == ' ') {
				// En caso de que lo sea sumamos uno a la variable
				contEspacios++;
			}

		}
		// Devolvemos el valor
		return contEspacios;
	}
}
