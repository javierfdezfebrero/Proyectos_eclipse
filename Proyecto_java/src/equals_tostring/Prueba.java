package equals_tostring;

public class Prueba {

	
	public static void main(String[] args) {
		
		Consumo c1= new Consumo( 1,1,1,1);
		Consumo c2= new Consumo( 1,1,1,1);
		
		System.out.println(c1.equals(c2));
		
		////non me funciona
		
		Vehiculo v1=new Vehiculo("seat", "leon", 1,1,1,1);
		Vehiculo v2=new Vehiculo("seat", "leon", 1,1,1,1);
		System.out.println(v2.equals(v1));
		System.out.println(v2.toString());
		
		
		Coche p1= new Coche("seat", "leon", 4, 4);
		Coche p2= new Coche("seat", "leon", 4, 4);
		System.out.println(p1.equals(p2));
		System.out.println(p2.toString());
		
		
	
	}
}
