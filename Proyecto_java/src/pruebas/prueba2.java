package pruebas;

import java.util.Scanner;

public class prueba2 {

	public static void main(String[] args) {
	final String miNombre = "Jordi";
	Scanner input = new Scanner(System.in);
	System.out.println("Adivina mi nombre: ");

	while (true) {
	    String intento = input.next();
	    if(intento == miNombre) {
	        System.out.println("Acertaste!");
	        break;
	    } else {
	        System.out.println("Intentalo de nuevo!");
	    }
	}
	input.close();
}
}
