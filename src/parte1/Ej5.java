package parte1;

import java.util.Scanner;

public class Ej5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//La frase  que inroducirá el usuario
		String frase="";
		//Variable en la que guardaremos el resultado de la función
		String esarf;
		
		//Pedimos la cadena al usuario
		System.out.println("Danos la cadena necesaria");
		frase=sc.nextLine();
		
		esarf=esarf(frase);
		
		System.out.println("Tu cadena al revés será "+esarf);
		sc.close();
	}
	
	//La función que se encargará de darle la vuelta al String 
	public static String esarf(String frase) {
		//String donde guardaremos la String al revés
		String esarf="";
		
		//Recorremos el String de atrás para alante
		for(int i =frase.length()-1;i>=0;i--) {
			
			//Vamos concatenando los Char del último al primero para ir creando el String 
			esarf+=frase.charAt(i);
		}
		//Devolvemos el String
		
		return esarf;
	}
}
