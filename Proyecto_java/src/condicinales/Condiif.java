package condicinales;

import java.util.Scanner;

public class Condiif {
	public static void main(String[] args) {
		
		
		/**
		 * Realizar un programa que lea por teclado un número de un mes (del 1 al 12) y un año.
		 *El programa mostrará por pantalla el número de días que tiene ese mes, teniendo en cuenta si se trata de un año bisiesto o no.
		 *Realizar dos versiones de este programa. Uno utilizando switch y otro usando if ... [else ...]
		 */
		
		Scanner sc =  new Scanner(System.in);
		
		int mes1=sc.nextInt();
		int ano1=sc.nextInt();
		
		String imprime=null;
		
		if((ano1%4==0 && ano1%400!=0)||(ano1%100!=0 && ano1%400==0)) 
			if(mes1==1) {
				imprime="1";
			}else if(mes1==2) {
				imprime="2 bisiesto";
			}else if (mes1==3) {
				imprime="3";
			}else if(mes1==4) {
				imprime="";
			}else if(mes1==5) {
				imprime="";
			}else if(mes1==6) {
				imprime="";
			}else if(mes1==7) {
				imprime="";
			}else if(mes1==8) {
				imprime="";
			}else if(mes1==9) {
				imprime="";
			}else if(mes1==10) {
				imprime="";
			}else if(mes1==11) {
				imprime="";
			}else if(mes1==12) {
				imprime="";
			}
			
	else {
			if(mes1==1) {
				imprime="";
			}else if(mes1==2) {
				imprime="22";
			}else if (mes1==3) {
				imprime="";
			}else if(mes1==4) {
				imprime="";
			}else if(mes1==5) {
				imprime="";
			}else if(mes1==6) {
				imprime="";
			}else if(mes1==7) {
				imprime="";
			}else if(mes1==8) {
				imprime="";
			}else if(mes1==9) {
				imprime="";
			}else if(mes1==10) {
				imprime="";
			}else if(mes1==11) {
				imprime="";
			}else if(mes1==12) {
				imprime="";
			}
			
		}
			
		System.out.print(imprime);
		sc.close();
		
		
	}

}
