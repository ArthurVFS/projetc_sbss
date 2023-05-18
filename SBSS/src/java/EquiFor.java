package java;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class EquiFor {
	
    @Id
    @GeneratedValue
	private int id;
    
    @ManyToOne
	private Equipamento equipamentos;
	
	
	
	
	public EquiFor() {
		
	}


	public EquiFor(Equipamento equipamentos) {
		
		this.equipamentos = equipamentos;
	}
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Equipamento getEquipamentos() {
		return equipamentos;
	}
	public void setEquipamentos(Equipamento equipamentos) {
		this.equipamentos = equipamentos;
	}
	
	

}
