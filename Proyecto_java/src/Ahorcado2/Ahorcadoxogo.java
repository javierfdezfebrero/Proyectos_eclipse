package Ahorcado2;

import java.util.Scanner;

public class Ahorcadoxogo {
	
	private static final char[] PALABRAOBJETIVO = "PROGRAMANDO".toCharArray();
	


	public static void main(String[] Args) {
		
		Scanner sc = new Scanner(System.in);
		boolean s= true;
		
		while(s==true) {
			
			System.out.println("Juega una letra:");
			
			
			
			char letra = sc.next().charAt(0);
			
			Compararletras.compruebaLetra(PALABRAOBJETIVO, letra);
			
			System.out.print(Compararletras.fallos);
			System.out.print(Compararletras.resultado);
			
		}
		sc.close();
	}
}
