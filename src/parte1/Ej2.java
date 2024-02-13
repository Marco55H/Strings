package parte1;

import java.util.Arrays;
import java.util.Scanner;

public class Ej2 {
	public static void main(String[] args) {
		// Iniciamos el escaner
		Scanner sc = new Scanner(System.in);
		// Iniciamos la contraseña
		String contraseña;
		// iniciamos el String que introducirá el otro jugador
		String intento;
		// Array que irá diciendo el resultado
		String[] resultado;
		// Esta variable la usaremos para guardar el tamaño de la palabra
		int longitud;

		// Pedimos la contraseña al jugador 1
		System.out.println("Jugador 1 Introduzca la contraseña");
		contraseña = sc.next();

		longitud = contraseña.length();
		resultado = new String[longitud];

		// For para rellenar el resultado de *
		for (int i = 0; i < longitud; i++) {
			resultado[i] = "*";
		}

		// Do while para repetir mientras la contraseña del jugador 1 sea distinta a el
		// intento del jugador 2
		do {

			do {
			System.out.println("Jugador 2 introduzca su intento de acertar la contraseña");
			intento = sc.next();

			if(intento.length()!=longitud) {
				System.out.println("La contraseña mide "+longitud+" carácteres");
			}
			}while(intento.length()!=longitud);
			
			
			
			for (int i = 0; i < longitud; i++) {

				if (contraseña.charAt(i) == intento.charAt(i)) {
					resultado[i] = Character.toString(contraseña.charAt(i));
				}
			}
			System.out.println(Arrays.toString(resultado));

		} while (!contraseña.equals(intento));
		System.out.println("Enhorabuena has acertado la contraseña!!!");
		sc.close();
	}

}
