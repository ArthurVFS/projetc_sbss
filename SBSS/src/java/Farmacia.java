package java;

public class Farmacia extends Fornecedor {

	private int id;
	private Medicamento medicamentos;
	
	

	public Farmacia(Medicamento medicamentos) {
		this.medicamentos = medicamentos;
	}
	
	
	public Farmacia() {
		
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
	
	
	
	
	
	

}
