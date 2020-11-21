package Repaso;

import java.util.Scanner;

public class Condicionales {
	public static void main(String[] args) {
		
		/**
		 * Realizar un programa que lea por teclado un número entero del 1 al 7.
         *El programa mostrará por pantalla el texto correspondiente al día de la semana lunes ... domingo.
		 */
		
		Scanner sc= new Scanner(System.in);
		
		int dia =sc.nextInt();
		
		String infodia = null;
		
		switch(dia) {
		case( 1 ): infodia = "el dia es luns"; break;
		case( 2 ): infodia = "el dia es martes"; break;
		case( 3 ): infodia = "el dia es mercores"; break;
		case( 4 ): infodia = "el dia es xoves"; break;
		case( 5 ): infodia = "el dia es venres"; break;
		case( 6 ): infodia = "el dia es sabado"; break;
		case( 7 ): infodia = "el dia es domingo"; break;
		default: infodia="el dia es incorrecto"; break;
		}
		
		System.out.println(infodia);
		
		/*int dia2=sc.nextInt();
		String[] arraysemana = new String[7];
		arraysemana[0]= "luns";
		arraysemana[1]= "martes";
		arraysemana[2]= "mercores";
		arraysemana[3]= "xoves";
		arraysemana[4]= "venres";
		arraysemana[5]= "sabado";
		arraysemana[6]= "domingo";
		
		while ()
		*/
		
		sc.close();
	}

}
