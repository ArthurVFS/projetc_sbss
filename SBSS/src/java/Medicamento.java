package java;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Medicamento {
	
    @Id
    @GeneratedValue
	private int id;
	private String nome;
	
	@ManyToOne
	private MedFarm medFarms;
	
	
	
	
	public Medicamento() {
		
	}
	
	public Medicamento(String nome, MedFarm medFarms) {

		this.nome = nome;
		this.medFarms = medFarms;
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
	public MedFarm getMedFarms() {
		return medFarms;
	}
	public void setMedFarms(MedFarm medFarms) {
		this.medFarms = medFarms;
	}
	
	

}
