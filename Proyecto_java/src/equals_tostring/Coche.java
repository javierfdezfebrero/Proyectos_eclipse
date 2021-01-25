package equals_tostring;

public class Coche extends Vehiculo {
	

	private int plazas;
	 
	//constructor
	 
	 public Coche(String newMarca, String newModelo, int newAutonomia, int plazas) {
		this.plazas = plazas;
		setMarca(newMarca);
		setModelo(newModelo);
		setAutonomia(newAutonomia);
	}
	 
	public Coche() {
		super();
	}
	 
	
// @Override
	
	public boolean equals(Object otrocoche) {
		if(otrocoche instanceof Coche) {
			Coche newC= (Coche) otrocoche;
			if(this.plazas==newC.plazas && this.getMarca()== newC.getMarca()&&this.getModelo()==newC.getModelo()&&this.getAutonomia()==newC.getAutonomia())
				return true;
		}
		return false;
	}
	
	
	public String toString() {
		return "Marca: " + getMarca() + "Modelo: " + getModelo() + "Autonomia: " + getAutonomia() + "Plazas: " + plazas;
		
	}
	
	
	
//Getters Setters
	public int getPlazas() {
		return plazas;
	}

	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}
	 
	 

}
