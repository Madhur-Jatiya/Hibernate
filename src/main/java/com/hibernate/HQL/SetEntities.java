package com.hibernate.HQL;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SetEntities {

	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure("config.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();

		// Set Addresses

		AddressInfo address = new AddressInfo();
		address.setStreet("Indra Nagar");
		address.setCity("Neemuch");
		address.setState("Madhya Pradesh");
		address.setCountry("India");

		AddressInfo address1 = new AddressInfo();
		address1.setStreet("Lajpat Nagar");
		address1.setCity("New Delhi");
		address1.setState("Delhi");
		address1.setCountry("India");

		AddressInfo address2 = new AddressInfo();
		address2.setStreet("Raja Park");
		address2.setCity("Jaipur");
		address2.setState("Rajasthan");
		address2.setCountry("India");

		AddressInfo address3 = new AddressInfo();
		address3.setStreet("Banjara Hills");
		address3.setCity("Hyderabad");
		address3.setState("Telangana");
		address3.setCountry("India");

		AddressInfo address4 = new AddressInfo();
		address4.setStreet("MG Road");
		address4.setCity("Bengaluru");
		address4.setState("Karnataka");
		address4.setCountry("India");

		AddressInfo address5 = new AddressInfo();
		address5.setStreet("Sunder Nagar");
		address5.setCity("Raipur");
		address5.setState("Chhattisgarh");
		address5.setCountry("India");

		// Set Students

		StudentInfo student = new StudentInfo();
		student.setName("Akshada Pharande");
		student.setEmail("akshu@gmail.com");
		student.setMobile("7221098765");
		student.setAddressInfo(address5);

		StudentInfo student1 = new StudentInfo();
		student1.setName("Madhur Jatiya");
		student1.setEmail("madhur@gmail.com");
		student1.setMobile("8221098765");
		student1.setAddressInfo(address4);

		StudentInfo student2 = new StudentInfo();
		student2.setName("Lokesh Nargesh");
		student2.setEmail("Lokesh@gmail.com");
		student2.setMobile("9321098742");
		student2.setAddressInfo(address5);

		StudentInfo student3 = new StudentInfo();
		student3.setName("Rani Ahire");
		student3.setEmail("Rani@gmail.com");
		student3.setMobile("9321098762");
		student3.setAddressInfo(address1);

		StudentInfo student4 = new StudentInfo();
		student4.setName("Aishwarya Gupta");
		student4.setEmail("aishwarya.gupta@gmail.com");
		student4.setMobile("9876543210");
		student4.setAddressInfo(address2);

		StudentInfo student5 = new StudentInfo();
		student5.setName("Vikas Singh");
		student5.setEmail("vikas.singh@yahoo.com");
		student5.setMobile("8765432109");
		student5.setAddressInfo(address3);

		StudentInfo student6 = new StudentInfo();
		student6.setName("Rashmi Patel");
		student6.setEmail("rashmi.patel@hotmail.com");
		student6.setMobile("7654321098");
		student6.setAddressInfo(address4);

		StudentInfo student7 = new StudentInfo();
		student7.setName("Amit Kumar");
		student7.setEmail("amit.kumar@gmail.com");
		student7.setMobile("7543210987");
		student7.setAddressInfo(address5);

		StudentInfo student8 = new StudentInfo();
		student8.setName("Neha Sharma");
		student8.setEmail("neha.sharma@yahoo.com");
		student8.setMobile("9432109876");
		student8.setAddressInfo(address2);

		StudentInfo student9 = new StudentInfo();
		student9.setName("Ravi Khanna");
		student9.setEmail("ravi.khanna@gmail.com");
		student9.setMobile("9321098765");
		student9.setAddressInfo(address1);

		StudentInfo student10 = new StudentInfo();
		student10.setName("Nisha Patel");
		student10.setEmail("nisha.patel@hotmail.com");
		student10.setMobile("6210987654");
		student10.setAddressInfo(address2);

		session.save(student);
		session.save(student1);
		session.save(student2);
		session.save(student3);
		session.save(student4);
		session.save(student5);
		session.save(student6);
		session.save(student7);
		session.save(student8);
		session.save(student9);
		session.save(student10);

		session.save(address1);
		session.save(address2);
		session.save(address3);
		session.save(address4);
		session.save(address5);

		tr.commit();
		session.close();
		sf.close();
	}

}
