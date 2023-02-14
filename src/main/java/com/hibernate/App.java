package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("config.xml");
//		cfg.configure("config.xml").addAnnotatedClass(Student.class);
		SessionFactory sessionFactory = cfg.buildSessionFactory();

		Student student = new Student();
		student.setId(3);
		student.setName("Rani");
		student.setCity("Indore");
		System.out.println(student);

		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(student);
		tx.commit();
		session.close();
	}
}
