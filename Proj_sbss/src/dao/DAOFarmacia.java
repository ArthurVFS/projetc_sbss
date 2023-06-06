package dao;
import java.util.List;

import org.hibernate.Session;

import model.Farmacia;

public class DAOFarmacia {
	
	
	public void inserirFarmacia(Farmacia farm) {
		Session sessao = ConexaoBD.getPesquisa().openSession();
		sessao.beginTransaction();
		sessao.save(farm);
		sessao.getTransaction().commit();
		sessao.close();
	}
	
	public void excluirFarmacia(Farmacia farm) {
		Session sessao = ConexaoBD.getPesquisa().openSession();
		sessao.beginTransaction();
		sessao.delete(farm);
		sessao.getTransaction().commit();
		sessao.close();
	}
	
	public void editarFarmacia(Farmacia farm) {
		Session sessao = ConexaoBD.getPesquisa().openSession();
		sessao.beginTransaction();
		sessao.update(farm);
		sessao.getTransaction().commit();
		sessao.close();
	}
	
	public List<Farmacia> listarFarmacia() {
		Session sessao = ConexaoBD.getPesquisa().openSession();
		sessao.beginTransaction();
		List<Farmacia> farmacias = sessao.createQuery("FROM Farmacia").list();
		sessao.getTransaction().commit();
		sessao.close();
		return farmacias;
	}
	
	public Farmacia localizarFarmacia(int id) {
		Session sessao = ConexaoBD.getPesquisa().openSession();
		sessao.beginTransaction();
		Farmacia obj = (Farmacia) sessao.createQuery("FROM Farmacia WHERE id = " + id).uniqueResult();
		sessao.getTransaction().commit();
		sessao.close();
		return obj;
	}

}