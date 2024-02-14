package parte1;

import java.util.Scanner;

public class Ej8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase;
		boolean resultado;
		System.out.println("Introduce la frase");
		frase=sc.nextLine();
		
		frase = frase.replace(" ", "");
		
		resultado=palindromo(frase);
		
		if (resultado==true) {
			System.out.println("Tu frase es un palindromo");
		}else
			System.out.println("Tu frase no es un palindromo");
	}
	public static boolean palindromo(String frase) {
		boolean palindromo=false;
		String esarf="";
		//Recorremos el String de atrás para alante
		for(int i =frase.length()-1;i>=0;i--) {
			
			//Vamos concatenando los Char del último al primero para ir creando el String 
			esarf+=frase.charAt(i);
		}
		
		if (esarf.equals(frase)) {
			palindromo=true;
		}
		return palindromo;
	}
}
