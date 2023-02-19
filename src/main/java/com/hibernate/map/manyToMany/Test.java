package com.hibernate.map.manyToMany;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure("config.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();

		Employee employee1 = new Employee();
		employee1.setId(101);
		employee1.setName("Madhur Jatiya");

		Employee employee2 = new Employee();
		employee2.setId(102);
		employee2.setName("Lokesh Nargesh");

		Employee employee3 = new Employee();
		employee3.setId(103);
		employee3.setName("Rani Ahire");

		Employee employee4 = new Employee();
		employee4.setId(104);
		employee4.setName("Akshada Pharandhe");

		Employee employee5 = new Employee();
		employee5.setId(105);
		employee5.setName("Aastha Panwar");

		Employee employee6 = new Employee();
		employee6.setId(106);
		employee6.setName("Deepak Jhangir");

		Project project1 = new Project();
		project1.setId(1);
		project1.setName("JAVA");

		Project project2 = new Project();
		project2.setId(2);
		project2.setName("C++");

		Project project3 = new Project();
		project3.setId(3);
		project3.setName("Pyton");

		List<Project> projects = new ArrayList<Project>();
		projects.add(project1);
		projects.add(project2);
		projects.add(project3);

		List<Employee> employees = new ArrayList<Employee>();
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);
		employees.add(employee5);
		employees.add(employee6);

		employee1.setProjects(projects);
		employee2.setProjects(projects);
		employee3.setProjects(projects);
		employee4.setProjects(projects);
		employee5.setProjects(projects);
		employee6.setProjects(projects);

		project1.setEmployees(employees);
		project2.setEmployees(employees);
		project3.setEmployees(employees);

		Transaction transaction = session.beginTransaction();

		session.save(project1);
		session.save(project2);
		session.save(project3);

		session.save(employee1);
		session.save(employee2);
		session.save(employee3);
		session.save(employee4);
		session.save(employee5);
		session.save(employee6);

		transaction.commit();
		session.close();
		sessionFactory.close();
	}
}
