package com.hibernate.HibernateDemoProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		Student std1 = new Student();
		std1.setId(101);
		std1.setName("Peter");
		std1.setCity("Queens");
		
		Certificate certificate = new Certificate();
		certificate.setCourse("Hibernate");
		certificate.setDuration("10 days");
		
		std1.setCerti(certificate);
		
		Student std2 = new Student();
		std2.setId(102);
		std2.setName("Jack");
		std2.setCity("Tortuga");
		
		Certificate certificate1 = new Certificate();
		certificate1.setCourse("Hibernate JSP");
		certificate1.setDuration("15 days");
		
		std2.setCerti(certificate1);
		
		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();
		
		// object should get saved
		s.save(std1);
		s.save(std2);
		
		tx.commit();
		s.close();
	}

}
