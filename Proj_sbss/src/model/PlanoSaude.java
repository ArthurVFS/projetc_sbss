package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class PlanoSaude {
	
	@Id
	@GeneratedValue
	private int id;
	private String nomeP;
	

	public PlanoSaude() {
	
	}

	public PlanoSaude(String nomeP) {
	
		this.nomeP = nomeP;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeP() {
		return nomeP;
	}

	public void setNomeP(String nomeP) {
		this.nomeP = nomeP;
	}

	
	
	

}
