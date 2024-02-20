package parte1;

import java.util.Scanner;

public class Ej19 {
	public static void main(String[] args) {
		// Iniciamos escaner
		Scanner sc = new Scanner(System.in);
		// Frase que introducirá el usuario
		String frase = "";
		//
		String camel= "";
		char letra = '0';

		System.out.println("Introduce la frase para conventirla a nomenclatura Camels");
		frase = sc.nextLine();

		frase.trim();
		
		for (int i = 0; i < frase.length(); i++) {

			if (frase.charAt(i) == ' ') {
				letra = frase.toUpperCase().charAt(i + 1);
				camel = camel+letra;
				i++;
			} else {
				letra = frase.toLowerCase().charAt(i);
				camel = camel+letra;

			}
			
		}

		frase = frase.replace(" ", "");
		System.out.println("Tu frase en camel es "+camel);

		sc.close();
	}
}
