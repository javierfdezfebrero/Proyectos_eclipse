package recursivas;



public class Recursiva {
	
	public static void main(String[] args) {
		
		System.out.println(buscar(75,arrayDeEnteros));	
	}
	
	
	public static int[] arrayDeEnteros = { 5, 9, 6, 2, 1, 75, 36, 41, 55, 4 };
	//boolean encontrado = false;
	//encontrado = buscar(8, 0, arrayDeEnteros); //devuelve false
	//encontrado = buscar(75, 0, arrayDeEnteros); //devuelve true
	
	public static boolean buscar(int n�mero, int posIn, int[] arrayDeEnteros) {
		if (posIn<arrayDeEnteros.length) {
			if (n�mero==arrayDeEnteros[posIn])
				return true;
			return buscar(n�mero, posIn+1, arrayDeEnteros);	
		}
		return false;
	} 

	
	/**
	 * non funciona
	 */
	public static int pos=0;
	public static boolean buscar(int n�mero, int[] arrayDeEnteros) {
		
		if (arrayDeEnteros[pos]<arrayDeEnteros.length) {
			if (n�mero==arrayDeEnteros[pos]) {
				return true;
			}else {
			++pos;
			return buscar(n�mero, arrayDeEnteros);	
			}
		}else {
		return false;
		} 

	
	}
	
	
	/**
	 * non funciona
	 */
	
	String cadena="abba";
	
	char[] cad=cadena.toCharArray();
	
	int lonx = cad.length;
	int inc = 0;
	
	public static boolean buscar(char[] cad, int lonx, int inc) {
		if (lonx!=inc) {
			if(cad[inc]==cad[lonx]) {
			
				return true;
			}else {
				return buscar( cad, lonx-1, inc+1);
			}
		}
		return false;
		
	}
	
	

}
