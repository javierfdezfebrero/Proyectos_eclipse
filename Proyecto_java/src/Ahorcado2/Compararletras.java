package Ahorcado2;

public class Compararletras {
	
	static int fallos=0;
	static boolean resultado= false;
	public static boolean compruebaLetra(char[] b , char c) {
		
		
		
		for (int i=0; i<b.length; i++) {
			if('c' == b[i]) {
				resultado = true;		
			}else {
				resultado= false;
				
			}
			
		}
		
		
		return resultado;
	}

}
