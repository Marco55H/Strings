package parte1;

import java.util.Scanner;

public class Ej6 {
	public static void main(String[] args) {
		//Iniciamos escaner
		Scanner sc = new Scanner(System.in);
		//Las palabras que irá introduciendo el usuario
		String palabra="";
		//Donde guardaremos la frase completa
		String frase="";
		
		do {
			frase+=palabra+" ";
			System.out.println("Introduce una palabra(si metes espacios solo se contará la 1º");
			System.out.println("Introduce fin para terminar");
			palabra=sc.next();
			
			
			
		}while(!palabra.equals("fin"));
		System.out.println("Tu frase completa es: "+frase);
		sc.close();
	}
}
