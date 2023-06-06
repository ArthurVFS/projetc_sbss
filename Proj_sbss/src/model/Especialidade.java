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
	
	
	
	public Especialidade() {
		super();
	}
	public Especialidade(String nomeEspec) {
		super();
		this.nomeEspec = nomeEspec;
	}
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
	

	
	
	
	

}
