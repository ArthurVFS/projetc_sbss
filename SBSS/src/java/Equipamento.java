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
	private EquiFor equipsFor;
	
	
	
	
	
	
	public Equipamento() {
		
	}
	
	public Equipamento(String nomeEquip, EquiFor equipsFor) {
		
		this.nomeEquip = nomeEquip;
		this.equipsFor = equipsFor;
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
	public EquiFor getEquipsFor() {
		return equipsFor;
	}
	public void setEquipsFor(EquiFor equipsFor) {
		this.equipsFor = equipsFor;
	}
	
	
	
	
	

}
