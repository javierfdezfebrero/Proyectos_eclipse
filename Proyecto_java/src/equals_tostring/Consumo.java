package equals_tostring;

public class Consumo  {

	private int kms;
	private int litros;
	private int vmed;
	private int pgas;
	
	
	
	
	
	
	//constructores
	
	public Consumo() {
	}
	
	public Consumo(int newkms, int newlitros, int newvmed, int newpgas) {
		
		this.kms=newkms;
		this.litros=newlitros;
		this.vmed=newvmed;
		this.pgas=newpgas;
	}
	
	
	
	
	
	//metodo equals
	
	public boolean equals( Object obj) {
		if (obj instanceof Consumo) {
			Consumo newConsumo= (Consumo) obj;
		 		if(this.consumoMedio()== newConsumo.consumoMedio())
		 				return true;
		}
		 	return false;
	}
	
	
	
	
	
	
	
	//metodos especiales
	
	
	public int getTiempo(){
		
		return vmed/kms;
		
	}
	
	public int consumoMedio() {
		return (litros*100)/kms;
	}
	
	public int consumoEuros() {
		return ((pgas*litros)*100)/kms;
	}

	
	
	
	
	//getters y setters basicos
	
	public int getKms() {
		return kms;
	}

	public void setKms(int kms) {
		this.kms = kms;
	}

	public int getLitros() {
		return litros;
	}

	public void setLitros(int litros) {
		this.litros = litros;
	}

	public int getVmed() {
		return vmed;
	}

	public void setVmed(int vmed) {
		this.vmed = vmed;
	}

	public int getPgas() {
		return pgas;
	}

	public void setPgas(int pgas) {
		this.pgas = pgas;
	}
	
	
}
