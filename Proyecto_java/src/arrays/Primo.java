package arrays;

public class Primo {
	

	
		public static boolean esPrimo(int a) {
			
		boolean primo=false;
		
		int raiz=(int)Math.sqrt(a);
		
		for (int i=2; i<(raiz+1); i++) {
			if (a%i==0) {
				 primo=false;
		}else {
			 primo=true;
		}
		}
		return primo;		
		
	}
	
}
