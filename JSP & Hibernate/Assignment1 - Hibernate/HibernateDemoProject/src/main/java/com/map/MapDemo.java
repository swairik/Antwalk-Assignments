package com.map;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		/*
		Question q1 = new Question();
		q1.setQuestionid(101);
		q1.setQuestion("What is JSP?");
		
		Answer ans10 = new Answer();
		ans10.setAnswerId(5010);
		ans10.setAnswer("Java Server Pages");
		
		Answer ans11 = new Answer();
		ans11.setAnswerId(5011);
		ans11.setAnswer("Java Server Pages generated dynamic web pages");
		
		Answer ans12 = new Answer();
		ans12.setAnswerId(5012);
		ans12.setAnswer("Java Server Pages uses JSTL Tags");
		
//		q1.setAnswer(ans1);
		
		List<Answer> ans1 = new ArrayList<Answer>();
		ans1.add(ans10);
		ans1.add(ans11);
		ans1.add(ans12);
		q1.setAnswer(ans1);
		
		Question q2 = new Question();
		q2.setQuestionid(102);
		q2.setQuestion("What is Hibernate?");
		
		Answer ans20 = new Answer();
		ans20.setAnswerId(5020);
		ans20.setAnswer("ORM Tool");
		
		Answer ans21 = new Answer();
		ans21.setAnswerId(5021);
		ans21.setAnswer("Interacting with database");
		
		Answer ans22 = new Answer();
		ans22.setAnswerId(5022);
		ans22.setAnswer("Supports SQL");
		
		List<Answer> ans2 = new ArrayList<Answer>();
		ans2.add(ans20);
		ans2.add(ans21);
		ans2.add(ans22);
		q2.setAnswer(ans2);
		
//		q2.setAnswer(ans2);
		*/
		
		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();
		
		/*
//		s.save(q1);
//		s.save(q2);
//		s.save(ans1);
//		s.save(ans2);
		
		s.save(ans10);
		s.save(ans11);
		s.save(ans12);
		s.save(ans20);
		s.save(ans21);
		s.save(ans22);
		
		s.save(q1);
		s.save(q2);
		*/
		
		Question q = (Question) s.get(Question.class, 101);
		
		System.out.println(q.getQuestion());
		
		for(Answer a : q.getAnswer()) {
			System.out.println(a.getAnswer());
		}
		
		tx.commit();
		s.close();
		
	}

}
