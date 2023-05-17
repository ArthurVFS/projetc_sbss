package java;

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
	private ClinicaProf clinicaProfs;
	
	@ManyToOne
	private ClinicaExam clinicaExams;
	
	@ManyToOne
	private Avaliacao avaliacoes;
	
	
	

	public Clinica() {
		
	}

	public Clinica(ClinicaProf clinicaProfs, ClinicaExam clinicaExams, Avaliacao avaliacoes) {

		this.clinicaProfs = clinicaProfs;
		this.clinicaExams = clinicaExams;
		this.avaliacoes = avaliacoes;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ClinicaProf getClinicaProfs() {
		return clinicaProfs;
	}

	public void setClinicaProfs(ClinicaProf clinicaProfs) {
		this.clinicaProfs = clinicaProfs;
	}

	public ClinicaExam getClinicaExams() {
		return clinicaExams;
	}

	public void setClinicaExams(ClinicaExam clinicaExams) {
		this.clinicaExams = clinicaExams;
	}

	public Avaliacao getAvaliacoes() {
		return avaliacoes;
	}

	public void setAvaliacoes(Avaliacao avaliacoes) {
		this.avaliacoes = avaliacoes;
	}
	
	
	

}
