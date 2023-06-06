package dao;

import java.util.List;

import org.hibernate.Session;

import model.Equipamento;

public class DAOEquipamento {
	
	
	public void inserirEquipamento(Equipamento equi) {
		Session sessao = ConexaoBD.getPesquisa().openSession();
		sessao.beginTransaction();
		sessao.save(equi);
		sessao.getTransaction().commit();
		sessao.close();
	}
	
	public void excluirEquipamento(Equipamento equi) {
		Session sessao = ConexaoBD.getPesquisa().openSession();
		sessao.beginTransaction();
		sessao.delete(equi);
		sessao.getTransaction().commit();
		sessao.close();
	}
	
	public void editarEquipamento(Equipamento equi) {
		Session sessao = ConexaoBD.getPesquisa().openSession();
		sessao.beginTransaction();
		sessao.update(equi);
		sessao.getTransaction().commit();
		sessao.close();
	}
	
	public List<Equipamento> listarEquipamento() {
		Session sessao = ConexaoBD.getPesquisa().openSession();
		sessao.beginTransaction();
		List<Equipamento> equipamentos = sessao.createQuery("FROM Equipamento").list();
		sessao.getTransaction().commit();
		sessao.close();
		return equipamentos;
	}
	
	public Equipamento localizarEquipamento(int id) {
		Session sessao = ConexaoBD.getPesquisa().openSession();
		sessao.beginTransaction();
		Equipamento obj = (Equipamento) sessao.createQuery("FROM Equipamento WHERE id = " + id).uniqueResult();
		sessao.getTransaction().commit();
		sessao.close();
		return obj;
	}

}
