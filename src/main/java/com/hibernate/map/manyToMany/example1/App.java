package com.hibernate.map.manyToMany.example1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) throws IOException {
		Configuration cfg = (Configuration) new Configuration().configure("config.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();

		// insert

		// set students
		Students students = new Students();
		students.setName("Madhur");

		Students students2 = new Students();
		students2.setName("Akshu");

		Students students3 = new Students();
		students3.setName("Rani");

//		set subjects
		Subjects subjects = new Subjects();
		subjects.setName("java");

		Subjects subjects2 = new Subjects();
		subjects2.setName("Mysql");

		Subjects subjects3 = new Subjects();
		subjects3.setName("Python");

		List<Subjects> subjectsList = new ArrayList<Subjects>();
		subjectsList.add(subjects);
		subjectsList.add(subjects2);
		subjectsList.add(subjects3);

		List<Students> studentList = new ArrayList<Students>();
		studentList.add(students);
		studentList.add(students2);
		studentList.add(students3);
		
		students.setSubjects(subjectsList);
		students2.setSubjects(subjectsList);

		subjects.setStudents(studentList);
		subjects2.setStudents(studentList);
		
		// Extract
//		List<Country> getIntern = session.createQuery("from Intern").list();
//		for (Country intern2 : getIntern) {
//			System.out.println(intern2);
//		}

		session.save(students);
		session.save(students2);
		session.save(students3);
		
		session.save(subjects);
		session.save(subjects2);
		session.save(subjects3);

		tr.commit();

		session.close();
		sf.close();
	}
}
