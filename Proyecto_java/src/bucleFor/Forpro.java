package bucleFor;

public class Forpro {
	
	public static void main (String[] args) {
		
		/**
		 * Crear un m�todo al que se le pase por par�metro dos enteros y devuelva otro entero que ser� el resultado de multiplicar ambos n�meros.
		 *Para calcular multiplicaci�n se har� mediante sumas sucesivas. No se puede utilizar el operador *
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
		 * Crear un m�todo al que se le pase por par�metro dos enteros y devuelva otro entero que ser� el cociente resultado de dividir el primer n�mero entre el segundo.
		 *Para calcular el cociente se har� mediante restas sucesivas. No se puede utilizar el operador /
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

