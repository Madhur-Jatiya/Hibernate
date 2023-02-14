package com.hibernate;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.engine.jdbc.BlobProxy;

public class App {
	public static void main(String[] args) throws IOException {
		Configuration cfg = new Configuration();
		cfg.configure("config.xml");
//		cfg.configure("config.xml").addAnnotatedClass(Student.class);
		SessionFactory sessionFactory = cfg.buildSessionFactory();

		// set Student
//		Student student = new Student();
//		student.setId(3);
//		student.setName("Rani");
//		student.setCity("Indore");
//		System.out.println(student);

		// set Address
//		Address address = new Address();
//		address.setStreet("Khandawa Naka");
//		address.setCity("Indore");
//		address.setOpen(false);
//		address.setX(0);
//		address.setAddedDate(new Date());

		// read image
//		FileInputStream fStream = new FileInputStream("src/main/java/mr_moms.png");
//		byte[] data = new byte[fStream.available()];
//		fStream.read(data);
//		address.setImage(data);

		// set Student and Certificate
		
		Certificate certificate = new Certificate();
		certificate.setCourse("java");
		certificate.setDuration("2 months");
		
		Student student = new Student();
		student.setId(4);
		student.setName("Akash");
		student.setCity("Sagar");
		student.setCertificate(certificate);
		System.out.println(student);

		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(student);
		tx.commit();
		session.close();
	}
}
