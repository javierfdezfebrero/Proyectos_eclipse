package ahorcado3;

import java.util.Scanner;

public class Ahorcado {

	private static final String PALABRAOBJETIVO = "PROGRAMANDO";

	private  static int fallos=0;
	private static char[] letrasjugadas= new char[11];
	private static char[] letrasacertadas= new char[11];
	private static int contador=0;
	private static String result=String.valueOf(letrasjugadas);


	public static void main(String[] args) {



		Scanner sc= new Scanner(System.in);

		while(fallos<=10 || PALABRAOBJETIVO==result) {
			System.out.print("Inserta una letra"+"\n");
			char letra=sc.next().charAt(0);
			boolean comp=false;


			for(int i=0; i<PALABRAOBJETIVO.length();i++) {
				if (letra==PALABRAOBJETIVO.charAt(i)) {
					comp=true;
					letrasacertadas[i]= letra ;
				}



			}
			if(comp) {
				System.out.print("Si es la letra correcta"+"\n");
				System.out.print(compruebaError(fallos)+"\n");
				System.out.print(String.valueOf(letrasacertadas)+"\n");
			}else {
				letrasjugadas[contador]=letra;
				System.out.print("No es la letra correcta"+"\n");
				System.out.print(compruebaError(fallos)+"\n");
				System.out.print(String.valueOf(letrasacertadas)+"\n");
				System.out.print(String.valueOf(letrasjugadas)+"\n");
				fallos++;

				contador++;
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

}
