package java;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class MedFarm {
	
    @Id
    @GeneratedValue
	private int id;
    
    @ManyToOne
	private Medicamento medicamentos;
    
    @ManyToOne
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
