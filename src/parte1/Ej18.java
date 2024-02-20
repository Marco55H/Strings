package parte1;

import java.util.Scanner;

/**
 * Clase principal que covierte nuestro texto en un html básico
 */
public class Ej18 {

	public static void main(String[] args) {
		// Iniciamos escaner
		Scanner sc = new Scanner(System.in);
		// Variable en la que el usuario guardara el título y que después modificaremos
		// para html
		String titulo = "";
		// Variable en la que el usuario guardara el título y que después modificaremos
		// para html
		String texto = "";
		// Variable en la guardaremos la concatenación de las dos partes del html
		String html = "";
		System.out.println("Introduce el título de tu página html");
		titulo = sc.nextLine();
		System.out.println("Introduce el texto de tu página html");
		texto = sc.nextLine();

		html = htmlInicio(titulo) + htmlFinal(texto);

		System.out.println(html);
		sc.close();

	}

	/**
	 * Esta clase va a crear la primera parte del código html con el título
	 * 
	 * @param titulo variable de entrada, el título de nuestro html
	 * @return devolverá el título una vez modificado como html
	 */
	public static String htmlInicio(String titulo) {

		titulo = "<HTML><HEAD> <TITLE>" + titulo + "<TITLE> </HEAD> <BODY> <H1> " + titulo + " </H1>";

		return titulo;
	}

	/**
	 * Esta clase va a crear la otra parte del código html con el texto
	 * 
	 * @param texto variable de entrada, el texto de nuestro html
	 * @return devolverá el texto una vez modificado como html
	 */
	public static String htmlFinal(String texto) {

		texto = "<P>" + texto + "</P> </BODY> </HTML>";

		return texto;
		
	
	}
}
