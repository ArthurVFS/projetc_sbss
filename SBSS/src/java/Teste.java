package java;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class Teste {
	public static void main(String[] args) {
		
		Especialidade e = new Especialidade("Pediatra");
		PlanoSaude ps = new PlanoSaude("Promédica");
		
		
		
		SessionFactory sessionFactory = null;
		try {
			
		 sessionFactory = new Configuration().configure().buildSessionFactory();
			
		}catch(Exception ex) {
			System.err.println("Erro ao se conectar com o banco!");
		}
		
		
		
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		
		session.save(ps);
		
		session.getTransaction().commit();
		
		session.close();
		
	}
}

