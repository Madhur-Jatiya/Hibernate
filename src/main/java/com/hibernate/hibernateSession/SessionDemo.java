package com.hibernate.hibernateSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.basic.Student;

public class SessionDemo {

	public static void main(String[] args) {
		//practical of hibernate object states:
		//transient
		//persistent
		//detached
		//removed
		
		SessionFactory sessionFactory = new Configuration().configure("config.xml").buildSessionFactory();
		
		//creating human object
		Human human = new Human();
		human.setId(101);
		human.setName("Mr. Moms");
		human.setCity("New York");
		//transient state
		
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(human);
		//persistent -> session,database
		
		human.setName("Madhurmoms");	//update on database
		
		transaction.commit();
		session.close();	//detached from database
		
		human.setName("Madhur");	//not update on database
		
		sessionFactory.close();
	}

}
