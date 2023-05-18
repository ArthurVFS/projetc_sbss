package java;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class Fornecedor {
	
	@Id
	@GeneratedValue
	private int id;
	private String nome;
	private String telefone;
	
	@ManyToOne
	private Endereco enderecos;
	
	@ManyToOne
	private EquiFor equipsFor;
	
	
	
	public Fornecedor() {
		
	}


	public Fornecedor(String nome, String telefone, Endereco enderecos, EquiFor equipsFor) {
		this.nome = nome;
		this.telefone = telefone;
		this.enderecos = enderecos;
		this.equipsFor = equipsFor;
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Endereco getEnderecos() {
		return enderecos;
	}
	public void setEnderecos(Endereco enderecos) {
		this.enderecos = enderecos;
	}
	public EquiFor getEquipsFor() {
		return equipsFor;
	}
	public void setEquipsFor(EquiFor equipsFor) {
		this.equipsFor = equipsFor;
	}
	
	
	

}
