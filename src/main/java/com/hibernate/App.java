package com.hibernate;

import java.util.Date;

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

//		Student student = new Student();
//		student.setId(3);
//		student.setName("Rani");
//		student.setCity("Indore");
//		System.out.println(student);
		
		Address address = new Address();
		address.setStreet("Khandawa Naka");
		address.setCity("Indore");
		address.setOpen(true);
		address.setX(0);
		address.setAddedDate(new Date());
		

		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(address);
		tx.commit();
		session.close();
	}
}
