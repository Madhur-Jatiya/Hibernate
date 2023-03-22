package com.hibernate.map.oneToOne;

import java.io.IOException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) throws IOException {
		Configuration cfg = (Configuration) new Configuration().configure("config.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		// insert
		Skills skills = new Skills();
		skills.setSkill1("Php");
		skills.setSkill2("HTML");
		skills.setSkill3("Mysql");

		Intern intern = new Intern();
		intern.setName("Raghav");
		intern.setSkills(skills);

		Transaction tr = session.beginTransaction();
		session.save(skills);
		session.save(intern);
		
		tr.commit();
		
		//Extract
		session.get(Intern.class, 3);

		session.close();
		sf.close();
	}
}
