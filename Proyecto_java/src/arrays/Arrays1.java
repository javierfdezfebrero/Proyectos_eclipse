package arrays;

import bucleFor.Primo;

public class Arrays1 {
	public static void main(String[] args) {

		/***
		 * Crear un programa que almacene en un array de enteros los primeros 15 n�meros primos.
		 *Para almacenar los n�meros primos en el array se usar� la estructura while
		 *Una vez los tenga almacenados, mostrar� el contenido del array por pantalla.
		 *Para mostrar los n�meros por pantalla se usar� la estructura for
		 */


		int[] array15= new int[15];


		
		
		//non funciona

		int cont=0;
		int max=15;


		int i=0;
		while(cont<max) {
			//System.out.println(i);
			
			boolean esprimo= Primo.esPrimo(i);
			if(esprimo) {
				array15[cont]=i;
				cont++;
				System.out.print(i+" ");
				}
		i++;
		}



		for(int s=0; s<array15.length; s++) {
			System.out.print(s);
		}


	}




}
