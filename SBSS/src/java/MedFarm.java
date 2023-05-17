package java;

public class MedFarm {

	private int id;
	private Medicamento medicamentos;
	private Farmacia farmacias;
	
	
	
	
	public MedFarm(Medicamento medicamentos, Farmacia farmacias) {
		this.medicamentos = medicamentos;
		this.farmacias = farmacias;
	}
	
	
	public MedFarm() {
		
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Medicamento getMedicamentos() {
		return medicamentos;
	}
	public void setMedicamentos(Medicamento medicamentos) {
		this.medicamentos = medicamentos;
	}
	public Farmacia getFarmacias() {
		return farmacias;
	}
	public void setFarmacias(Farmacia farmacias) {
		this.farmacias = farmacias;
	}
	
	
	
	



}
