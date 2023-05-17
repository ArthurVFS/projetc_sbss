package java;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

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
	
	public int getid() {
		return id;
	}
	public void setCodigo(int codigo) {
		this.id = codigo;
	}
	public String getNomeP() {
		return nomeP;
	}
	public void setNomeP(String nomeP) {
		this.nomeP = nomeP;
	}
	
	

}
