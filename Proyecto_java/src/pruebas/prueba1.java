package pruebas;

import java.util.Scanner;

public class prueba1 {

	public static void main(String[] args) {
		System.out.println("Ultimo intento, introduce una palabra, suertee"+"\n");
		
		Scanner sc= new Scanner(System.in);
		
		String  result= "hola";
		
		String intento= sc.nextLine();
			if(result.equals(intento)) {
				System.out.print("lo lograste");
			}else {
				System.out.println("   -------  ");
				System.out.println(" -----------  ");
				System.out.println(" GAME  OVER  ");
			}
	sc.close();		
	}
	
	
}
