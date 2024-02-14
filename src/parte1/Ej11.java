package parte1;

import java.util.Scanner;

public class Ej11 {
	public static void main(String[] args) {
		// Iniciamos el escaner
		Scanner sc = new Scanner(System.in);
		// La primera tabla de codificado
		char[] conjunto1 = { 'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v' };
		// La tabla a la q se va a cambiar el valor de la primera tabla
		char[] conjunto2 = { 'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's' };
		// String que introduce el usuario, lo pasaremos a char pero era necesario para
		// usar el lower case
		String d;
		// Char al que convertiremos el 1º valor del string
		char c;

		// Pedimos el carácter
		System.out.println("Introduce un carácter para ver la descodificación");
		d=sc.nextLine();
		// Lo pasamos a minúscula
		d.toLowerCase();
		// Convertimos el String a Char
		c = d.charAt(0);

		// LLamamos a la función y lo guardamos en la c
		c = descodifica(conjunto1, conjunto2, c);

		// Imprimimos la solución
		System.out.println("El carácter descodíficado es: " + c);
		
		//Cerramos escáner
		sc.close();
	}

	// Función en la que codificaremos el carácter
	public static char descodifica(char conjunto1[], char conjunto2[], char c) {
		// Booleano para seguir cambisndo la letra o no, en caso de que ya la hayamos
		// cambiado
		boolean seguir = true;

		// for para recorrer la priemra tabla y buscar una igualdad entre sus valores y
		// el nuestro
		for (int i = 0; i < conjunto1.length; i++) {
			System.out.println(c);
			// If para buscar la igualdad, si son iguales y no se ha cambiado nunca la
			// letras, esta será cambiada por la letra correspondiente de la 2º tabla
			if (c == conjunto2[i] && seguir) {
				c = conjunto1[i];
				seguir = false;

			}
		}
		// Devolvemos el carácter este cambiado o no
		return c;
	}
}
