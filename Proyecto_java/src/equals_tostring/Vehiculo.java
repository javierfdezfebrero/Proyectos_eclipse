package equals_tostring;


public class Vehiculo {
	
	private String marca;
	private String modelo;
	private int autonomia;
	private Consumo consumo;
	
	public static int numeroDeVehiculos=0;
	
	
	
	
	
	public Vehiculo(){
		this.marca = "Desconocida";
		this.modelo = "desconocido";
		this.autonomia = 0;
		numeroDeVehiculos= numeroDeVehiculos + 1;
		
	}
	
	public Vehiculo(String newMarca, String newModelo, int newAutonomia ) {
		this.marca = newMarca;
		this.modelo = newModelo;
		this.autonomia = newAutonomia;
		numeroDeVehiculos= numeroDeVehiculos + 1;
		
	}
	
	
	public Vehiculo(String newMarca, String newModelo, int newkms, int newlitros, int newvmed, int newpgas  ) {
		this.marca = newMarca;
		this.modelo = newModelo;
		this.consumo = new Consumo(newkms, newlitros, newvmed, newpgas);
		
		numeroDeVehiculos= numeroDeVehiculos + 1;
		
	}
	
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAutonomia() {
		return autonomia;
	}
	public void setAutonomia(int autonomia) {
		this.autonomia = autonomia;
	}
	
	public int getnumeroDeVehiculos() {
		return numeroDeVehiculos;
	} 
	
	

}
