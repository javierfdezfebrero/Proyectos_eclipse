package herencia;

public class Coche extends Vehiculo {
	

	private int plazas;
	 
	 
	 public Coche(String newMarca, String newModelo, int newAutonomia, int plazas) {
		this.plazas = plazas;
		setMarca(newMarca);
		setModelo(newModelo);
		setAutonomia(newAutonomia);
	}
	 
	public Coche() {
		super();
	}
	 

	public int getPlazas() {
		return plazas;
	}

	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}
	 
	 

}
