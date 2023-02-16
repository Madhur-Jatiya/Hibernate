package com.hibernate.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure("config.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();

		Answer answer1 = new Answer();
		answer1.setId(1);
		answer1.setAnswer("My name is Madhur");

		Question question1 = new Question();
		question1.setId(11);
		question1.setQuestion("What is you name?");
		question1.setAnswer(answer1);

		Answer answer2 = new Answer();
		answer2.setId(2);
		answer2.setAnswer("Lokesh");

		Question question2 = new Question();
		question2.setId(12);
		question2.setQuestion("What is best Friend?");
		question2.setAnswer(answer2);

		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		//save
		session.save(question1);
		session.save(question2);
		session.save(answer1);
		session.save(answer2);
		transaction.commit();
		
		//
		Question question = session.get(Question.class, 11);
		System.out.println(question);
		
		session.close();
		sessionFactory.close();
	}
}
