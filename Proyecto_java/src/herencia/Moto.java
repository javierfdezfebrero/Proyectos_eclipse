package herencia;

public class Moto extends Vehiculo{

	private String cardan;
	private String carenado;
	
	
	public Moto(String newMarca, String newModelo, int newAutonomia,String cardan, String carenado) {
		super(newMarca, newModelo, newAutonomia);
		this.cardan = cardan;
		this.carenado = carenado;
	}
	
	
	
	
	public String isCardan() {
		return cardan;
	}

	public void setCardan(String cardan) {
		this.cardan = cardan;
	}


	public String isCarenado() {
		return carenado;
	}


	public void setCarenado(String carenado) {
		this.carenado = carenado;
	}



	
	
}
