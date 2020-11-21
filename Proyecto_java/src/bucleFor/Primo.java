package bucleFor;

public class Primo {



	public static boolean esPrimo(int a) {

		boolean primo=true;

		int raiz=(int)Math.sqrt(a);
		if(a==1 || a==0) {

			primo=false;

			for (int i=2; i<(raiz+1); i++) {
				if (a%i ==0) {
					primo=false;
				}
			}
		}
	return primo;		

		

	}

	public static void main(String[] Args) {

		System.out.println(esPrimo(0));

	}



}
