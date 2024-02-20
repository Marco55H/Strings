package parte1;

import java.util.Arrays;
import java.util.Scanner;

public class Ej14 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// Frase que introduce el usuario
		String frase;
		// Array de char que servirá para separar la frase en sus carácteres
		char[] letras;
		// Para ir contando las posiciones comparadas del array
		int anterior = 0;

		// Pedimos la frase
		System.out.println("Introduce tu frase");
		frase = sc.nextLine();

		// Iniciamos el tamaño del array igual al tamaño de la frase
		letras = new char[frase.length()];
		frase = frase.replace(" ", "");
		// Hacemos un for para meter los carácteres del string en el array
		for (int i = 0; i < letras.length; i++) {
			// Lo metemos
			letras[i] = frase.charAt(i);
		}

		// Ordenamod el array
		Arrays.sort(letras);

		// For para comparar el de la posición i con todos los demás
		for (int j = 0; j < letras.length; j++) {
			// Si las dos letras son iguales sumamos uno
		
			
			if (letras[j] != letras[j + 1]||j<letras.length-1) {
				System.out.println("Tenemos la letra " + letras[j] + " repetida " + (j + 1-anterior) + " veces");
				anterior=j+1;
			
			
			}
		

		}
		sc.close();
	}
}
