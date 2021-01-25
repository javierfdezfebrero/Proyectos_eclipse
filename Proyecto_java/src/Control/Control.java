package Control;

import java.util.Scanner;

public class Control {



	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean bucle=true;
		int division;
		int a = 0 ,b =0;

		while(bucle) {
			try {
				
				

				System.out.println("dime un numero");
				a =sc.nextInt();
				System.out.println("dime otro numero");
				b=sc.nextInt();


				division = a/b;
				System.out.println(division);
			}
			catch(ArithmeticException e){
				
				System.out.print( "NaN"+"\n");
				

			}finally {
				if (a==0&&b==0) {
					System.out.println("\n");
					System.out.println("El divisor y el dividendo es cero");
					break;
				}
			}


		}
		sc.close();
	}

}
