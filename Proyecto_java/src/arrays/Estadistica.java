package arrays;

public class Estadistica {

	static int[] tempmax= {22, 18, 13, 10, 11, 12, 12, 14, 15, 16, 16, 16, 16, 16};
	static int[] tempmin= {9, 10, 6, 4, 4, 8, 8, 8, 9, 10, 10, 9, 9, 11};
	
	
	/**
	 * La media de las temperaturas
	 */
	private static double media = 0.0;
	public static double media(int[] a){
		
		for(int i=0; i<a.length; i++) {
			
			media = media +a[i];
			
		}
		
		return  (double)media/a.length;
		
	}
	
	
	/**
	 * La moda de las temperaturas 
	 * @param a
	 * @return
	 */
	
	/*public static int moda(int[] a) {
		int cont1=0;
		for (int i=0; i<a.length; i++) {
			if(a[i]==a[i+1]) {
				cont1++;
				if(cont1<cont2) {
					
				}
			}
			
		}
		
		return 4;
		
	}*/
	
	public static void main(String[] args) {
		System.out.println(media(tempmin));
	}
	
}
