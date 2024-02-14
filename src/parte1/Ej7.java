package parte1;

import java.util.Scanner;

public class Ej7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// La frase que escribirá el usuario
		String frase = "";
		// La palabra que buscaremos en la frase
		String palabra = "";
		// String de las palabras cuando las separemos para comparara más facilmente
		String[] palabrasSeparadas;
		// Contador por si la palabra se repite
		int cont = 0;

		// Pedimos la frase
		System.out.println("Introduzca la frase");
		frase = sc.nextLine();

		// Preguntamos por la palabra que se quiere buscar
		System.out.println("¿Que palabra quieres buscar?");
		palabra = sc.next();

		// Separamos la frase en sus palabras
		palabrasSeparadas = frase.split(" ");

		// For para recorrer el string de palabras
		for (int i = 0; i < palabrasSeparadas.length; i++) {

			// Comparamos si son iguales
			if (palabra.equals(palabrasSeparadas[i])) {
				cont++;
			}

		}
		// Imprimimos el resultado
		System.out.println("Tu palabra se repite " + cont + " veces");
		// Cerraos escaner
		sc.close();
	}
}
