package bucleFor;

public class Forpro {
	
	public static void main (String[] args) {
		
		/**
		 * Crear un método al que se le pase por parámetro dos enteros y devuelva otro entero que será el resultado de multiplicar ambos números.
		 *Para calcular multiplicación se hará mediante sumas sucesivas. No se puede utilizar el operador *
		 */
		
		int num = 2;
		int num2 = 5;
		
		int result=0;
		
		for (int i=0; i<num2; i++) {
			
			int resultado = result + num;
			//System.out.println(resultado);
			result=resultado;
			
		}
		
		
		System.out.println(result);
		
		/**
		 * Crear un método al que se le pase por parámetro dos enteros y devuelva otro entero que será el cociente resultado de dividir el primer número entre el segundo.
		 *Para calcular el cociente se hará mediante restas sucesivas. No se puede utilizar el operador /
		 */
		int numdiv= 20;
		int numcont =5;
		int resultdiv=0;
		
		for (int i=0; i<numcont; i++) {
			
			int resultado = resultdiv - numdiv;
			//System.out.println(resultado);
			resultdiv=resultado;
			
		}
		
		
		System.out.println(resultdiv);
		
		
			
		}
		
		
	}

