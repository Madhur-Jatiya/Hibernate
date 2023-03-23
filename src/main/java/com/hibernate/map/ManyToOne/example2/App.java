package com.hibernate.map.ManyToOne.example2;

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
//		Country country = new Country();
//		country.setName("India");
//
//		City city = new City();
//		city.setName("Bhopal");
//		city.setPin(462001);
//
//		City city2 = new City();
//		city2.setName("Jaipur");
//		city2.setPin(302001);
//
//		List<City> cityList = new ArrayList<City>();
//		cityList.add(city);
//		cityList.add(city2);
//
//		country.setCity(cityList);

		// Extract
		List<Country> getCountries = session.createQuery("from Country").list();
		for (Country intern2 : getCountries) {
			System.out.println(intern2);
		}

//		session.save(country);
//		session.save(city);
//		session.save(city2);

		tr.commit();

		session.close();
		sf.close();
	}
}
