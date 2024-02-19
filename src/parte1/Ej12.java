package parte1;

import java.util.Scanner;

public class Ej12 {
	public static void main(String[] args) {
		//Iniciamos escaner
		Scanner sc = new Scanner(System.in);
		//Las palabras que irá introduciendo el usuario
		String[] palabra;
		//Donde guardaremos la frase completa
		String frase="";
		//tamaño máximo de caracteres de la palabra
		int max=0;
		//palabra mas. larga
		String palabraMax="";
		//Pedimos al usuario la frase
		System.out.println("Introduce una frase");
		frase=sc.nextLine();
		
		//Separamos la frase en un array
		palabra = frase.split(" ");
		
		//
		for(int i =0;i<palabra.length;i++) {
			if(palabra[i].length()>max);
		max	= palabra[i].length();
		palabraMax=palabra[i];
		}
		
		System.out.println("la palabra más larga es "+palabraMax+" y mide "+max+" letras");
		//Cerrar escaner
		sc.close();
	}
}