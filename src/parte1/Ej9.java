package parte1;

import java.util.Scanner;

public class Ej9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// La frase que nos dará el usuario
		String frase;
		// Para guardar la posición si encontramos indicio del dialecto
		int posDialecto;
		// Para guardar la posición si encontramos indicio del idioma
		int posIdioma;

		// Pedimos la frase para ver si es del idioma o del dialecto
		System.out.println("Habla al traductor");
		frase = sc.nextLine();

		// Buscamos si se da el idioma, ya que serán las primeras letras
		posIdioma = frase.indexOf("Javalín, javalón");
		// Buscamos si se da el dialécto ya que se da en las últimas palabras
		posDialecto = frase.lastIndexOf("javalén, len, len");

		// Un if para ver si se ha encontrado el idioma
		if (posIdioma == 0) {
			// Si se encuentra imprimimos lo siguiente
			System.out.println("Su frase está en el idioma de Javalandia");
			// Cambiamos la parte de Javalandía por una parte nula
			frase = frase.replace("Javalín, javalón", "");
			System.out.println("Su traducción es: " + frase);
			// Un if para ver si se ha encontrado el dialecto, le restamos 17 a frase length
			// porque es lo que mide la distinción del dialecto
		} else if (posDialecto == frase.length() - 17) {
			// Si se encuentra imprimimos lo siguiente
			System.out.println("Su frase está en el idioma de Javalandia");
			// Cambiamos la parte de Javalandía por una parte nula
			frase = frase.replace("javalén, len, len", "");
			System.out.println("Su traducción es: " + frase);

		} else {
			//Si no encontramos nada de JAvalandia, no hará falta traducir el idioma
			System.out.println("Su frase no está en el idioma de Javalandia");
		}
		//Cerramos escaner
		sc.close();
	}
}
