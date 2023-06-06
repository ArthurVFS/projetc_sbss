package dao;

import java.util.List;

import org.hibernate.Session;

import model.Clinica;

public class DAOClinica {
	
	
	public void inserirClinica(Clinica cli) {
		Session sessao = ConexaoBD.getPesquisa().openSession();
		sessao.beginTransaction();
		sessao.save(cli);
		sessao.getTransaction().commit();
		sessao.close();
	}
	
	public void excluirClinica(Clinica cli) {
		Session sessao = ConexaoBD.getPesquisa().openSession();
		sessao.beginTransaction();
		sessao.delete(cli);
		sessao.getTransaction().commit();
		sessao.close();
	}
	
	public void editarClinica(Clinica cli) {
		Session sessao = ConexaoBD.getPesquisa().openSession();
		sessao.beginTransaction();
		sessao.update(cli);
		sessao.getTransaction().commit();
		sessao.close();
	}
	
	public List<Clinica> listarClinica() {
		Session sessao = ConexaoBD.getPesquisa().openSession();
		sessao.beginTransaction();
		List<Clinica> clinicas = sessao.createQuery("FROM Clinica").list();
		sessao.getTransaction().commit();
		sessao.close();
		return clinicas;
	}
	
	public Clinica localizarClinica(int id) {
		Session sessao = ConexaoBD.getPesquisa().openSession();
		sessao.beginTransaction();
		Clinica obj = (Clinica) sessao.createQuery("FROM Clinica WHERE id = " + id).uniqueResult();
		sessao.getTransaction().commit();
		sessao.close();
		return obj;
	}

}
