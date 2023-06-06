package dao;

import java.util.List;

import org.hibernate.Session;

import model.Endereco;

public class DAOEndereco {
		
	public void inserirEndereco(Endereco end) {
		Session sessao = ConexaoBD.getPesquisa().openSession();
		sessao.beginTransaction();
		sessao.save(end);
		sessao.getTransaction().commit();
		sessao.close();
	}
	
	public void excluirEndereco(Endereco end) {
		Session sessao = ConexaoBD.getPesquisa().openSession();
		sessao.beginTransaction();
		sessao.delete(end);
		sessao.getTransaction().commit();
		sessao.close();
	}
	
	public void editarEndereco(Endereco end) {
		Session sessao = ConexaoBD.getPesquisa().openSession();
		sessao.beginTransaction();
		sessao.update(end);
		sessao.getTransaction().commit();
		sessao.close();
	}
	
	public List<Endereco> listarEndereco() {
		Session sessao = ConexaoBD.getPesquisa().openSession();
		sessao.beginTransaction();
		List<Endereco> enderecos = sessao.createQuery("FROM Endereco").list();
		sessao.getTransaction().commit();
		sessao.close();
		return enderecos;
	}
	
	public Endereco localizarEndereco(int id) {
		Session sessao = ConexaoBD.getPesquisa().openSession();
		sessao.beginTransaction();
		Endereco obj = (Endereco) sessao.createQuery("FROM Endereco WHERE id = " + id).uniqueResult();
		sessao.getTransaction().commit();
		sessao.close();
		return obj;
	}

}
