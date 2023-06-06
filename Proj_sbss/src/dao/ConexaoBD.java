package dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ConexaoBD {

	private static SessionFactory pesquisa;
		
		static {
			try {
				pesquisa = new Configuration().configure().buildSessionFactory();
			}catch(Exception e) {
				System.err.println("Erro!!");
			}
		}
	
		public static SessionFactory getPesquisa() {
			return pesquisa;
		}

}
