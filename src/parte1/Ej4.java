package parte1;

import java.util.Arrays;
import java.util.Scanner;

public class Ej4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//String que introducirá el usuario
		String letras;
		//Array que contendrá todas las palabras del String ordenadas
		String[] letrasOrdenadas;
		
		//Pedimos el String
		System.out.println("Introduce tus palabras/Letras");
		letras=sc.nextLine();
		
		//Le damos la longitud al array
		letrasOrdenadas=new String[letras.length()];
		
		//Usamos un for para meter los caracteres del string en el array
		for(int i=0;i<letras.length();i++) {
			//Metemos las letras del string en el array
			
			letrasOrdenadas[i]=Character.toString(letras.charAt(i));
			
		}
		//Ordenamos alfabéticamente el array
		Arrays.sort(letrasOrdenadas);
		System.out.println("Tus letras ordenadas alfabéticamente ordenadas son: "+Arrays.toString(letrasOrdenadas));
		sc.close();
	}
}
