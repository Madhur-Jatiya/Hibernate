package com.hibernate.HQL;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Operations {
	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure("config.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();

		// Select Operations

		// List od all students
//		List<StudentInfo> studentList = session.createQuery("from StudentInfo").list();
//		for (StudentInfo students : studentList) {
//			System.out.println(students.getName());
//		}

		// select students where name start with A
//		List<StudentInfo> studentList2 = session.createQuery("from StudentInfo where name like 'a%'").list();
//		for (StudentInfo students : studentList2) {
//			System.out.println(students.getName());
//		}

		// select students where email ends with gmail.com
//		Query q = session.createQuery("from StudentInfo where email like '%gmail.com'");
//		List<StudentInfo> studentList3 = q.list();
//		for (StudentInfo students : studentList3) {
//			System.out.println(students.getName() + " -> " + students.getEmail());
//		}

		// select students where email ends with gmail.com
//		Query q = session.createQuery("from StudentInfo where email like ?1");
//		q.setParameter(1, "%gmail.com");
//		List<StudentInfo> studentList3 = q.list();
//		for (StudentInfo students : studentList3) {
//			System.out.println(students.getName() + " -> " + students.getEmail());
//		}

		// select students where city = Neemuch
//		Query q = session.createQuery("from StudentInfo where city = ?1");
//		q.setParameter(1, "Jaipur");
//		List<StudentInfo> studentList3 = q.list();
//		for (StudentInfo students : studentList3) {
//			System.out.println(students.getName() + " -> " + students.getCity());
//		}

		// select students where mobile number starts with 9 or ends with 5
//		Query q = session.createQuery("from StudentInfo as s where s.mobile like : M1 or s.mobile like : M2");
//		q.setParameter("M1", "9%");
//		q.setParameter("M2", "%5");
//		List<StudentInfo> studentList3 = q.list();
//		for (StudentInfo students : studentList3) {
//			System.out.println(students.getName() + " -> " + students.getMobile());
//		}

//=============================================================================================================

		// Delete Operations

		// delete students where mobile number starts with 0
//		Query q = session.createQuery("delete from StudentInfo where mobile like ?1");
//		q.setParameter(1, "0%");
//		q.executeUpdate();

//=============================================================================================================

		// Update Operations
//		Update students set number 9321098742 where name = Lokesh
//		Query q = session.createQuery("Update StudentInfo set mobile = ?1 where name = ?2");
//		q.setParameter(1, "9321098742");
//		q.setParameter(2, "Lokesh");
//		q.executeUpdate();

//=============================================================================================================
		
		//Joins
		

		// get All Students

//		List<StudentInfo> studentList3 = session.createQuery("from StudentInfo").list();
//		for (StudentInfo students : studentList3) {
//			System.out.println(students.getName() + " -> " + students.getMobile());
//		}

		tr.commit();
		session.close();
		sf.close();
	}

}
