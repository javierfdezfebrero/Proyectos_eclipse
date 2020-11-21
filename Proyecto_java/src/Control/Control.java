package Control;

import java.util.Scanner;

public class Control {
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		
		 System.out.println("dime un numero");
		 a =sc.nextFloat();
		 System.out.println("dime otro numero");
		 b=sc.nextFloat();
		division(a,b);
	
		sc.close();
	}
	
	static float a,b;
	
	public static void division(float a, float b) {
		try {
	
			  float division;
			 
		      division = a/b;
		      System.out.println(division);
		}
		catch(ArithmeticException e){
			if(b==0) {
				System.out.print( "NaN");
			}else if(a==0 && b==0){
				
			}
			
		}finally {
			
		}
		
	}
}
