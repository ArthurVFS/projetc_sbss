package java;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Profissional {
	
    @Id
    @GeneratedValue
	private int id;
	private String nome;
	
	
	@ManyToOne
	private Especialidade especialidades;
	
	@ManyToOne
	private PlanoSaude planosSaude;
	
	
	

	public Profissional() {
		
	}

	public Profissional(String nome, Especialidade especialidades, PlanoSaude planosSaude) {

		this.nome = nome;
		this.especialidades = especialidades;
		this.planosSaude = planosSaude;
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


	public Especialidade getEspecialidades() {
		return especialidades;
	}

	public void setEspecialidades(Especialidade especialidades) {
		this.especialidades = especialidades;
	}

	public PlanoSaude getPlanosSaude() {
		return planosSaude;
	}

	public void setPlanosSaude(PlanoSaude planosSaude) {
		this.planosSaude = planosSaude;
	}
	
	

}
