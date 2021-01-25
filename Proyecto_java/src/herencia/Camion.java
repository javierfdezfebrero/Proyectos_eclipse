package herencia;

public class Camion extends Vehiculo {
	

	private int pma;
	 
	 
	 public Camion(String newMarca, String newModelo, int newAutonomia, int pma) {
		this.pma = pma;
		setMarca(newMarca);
		setModelo(newModelo);
		setAutonomia(newAutonomia);
	}
	 
	public Camion() {
		super();
	}
	 

	public int getPMA() {
		return pma;
	}

	public void setPMA(int pma) {
		this.pma = pma;
	}
	 
	 

}
