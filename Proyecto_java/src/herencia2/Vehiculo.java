package herencia2;


public class Vehiculo {
	
	private String marca;
	private String modelo;
	private int autonomia;
	private Consumo consumo;
	

	public static int numeroDeVehiculos=0;
	
	
	
	/**
	 * Constructores
	 */
	
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
	
	
	/*
	*@Override
	*
	*/
	
	public boolean equals(Object otroVehiculo) {
		if (otroVehiculo instanceof Vehiculo) {
			Vehiculo newV = (Vehiculo) otroVehiculo;
			if( this.marca == newV.getMarca() && this.getModelo()==newV.getModelo() && this.consumo.equals(newV.consumo))
				return true;
		}
		return false;
	}
	
	
	
	
	
	public String toString() {
		return "Marca: " + marca + "Modelo: " + modelo + "Autonomia: " + autonomia + "Consumo: " + this.consumo.consumoMedio();
		
	}
	
	
	
	/*
	*metodos getters setters
	*
	*/
	
	
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
