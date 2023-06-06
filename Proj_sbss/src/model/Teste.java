package model;




import dao.DAOEspecialidade;
import dao.DAOPlanoSaude;
import dao.DaoProfissional;



public class Teste {
	public static void main(String[] args) {
		
//		PlanoSaude pl = new PlanoSaude("Unimed");
//		DAOPlanoSaude daoPl = new DAOPlanoSaude();
//		daoPl.inserirPlanoSaude(pl);
//		
//		Especialidade es = new Especialidade("Cardiologista");
//		DAOEspecialidade daoE = new DAOEspecialidade();
//		daoE.inserirEspecialidade( es );
//		
//		Profissional p1 = new Profissional("Arthur", es, pl);
		DaoProfissional daoPro = new DaoProfissional();
//		daoPro.inserirProfissional( p1 );
//		
		
		
		for(Profissional pro : daoPro.listarProfissional()) {	
		System.out.println("Profissional: " + pro.getNome());
		System.out.println("--"+ pro.getEspecialidades().getNomeEspec());
		System.out.println("Atende pelos seguintes planos: " + pro.getPlanosSaude().getNomeP());
	}
		
		
	}
}

