package condicinales;

    import java.util.Scanner;
 
    public class Condiciones{

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		
		/**
		 * Hacer un programa que tome por entrada un car�cter y determine si el caracter introducido es '1' '2' � 'X'.
		 *Como restricci�n, no se puede hacer uso de los operadores booleanos || &&
		 *i el caracter introducido no es v�lido mostrar� el mensaje "Caracter no v�lido"
		 */
		
		System.out.println("indica un caracter");
		
		char caracter= sc.nextLine().charAt(0);// leo o primer caracter introducido, como un array

		
		String imprime= null;
		
        if(caracter=='1'){
        	
        }
        else if(caracter=='2')
            {}
            else if(caracter=='x')
                {}
                else  { 
                    imprime="no valido";
                };
		
        
		
		System.out.println(imprime);
		/**
		 * Hacer un programa que tome por entrada un car�cter y determine si el caracter introducido es '1' '2' � 'X'.
		 *Como restricci�n, no se puede hacer uso de los operadores booleanos || &&
		 *Mostrar� un mensaje indicando si el caracter introducido es v�lido o no.
		 */
		System.out.println("indica un caracter");
		char caracter2=sc.nextLine().charAt(0);
		String imprime2=null;
		
		if(caracter2=='1'){
			imprime2="caracter valido";	
        }
        else if(caracter2=='2')
            {imprime2="caracter valido";}
            else if(caracter2=='x')
                {imprime2="caracter valido";}
                else  { 
                    imprime2="no valido";
                };
		
       System.out.println(imprime2);
       
       
       /**
        * Supongamos una botonera de un ascensor con n�meros del -1 al 5.
        *Hacer un programa que solicite un n�mero que ser� el piso al que se desea ir.
        *En el caso de que se pulse un n�mero del 0 al 5 el programa mostrar� el mensaje "yendo al piso " seguido del n�mero pulsado.
        *En el caso de que pulse el -1, el programa solicitar� un c�digo clave (por simplicidad del programa ser� un n�mero entero) para poder acceder al garaje.
        *Si el n�mero introducido es el "3852" se mostrar� el mensaje "Acceso permitido"
        *En caso contrario mostrar� el mensaje "Acceso denegado"
        * 
        * 
        */
       
       System.out.println("indica el piso al que desa ir(-1,0,1,2,3,4,5)");
       
       int piso=sc.nextInt();
      
       
       if((0<=piso)&&(piso<=5)) {
    	   System.out.println("esta yendo al piso  "+ piso );  
       }else if(piso==-1){
    	   System.out.println("introduzca el codigo de acceso" );  
    	   int codacc=sc.nextInt();
    	   if(codacc==3852) {
    		   System.out.println("acceso permitido");
    	   }else {
    		   System.out.println("acceso denegado");
    	   }
       } else {
    	   System.out.println("El piso introducido no es correcto" );
       }
       
       
		
		
		sc.close();
		
		
}
}
