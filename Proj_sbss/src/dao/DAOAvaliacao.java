package dao;
import java.util.List;

import org.hibernate.Session;

import model.Avaliacao;

public class DAOAvaliacao {
	
	
	public void inserirAvaliacao(Avaliacao ava) {
		Session sessao = ConexaoBD.getPesquisa().openSession();
		sessao.beginTransaction();
		sessao.save(ava);
		sessao.getTransaction().commit();
		sessao.close();
	}
	
	public void excluirAvaliacao(Avaliacao ava) {
		Session sessao = ConexaoBD.getPesquisa().openSession();
		sessao.beginTransaction();
		sessao.delete(ava);
		sessao.getTransaction().commit();
		sessao.close();
	}
	
	public void editarAvaliacao(Avaliacao ava) {
		Session sessao = ConexaoBD.getPesquisa().openSession();
		sessao.beginTransaction();
		sessao.update(ava);
		sessao.getTransaction().commit();
		sessao.close();
	}
	
	public List<Avaliacao> listarAvaliacao() {
		Session sessao = ConexaoBD.getPesquisa().openSession();
		sessao.beginTransaction();
		List<Avaliacao> avafissionais = sessao.createQuery("FROM Avaliacao").list();
		sessao.getTransaction().commit();
		sessao.close();
		return avafissionais;
	}
	
	public Avaliacao localizarAvaliacao(int id) {
		Session sessao = ConexaoBD.getPesquisa().openSession();
		sessao.beginTransaction();
		Avaliacao obj = (Avaliacao) sessao.createQuery("FROM Avaliacao WHERE id = " + id).uniqueResult();
		sessao.getTransaction().commit();
		sessao.close();
		return obj;
	}

}
