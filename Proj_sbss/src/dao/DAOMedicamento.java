package dao;
import java.util.List;

import org.hibernate.Session;

import model.Medicamento;

public class DAOMedicamento {
	
	
	public void inserirMedicamento(Medicamento med) {
		Session sessao = ConexaoBD.getPesquisa().openSession();
		sessao.beginTransaction();
		sessao.save(med);
		sessao.getTransaction().commit();
		sessao.close();
	}
	
	public void excluirMedicamento(Medicamento med) {
		Session sessao = ConexaoBD.getPesquisa().openSession();
		sessao.beginTransaction();
		sessao.delete(med);
		sessao.getTransaction().commit();
		sessao.close();
	}
	
	public void editarMedicamento(Medicamento med) {
		Session sessao = ConexaoBD.getPesquisa().openSession();
		sessao.beginTransaction();
		sessao.update(med);
		sessao.getTransaction().commit();
		sessao.close();
	}
	
	public List<Medicamento> listarMedicamento() {
		Session sessao = ConexaoBD.getPesquisa().openSession();
		sessao.beginTransaction();
		List<Medicamento> medicamentos = sessao.createQuery("FROM Medicamento").list();
		sessao.getTransaction().commit();
		sessao.close();
		return medicamentos;
	}
	
	public Medicamento localizarMedicamento(int id) {
		Session sessao = ConexaoBD.getPesquisa().openSession();
		sessao.beginTransaction();
		Medicamento obj = (Medicamento) sessao.createQuery("FROM Medicamento WHERE id = " + id).uniqueResult();
		sessao.getTransaction().commit();
		sessao.close();
		return obj;
	}

}