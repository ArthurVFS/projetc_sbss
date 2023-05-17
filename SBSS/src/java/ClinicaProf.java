package java;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ClinicaProf {
	
    @Id
    @GeneratedValue
	private int id;
    
    @ManyToOne
	private Profissional profissionais;
    
    @ManyToOne
	private Clinica clinicas;
	
	
	
	
	public ClinicaProf(Profissional profissionais, Clinica clinicas) {
		this.profissionais = profissionais;
		this.clinicas = clinicas;	
			
	}
	
	public ClinicaProf() {
	  
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public Profissional getProfissionais() {
		return profissionais;
	}
	public void setProfissionais(Profissional profissionais) {
		this.profissionais = profissionais;
	}
	public Clinica getClinicas() {
		return clinicas;
	}
	public void setClinicas(Clinica clinicas) {
		this.clinicas = clinicas;
	}
	
	

}
