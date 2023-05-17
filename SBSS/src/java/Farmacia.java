package java;

public class Farmacia extends Fornecedor {

	private int id;
	private MedFarm medsFarm;
	
	
	
	public Farmacia(MedFarm medsFarm) {

		this.medsFarm = medsFarm;
	}
	
	
	public Farmacia() {

	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public MedFarm getMedsFarm() {
		return medsFarm;
	}
	public void setMedsFarm(MedFarm medsFarm) {
		this.medsFarm = medsFarm;
	}
	
	
	

}
