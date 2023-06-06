package dao;

import java.util.List;

import org.hibernate.Session;

import model.Especialidade;

public class DAOEspecialista {
	
	
	public void inserirEspecialidade(Especialidade espe) {
		Session sessao = ConexaoBD.getPesquisa().openSession();
		sessao.beginTransaction();
		sessao.save(espe);
		sessao.getTransaction().commit();
		sessao.close();
	}
	
	public void excluirEspecialidade(Especialidade espe) {
		Session sessao = ConexaoBD.getPesquisa().openSession();
		sessao.beginTransaction();
		sessao.delete(espe);
		sessao.getTransaction().commit();
		sessao.close();
	}
	
	public void editarEspecialidade(Especialidade espe) {
		Session sessao = ConexaoBD.getPesquisa().openSession();
		sessao.beginTransaction();
		sessao.update(espe);
		sessao.getTransaction().commit();
		sessao.close();
	}
	
	public List<Especialidade> listarEspecialidade() {
		Session sessao = ConexaoBD.getPesquisa().openSession();
		sessao.beginTransaction();
		List<Especialidade> especialidades = sessao.createQuery("FROM Especialidade").list();
		sessao.getTransaction().commit();
		sessao.close();
		return especialidades;
	}
	
	public Especialidade localizarEspecialidade(int id) {
		Session sessao = ConexaoBD.getPesquisa().openSession();
		sessao.beginTransaction();
		Especialidade obj = (Especialidade) sessao.createQuery("FROM Especialidade WHERE id = " + id).uniqueResult();
		sessao.getTransaction().commit();
		sessao.close();
		return obj;
	}

}