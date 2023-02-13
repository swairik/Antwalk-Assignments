package com.hibernate.HibernateDemoProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		System.out.println("Project Started...");

//        session factory
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();

		Student st = new Student(101, "Bruce", "Gotham");
		System.out.println(st);

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(st);

		tx.commit();
		session.close();
		System.out.println("Creation Done");
        
    }
}
