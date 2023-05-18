package java;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class Avaliacao {

	@Id
	@GeneratedValue
	private int id;
	private float nota;
	private String comentario;
	
	@ManyToOne
	private Clinica clinica;
	
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getNota() {
		return nota;
	}
	public void setNota(float nota) {
		this.nota = nota;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public Clinica getClinica() {
		return clinica;
	}
	public void setClinica(Clinica clinica) {
		this.clinica = clinica;
	}
	
	public Avaliacao(float nota, String comentario, Clinica clinica) {
		this.nota = nota;
		this.comentario = comentario;
		this.clinica = clinica;
	}
	
	public Avaliacao() {
	}
	
	

}
