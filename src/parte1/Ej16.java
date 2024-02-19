package parte1;

import java.util.Random;
import java.util.Scanner;

public class Ej16 {
	public static void main(String[] args) {
		// Iniciamos random
		Random r = new Random();
		// Iniciamos escaner.
		Scanner sc = new Scanner(System.in);
		// Para guardar la palabra
		String palabraBuena = "campana";
		// Para guardar el intento
		String palabraIntento = "";
		// El posible anagrama
		String anagrama = "";
		// EL numero aleatorio en el que añadiremos el caracter
		int aleatorio;
		// Iremos guardandoel caracter
		char caracter;
		// Para contar los carácteres iguales
		int cont = 0;

		// COnvertimos palabra buena en array de char
		char[] caracteresArray = palabraBuena.toCharArray();

		// Creamos el anagrama
		// For para recorrer toda la palabra caracter por caracter
		for (int i = 0; i < caracteresArray.length; i++) {
			// Iniciamos el valor aleatorio entre 0 y el número de caracteres del array
			aleatorio = r.nextInt(caracteresArray.length);
			// Guardamos el caracter del array i en otra variable que usaremos después
			caracter = caracteresArray[i];
			// Metemos en el Lugar i del array un caracter aleatorio
			caracteresArray[i] = caracteresArray[aleatorio];
			// En un lugar aleatorio volvemos a meter el caracter guardado anteriormente
			caracteresArray[aleatorio] = caracter;
		}
		// Pasamos el array a anagrama
		anagrama = String.valueOf(caracteresArray);

		// Damos el anagrama y pedimos que nos den el resultado
		System.out.println("Tu anagrama es " + anagrama);
		System.out.println("Introduce la palabra que crees que es");
		palabraIntento = sc.next().toLowerCase();
		// Ponemos contador a 0 para este nuevo intento
		cont = 0;
		// Si queremos contar los caracteres iguales
		// For que recorra la palabra
		for (int j = 0; j < palabraBuena.length(); j++) {

			// Si las palabras son iguales sumamon una a la variable
			if (palabraBuena.charAt(j) == palabraIntento.charAt(j)) {
				cont++;
			}
		}
		System.out.println("Has acertado " + cont + " letras");
		// Un do while para introducir intento hasta el acierto
		while (!palabraIntento.equals(palabraBuena)) {
			System.out.println("Recuerda tu anagrama es " + anagrama);
			// pedimos la palabra
			System.out.println("Introduce la palabra que crees que es");
			palabraIntento = sc.next().toLowerCase();

			// Ponemos contador a 0 para este nuevo intento
			cont = 0;
			// Si queremos contar los caracteres iguales
			// For que recorra la palabra
			for (int j = 0; j < palabraBuena.length(); j++) {

				// Si las palabras son iguales sumamon una a la variable
				if (palabraBuena.charAt(j) == palabraIntento.charAt(j)) {
					cont++;
				}
			}
			System.out.println("Has acertado " + cont + " letras");
		}
		System.out.println("Acertaste");
	}
}
