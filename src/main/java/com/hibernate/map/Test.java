package com.hibernate.map;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure("config.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();

		// one to one relation

//		Answer answer1 = new Answer();
//		answer1.setId(1);
//		answer1.setAnswer("My name is Madhur");
//
//		Question question1 = new Question();
//		question1.setId(11);
//		question1.setQuestion("What is you name?");
//		question1.setAnswer(answer1);
//
//		Answer answer2 = new Answer();
//		answer2.setId(2);
//		answer2.setAnswer("Lokesh");
//
//		Question question2 = new Question();
//		question2.setId(12);
//		question2.setQuestion("What is best Friend?");
//		question2.setAnswer(answer2);

		// many to one relation
		Question question1 = new Question();
		question1.setId(111);
		question1.setQuestion("What is JAVA?");

		Answer answer1 = new Answer();
		answer1.setId(11);
		answer1.setAnswer("Java is a programming language");
		answer1.setQuestion(question1);

		Answer answer2 = new Answer();
		answer2.setId(12);
		answer2.setAnswer("Java is a Object Oriented language");
		answer2.setQuestion(question1);

		List<Answer> list = new ArrayList<Answer>();
		list.add(answer1);
		list.add(answer2);
		question1.setAnswers(list);
		;

		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		// save
		session.save(question1);
		session.save(answer1);
		session.save(answer2);
		transaction.commit();

		//fetch
		
//		Question question = session.get(Question.class, 11);
//		System.out.println(question);

		session.close();
		sessionFactory.close();
	}
}
