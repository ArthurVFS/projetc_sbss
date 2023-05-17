package java;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Especialidade {
	
	@Id
	@GeneratedValue
	private int codigo;
	private String nomeEspec;

	
	public Especialidade() {
		
	}
	
	public Especialidade( String nomeEspec) {
		
		this.nomeEspec = nomeEspec;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getNomeEspec() {
		return nomeEspec;
	}
	
	public void setNomeEspec(String nomeEspec) {
		this.nomeEspec = nomeEspec;
	}
	
	

}
