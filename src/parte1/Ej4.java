package parte1;

import java.util.Arrays;
import java.util.Scanner;

public class Ej4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// String que introducirá el usuario
		String palabras;
		// Array que contendrá todas las palabras del String separadas y después
		// ordenadas
		String[] palabrasSeparadas;

		// Pedimos el String
		System.out.println("Introduce tus palabras");
		palabras = sc.nextLine();

		//Iniciamos el array con la función .split
		palabrasSeparadas = palabras.split(" ");

		//Usamos el array.sort para ordenar el array
		Arrays.sort(palabrasSeparadas);
		//Imprimimos el resultado
		System.out.println("Tus letras ordenadas alfabéticamente ordenadas son: " + Arrays.toString(palabrasSeparadas));
		sc.close();
	}
}
