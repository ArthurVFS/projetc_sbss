package java;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Equipamento {
	
	@Id
	@GeneratedValue
	private int id;
	private String nomeEquip;
	
	
	
	public Equipamento() {
	
	}

	public Equipamento( String nomeEquip) {
		this.nomeEquip = nomeEquip;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomeEquip() {
		return nomeEquip;
	}
	public void setNomeEquip(String nomeEquip) {
		this.nomeEquip = nomeEquip;
	}
	
	

}
