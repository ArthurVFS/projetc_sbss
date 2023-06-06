package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Especialidade {
	
	@Id
	@GeneratedValue
	private int id;
	private String nomeEspec;
	
	@ManyToOne
	private Profissional profissionais;
	
	
	
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	public String getNomeEspec() {
		return nomeEspec;
	}
	public void setNomeEspec(String nomeEspec) {
		this.nomeEspec = nomeEspec;
	}
	public Profissional getProfissionais() {
		return profissionais;
	}
	public void setProfissionais(Profissional profissionais) {
		this.profissionais = profissionais;
	}

	
	
	
	

}
