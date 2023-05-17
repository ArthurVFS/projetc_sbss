package java;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ClinicaExam {
    
	@Id
	@GeneratedValue
	private int id;
	
	@ManyToOne
	private Exame exames;
	
	@ManyToOne
	private Clinica clinicas;

}
