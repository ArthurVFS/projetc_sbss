package dao;

import java.util.List;

import org.hibernate.Session;

import model.Profissional;

public class DaoProfissional {
	
	
	public void inserirProfissional(Profissional pro) {
		Session sessao = ConexaoBD.getPesquisa().openSession();
		sessao.beginTransaction();
		sessao.save(pro);
		sessao.getTransaction().commit();
		sessao.close();
	}
	
	public void excluirProfissional(Profissional pro) {
		Session sessao = ConexaoBD.getPesquisa().openSession();
		sessao.beginTransaction();
		sessao.delete(pro);
		sessao.getTransaction().commit();
		sessao.close();
	}
	
	public void editarProfissional(Profissional pro) {
		Session sessao = ConexaoBD.getPesquisa().openSession();
		sessao.beginTransaction();
		sessao.update(pro);
		sessao.getTransaction().commit();
		sessao.close();
	}
	
	public List<Profissional> listarProfissional() {
		Session sessao = ConexaoBD.getPesquisa().openSession();
		sessao.beginTransaction();
		List<Profissional> profissionais = sessao.createQuery("FROM Profissional").list();
		sessao.getTransaction().commit();
		sessao.close();
		return profissionais;
	}
	
	public Profissional localizarProfissional(int id) {
		Session sessao = ConexaoBD.getPesquisa().openSession();
		sessao.beginTransaction();
		Profissional obj = (Profissional) sessao.createQuery("FROM Profissional WHERE id = " + id).uniqueResult();
		sessao.getTransaction().commit();
		sessao.close();
		return obj;
	}

}
