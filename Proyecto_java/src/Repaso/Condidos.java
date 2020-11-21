package Repaso;

import java.util.Scanner;

public class Condidos {
	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		
		System.out.println("indica un mes");
		
		int mes= sc.nextInt();
		System.out.println("indica un ano, crack");
		
		double ano=sc.nextDouble();
		
		String imprime= null;
		
		
		
	
		switch(mes) {
		case (1) : imprime="Xaneiro"; break;
		case (2) :if((ano%4==0 && ano%400!=0)||(ano%100!=0 && ano%400==0) ) {
			imprime="Febreiro bisiesto";
		}else{
			imprime="febreiro";
		}
		break;
		case (3) : imprime="Marzo"; break;
		case (4) : imprime="Abril"; break;
		case (5) : imprime="Maio"; break;
		case (6) : imprime="Xullo"; break;
		case (7) : imprime="Xulio"; break;
		case (8) : imprime="Agosto"; break;
		case (9) : imprime="Septembro"; break;
		case (10) : imprime="Outubro"; break;
		case (11) : imprime="Novembro"; break;
		case (12) : imprime="Decembro"; break;

		}
		System.out.println(imprime);
		
		sc.close();
		
		
}
}
