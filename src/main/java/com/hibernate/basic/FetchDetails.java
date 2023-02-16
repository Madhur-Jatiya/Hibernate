package com.hibernate.basic;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FetchDetails {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("config.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		//get id 1
		Student student = session.get(Student.class, 1);
//		Student student2 = session.get(Student.class, 2);
		Student student2 = session.load(Student.class, 2);
		System.out.println(student);
		System.out.println(student2);
//		
		session.close();
		sessionFactory.close();
	}
}
