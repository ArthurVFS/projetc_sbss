package dao;

import java.util.List;

import org.hibernate.Session;

import model.PlanoSaude;

public class DAOPlanoSaude {
	
	
	public void inserirPlanoSaude(PlanoSaude planSau) {
		Session sessao = ConexaoBD.getPesquisa().openSession();
		sessao.beginTransaction();
		sessao.save(planSau);
		sessao.getTransaction().commit();
		sessao.close();
	}
	
	public void excluirPlanoSaude(PlanoSaude planSau) {
		Session sessao = ConexaoBD.getPesquisa().openSession();
		sessao.beginTransaction();
		sessao.delete(planSau);
		sessao.getTransaction().commit();
		sessao.close();
	}
	
	public void editarPlanoSaude(PlanoSaude planSau) {
		Session sessao = ConexaoBD.getPesquisa().openSession();
		sessao.beginTransaction();
		sessao.update(planSau);
		sessao.getTransaction().commit();
		sessao.close();
	}
	
	public List<PlanoSaude> listarPlanoSaude() {
		Session sessao = ConexaoBD.getPesquisa().openSession();
		sessao.beginTransaction();
		List<PlanoSaude> planoSaudes = sessao.createQuery("FROM PlanoSaude").list();
		sessao.getTransaction().commit();
		sessao.close();
		return planoSaudes;
	}
	
	public PlanoSaude localizarPlanoSaude(int id) {
		Session sessao = ConexaoBD.getPesquisa().openSession();
		sessao.beginTransaction();
		PlanoSaude obj = (PlanoSaude) sessao.createQuery("FROM PlanoSaude WHERE id = " + id).uniqueResult();
		sessao.getTransaction().commit();
		sessao.close();
		return obj;
	}

}