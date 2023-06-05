package model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class Teste {
	public static void main(String[] args) {
		
		Especialidade e = new Especialidade();
		PlanoSaude ps = new PlanoSaude();
		
		
		
		 SessionFactory sessionFactory = null;
		try {
			
		 sessionFactory = new Configuration().configure().buildSessionFactory();
			
		}catch(Exception ex) {
			System.err.println("Erro");
			ex.printStackTrace();
		}
		
		
		
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		
		session.delete(ps);
		
		session.getTransaction().commit();
		
		session.close();
		
	}
}

