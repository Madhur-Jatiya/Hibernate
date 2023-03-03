package com.hibernate.crud;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.basic.Student;

public class Test {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("config.xml").buildSessionFactory();

		Human1 human1 = new Human1();
		human1.setId(101);
		human1.setName("rj");
		human1.setCity("delhi");

		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		//save
		session.save(human1);
		
		//update
//		session.saveOrUpdate(human1);
		
		
		//get
//		Human1 human2 = session.get(Human1.class, 101);
//		System.out.println(human2);
		
		//get all
		List<Human1> human3 = session.createQuery("from Human1").list();
		System.out.println(human3);
		
		
		//delete
//		session.delete(human1);
		transaction.commit();
		
		session.close();
		sessionFactory.close();
	}
}
