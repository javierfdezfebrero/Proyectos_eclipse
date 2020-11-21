package arrays;

public class Palindromo {
	
	
	public static boolean palindromo(String a) {
		
		boolean resultado=false;
		
		char[] arrayDeA = a.toCharArray();// pasa a cadena de texto a un array de caracteres
		
		
		for(int i=0; i<(arrayDeA.length)/2;i++) {//recorre o array coa mitad da lonxitude 
			
			int lonxitude= arrayDeA.length;
			
			if(a.charAt(i)!=a.charAt(lonxitude-1-i)) {
				
				resultado=false;
			}else {
				resultado=true;
			}
			
			
		}
		
		
		
		
		return resultado;
		
	}
	
	public static void main(String[] args) {
		System.out.println(palindromo("abba"));
		
	}

}
