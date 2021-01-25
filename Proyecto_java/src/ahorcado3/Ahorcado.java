package ahorcado3;

import java.util.Scanner;

public class Ahorcado {

	private static final String PALABRAOBJETIVO = "PROGRAMANDO";

	private  static int fallos=0;
	private static char[] letrasjugadas= new char[11];
	private static char[] letrasacertadas= new char[11];
	private static int contador=0;
	private static String result=String.valueOf(letrasjugadas);
	//private  static int ultimo=0;
	
	
	public static void main(String[] args) {

		for (int i=0; i<letrasacertadas.length; i++) {
			letrasacertadas[i]='-';
		}


		Scanner sc= new Scanner(System.in);

		while(fallos<=10) {
			System.out.print("Inserta una letra"+"\n");
			char letra=sc.next().charAt(0);
			boolean comp=false;


			for(int i=0; i<PALABRAOBJETIVO.length();i++) {
				if (letra==PALABRAOBJETIVO.charAt(i)) {
					comp=true;
					letrasacertadas[i]= letra ;
					//gana++;
				}



			}
			if(comp) {
				System.out.print("Sii, es la letra correcta"+"\n");
				System.out.print(compruebaError(fallos)+"\n");
				System.out.print("Letras correctas: "+String.valueOf(letrasacertadas)+"\n");
				System.out.print("Letras ya usadas: "+String.valueOf(letrasjugadas)+"\n");
				if (result==PALABRAOBJETIVO) {
					System.out.println("   -------  ");
					System.out.println(" -----------  ");
					System.out.println(" ENHORABUENA  ");
					System.out.println("  ACERTASTE  ");
					System.out.println(" -----------  ");
					System.out.println("   -------  ");
				}

			}else {
				letrasjugadas[contador]=letra;
				System.out.print("No es la letra correcta"+"\n");
				System.out.print(compruebaError(fallos)+"\n");
				System.out.print("Letras correctas: "+String.valueOf(letrasacertadas)+"\n");
				System.out.print("Letras ya usadas: "+String.valueOf(letrasjugadas)+"\n");
				fallos++;

				contador++;
				if (fallos==11) {
						
					ultimoIntento();
				
			}


		}	
		}
		sc.close();
	}
		

		


	




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

		default: estado="_________"
				+ ""; break;

		}


		return  estado;

	}

	/**
	 * metodo para realizar un ultimo intento
	 */
	public static void ultimoIntento() {
		System.out.println("Ultimo intento, introduce una palabra, suertee"+"\n");
		
		Scanner sc=new Scanner(System.in);
		String intento= sc.nextLine();
		
			boolean r=false;
			
			if(PALABRAOBJETIVO.equals(intento)) {
				r=true;
			}
			if(r) {	
				System.out.print("lo lograste");
			}else {
				fallos++;
				System.out.println("   Noooop  ");
				System.out.println("   -------  ");
				System.out.println(" -----------  ");
				System.out.println(" GAME  OVER  ");
			}
			sc.close();
		}

	
	
		
	}
	

