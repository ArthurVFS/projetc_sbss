package java;

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
	
	@ManyToOne
	private Profissional profissionais;
	
	

	public PlanoSaude() {
	
	}

	public PlanoSaude(String nomeP, Profissional profissionais) {
	
		this.nomeP = nomeP;
		this.profissionais = profissionais;
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

	public Profissional getProfissionais() {
		return profissionais;
	}

	public void setProfissionais(Profissional profissionais) {
		this.profissionais = profissionais;
	}
	
	
	
	
	
	
	
	

}
