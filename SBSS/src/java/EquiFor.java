package java;

public class EquiFor {

	private int id;
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
