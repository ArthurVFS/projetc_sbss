package dao;
import java.util.List;

import org.hibernate.Session;

import model.Fornecedor;

public class DAOFornecedor {
	
	
	public void inserirFornecedor(Fornecedor forn) {
		Session sessao = ConexaoBD.getPesquisa().openSession();
		sessao.beginTransaction();
		sessao.save(forn);
		sessao.getTransaction().commit();
		sessao.close();
	}
	
	public void excluirFornecedor(Fornecedor forn) {
		Session sessao = ConexaoBD.getPesquisa().openSession();
		sessao.beginTransaction();
		sessao.delete(forn);
		sessao.getTransaction().commit();
		sessao.close();
	}
	
	public void editarFornecedor(Fornecedor forn) {
		Session sessao = ConexaoBD.getPesquisa().openSession();
		sessao.beginTransaction();
		sessao.update(forn);
		sessao.getTransaction().commit();
		sessao.close();
	}
	
	public List<Fornecedor> listarFornecedor() {
		Session sessao = ConexaoBD.getPesquisa().openSession();
		sessao.beginTransaction();
		List<Fornecedor> fornecedores = sessao.createQuery("FROM Fornecedor").list();
		sessao.getTransaction().commit();
		sessao.close();
		return fornecedores;
	}
	
	public Fornecedor localizarFornecedor(int id) {
		Session sessao = ConexaoBD.getPesquisa().openSession();
		sessao.beginTransaction();
		Fornecedor obj = (Fornecedor) sessao.createQuery("FROM Fornecedor WHERE id = " + id).uniqueResult();
		sessao.getTransaction().commit();
		sessao.close();
		return obj;
	}

}
