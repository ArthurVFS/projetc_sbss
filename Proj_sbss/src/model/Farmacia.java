package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Farmacia extends Fornecedor {
	
	
    @Id
    @GeneratedValue
	private int id;
    
    @ManyToOne
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
