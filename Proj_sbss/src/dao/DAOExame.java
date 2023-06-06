package dao;

import java.util.List;

import org.hibernate.Session;

import model.Exame;

public class DAOExame {
	
	
	public void inserirExame(Exame exa) {
		Session sessao = ConexaoBD.getPesquisa().openSession();
		sessao.beginTransaction();
		sessao.save(exa);
		sessao.getTransaction().commit();
		sessao.close();
	}
	
	public void excluirExame(Exame exa) {
		Session sessao = ConexaoBD.getPesquisa().openSession();
		sessao.beginTransaction();
		sessao.delete(exa);
		sessao.getTransaction().commit();
		sessao.close();
	}
	
	public void editarExame(Exame exa) {
		Session sessao = ConexaoBD.getPesquisa().openSession();
		sessao.beginTransaction();
		sessao.update(exa);
		sessao.getTransaction().commit();
		sessao.close();
	}
	
	public List<Exame> listarExame() {
		Session sessao = ConexaoBD.getPesquisa().openSession();
		sessao.beginTransaction();
		List<Exame> exames = sessao.createQuery("FROM Exame").list();
		sessao.getTransaction().commit();
		sessao.close();
		return exames;
	}
	
	public Exame localizarExame(int id) {
		Session sessao = ConexaoBD.getPesquisa().openSession();
		sessao.beginTransaction();
		Exame obj = (Exame) sessao.createQuery("FROM Exame WHERE id = " + id).uniqueResult();
		sessao.getTransaction().commit();
		sessao.close();
		return obj;
	}

}