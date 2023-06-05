package dao;

import java.util.ArrayList;
import java.util.List;
import model.Profissional;

public class DaoProfissional {
	
	private List<Profissional> profissionais = new ArrayList<Profissional>();
	
	public void inserir(Profissional obj) {
		profissionais.add(obj);
		
		
		
	}
	
	
	public List<Profissional> listar(){
		return profissionais;		
	}

}
