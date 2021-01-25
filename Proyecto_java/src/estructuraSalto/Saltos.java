package estructuraSalto;

public class Saltos {




	public static void main(String[] args) {

		//numpares();
		System.out.print("\n");

		//System.out.print(esPrimo(47));
		System.out.print("\n");
		//System.out.print(esBisiesto(2010));
		System.out.print("\n");
		numPrimos();
		System.out.print("\n");
		//numPrimos2();
	}

	/**
	 * 
	 * 
	 * 
	 * 
	 * Números impares
	 *Usado la sentencia continue, crear un bucle que recorra todos los números del 1 al 50 pero sólo muestre los pares.
	 */

	public static void numpares() {
		int  numlimite = 101 ;



		for(int i=1; i<numlimite ;i++) 
			if (i%2 !=0) {
				continue;
			}else {
				System.out.print(i+ ",");
			}




	}







	/**
	 *Método esPrimo
	 *Usando la sentencia return, optimizar el método esPrimo creado previamente de forma que, en el caso que se detecte que no es primo, abandone el bucle.
	 */

	public static boolean esPrimo(int a) {



		int raiz=(int)Math.sqrt(a);
		if(a==1 || a==0) 

			return false;

		for (int i=2; i<(raiz+1); i++) 
			if (a%i ==0)  
				return false;



		return true;
	}





	/**
	 *Método esBisiesto
	 *Usando la sentencia return, optimizar el método esBisiesto creado previamente de forma que
	 * haga el mínimo número de condiciones posible.
	 */
	public static boolean esBisiesto(int ano) {
		if((ano%4==0 && ano%400!=0)||(ano%100!=0 && ano%400==0) ) 
			return true;

		return false;
	}


	/**
	 *Calcular los 100 primeros números primos
	 *Sin hacer uso del método esPrimo, crear un programa que calcule los 100
	 * primeros números primos. Optimizar el cálculo usando la sentencia break.

	 *Optimizar el resultado de este mismo programa usando la sentencia continue en lugar de la sentencia break,
	 * 
	 * 
	 */


	public static void numPrimos() {
		for(int j=1; j<101; j++) {
			boolean primo=true;
			int raiz=(int)Math.sqrt(j);
			for (int i=2; i<(raiz+1); i++) {
				if (j%i ==0){
					primo=false;
					//System.out.print(j + ",");
					break;

				}
			} 

			if (primo) {
				System.out.print(j + ",");
			}
		}
	}

	
	
	//con etiquetas se solventa o ultimo

	/**public static void numPrimos2() {
		for(int j=1; j<101; j++) {

			int raiz=(int)Math.sqrt(j);
			for (int i=2; i<(raiz+1); i++) {
				if (j%i ==0){
					continue;

				}System.out.print(j + ",");

			} 




}
	}*/
}


