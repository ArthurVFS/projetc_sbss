package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Clinica extends Fornecedor {

	
	@Id
	@GeneratedValue
	private int id;
	
	
	
	@ManyToOne
	private Avaliacao avaliacoes;
	
	
	

	public Clinica() {
		
	}

	public Clinica( Avaliacao avaliacoes) {

		this.avaliacoes = avaliacoes;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Avaliacao getAvaliacoes() {
		return avaliacoes;
	}

	public void setAvaliacoes(Avaliacao avaliacoes) {
		this.avaliacoes = avaliacoes;
	}
	
	
	

}
