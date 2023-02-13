package HQLDemo;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

public class NativeSQL {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session s = factory.openSession();
		
		String q ="select * from studentn";
		
		NativeQuery nq = s.createSQLQuery(q);
		
		List<Object[]> list = nq.list();
		
		for(Object[] student :list) {
			System.out.println(Arrays.toString(student));
		}
		
		s.close();
	}

}
