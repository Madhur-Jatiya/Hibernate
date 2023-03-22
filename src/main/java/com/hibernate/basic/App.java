package com.hibernate.basic;

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
		Configuration cfg = new Configuration().configure("config.xml");
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
		certificate.setCourse("python");
		certificate.setDuration("6 months");
		
		Student student = new Student();
		student.setId(5);
		student.setName("Akshu");
		student.setCity("Maharastra");
		student.setCertificate(certificate);
		System.out.println(student);

		
//		Certificate certificate2 = new Certificate();
//		certificate2.setCourse("python+");
//		certificate2.setDuration("4 months");
//		
//		Student student2 = new Student();
//		student2.setId(4);
//		student2.setName("Anurag");
//		student2.setCity("Sagar");
//		student2.setCertificate(certificate2);
//		System.out.println(student2);

		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(student);
//		session.save(student2);
		tx.commit();
		session.close();
	}
}
