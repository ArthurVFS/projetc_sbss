package java;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;



@Entity
public class Exame {
	
	@Id
	@GeneratedValue
	private int id;
	private String nome;
	
	@ManyToOne
	private ClinicaExam clinicasExam;

	
	
	
	public Exame() {

	}

	public Exame(String nome, ClinicaExam clinicasExam) {
	
		this.nome = nome;
		this.clinicasExam = clinicasExam;
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

	public ClinicaExam getClinicasExam() {
		return clinicasExam;
	}

	public void setClinicasExam(ClinicaExam clinicasExam) {
		this.clinicasExam = clinicasExam;
	}
	
	
	

}
