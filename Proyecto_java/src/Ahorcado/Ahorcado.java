package Ahorcado;

import java.util.Scanner;

public class Ahorcado {


	private static final char[] PALABRAOBJETIVO = "PROGRAMANDO".toCharArray();
	private static final String PALABRAOBJETIVO2 = "PROGRAMANDO";

	private static  String palabrasAcertadas = "";// array de acertadas-- mostrando  a palabra


	private static  String palabrasFalladas = "";// array de falladas

	private static int fallos =0;// contador para saber en que error vai



	public static void main(String[] Args) {


		Scanner sc = new Scanner(System.in);
		while(fallos<11) {

			System.out.println("Juega una letra:");



			char letra = sc.next().charAt(0);

			compruebaLetra(PALABRAOBJETIVO, letra);


		}
		sc.close();








	}
	public static void muestrapantalla(char [] a) {
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);

		}
	}


	
	public static void compruebaLetra(char[] b , char c) {
		
		boolean resultado= false;
		

		for (int i=0; i<PALABRAOBJETIVO.length; i++) {
			if(b[i] == c) {
				resultado = true;
				letrasAcertadas(c,i);

			}else 
				resultado=false;
				letrasJugadas(c,i);

		}
		
		if(resultado) {
			
			System.out.print(compruebaError(fallos));		
			System.out.println(letrasacertadas);
			System.out.println(letrasjugadas);
		}else {
			fallos++;
			
		}
		
	}







	
	
	/**
	 * Metodo para mostrar as letras falladas
	 * @return 
	 */
	
	static char[] letrasjugadas= new char[11];
	
	public static char[] letrasJugadas(char a, int b) {
		
		letrasjugadas[b]=a;
		//System.out.println( b + "  " + a);
		
		
		return letrasjugadas;
	}
	


	/**
	 * metodo para mostrar as letras acertadas
	 * @return 
	 */
	public static char[] letrasacertadas= new char[11];
	
	static char[] letrasAcertadas(char a, int b) {
		
		
		letrasacertadas[b]=a;
		
		//System.out.println(b +" "+ a);
		
		for(int i=0; i<letrasacertadas.length; i++) {
			//System.out.print(letrasacertadas[i]);
			
		}
		
		return letrasacertadas;
	}
	
	
	
	
	/**
	 * Metodo para dar un intento de acertar a palabra
	 * @param intento
	 * @return
	 */
	
	
	
	String ultimointento(String intento) {
		String result="";
		if(intento==PALABRAOBJETIVO2) {
			
		result="Enhorabuena, lo lograste";
		}else {
			result="No, lo siento";
		}
		
		
		return result;
	}
	
	
	/***
	 * metodo para comprobar o error xogador e mostrar por pantalla
	 * @param a
	 * @return
	 */
	
	public static String compruebaError(int a) {
		
		String estado="";
		switch(a) {
		case(1):estado="  \n  \n  \n  \n  \n +------ ";break;
		case(2):estado=" + \n | \n | \n | \n | \n +------ ";break;
		case(3):estado=" +----+ \n | \n | \n | \n | \n +------ ";break;
		case(4):estado=" +----+ \n |    | \n | \n | \n | \n +------ ";break;
		case(5):estado=" +----+ \n |    | \n |    () \n | \n | \n +------ ";break;
		case(6):estado=" +----+ \n |    | \n |    () \n |    [] \n | \n +------ ";break;
		case(7):estado=" +----+ \n |    | \n |    () \n |   /[] \n | \n +------ ";break;
		case(8):estado=" +----+ \n |    | \n |    () \n |   /[]\\ \n | \n +------ ";break;
		case(9):estado=" +----+ \n |    | \n |    () \n |   /[]\\ \n |    /  \n +------ ";break;
		case(10):estado=" +----+ \n |    | \n |    () \n |   /[]\\ \n |    /\\  \n +------ "; break;
		
		default: estado="Persiste"; break;
		
		}
		
		
		return  estado;
		
	}

	

}
