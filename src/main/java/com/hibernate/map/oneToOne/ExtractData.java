package com.hibernate.map.oneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ExtractData {
	public static void main(String[] args) {
		Configuration cfgConfiguration = new Configuration().configure("config.xml");
		SessionFactory sFactory = cfgConfiguration.buildSessionFactory();
		Session session = sFactory.openSession();

		Intern employee = session.get(Intern.class, 2);
//		System.out.println(employee);
		System.out.println(employee);

//		session.close();
//		sFactory.close();
	}

}
