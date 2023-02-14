package com.hibernate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

//to change whole entity name
//@Entity(name = "anotherName")
//to change table name default name is class name
//@Table(name = "Employee")

@Entity
public class Student {
	@Id
	private int id;
	private String name;
	private String city;
	private Certificate certificate;

	public Certificate getCertificate() {
		return certificate;
	}

	public void setCertificate(Certificate certificate) {
		this.certificate = certificate;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Student(int id, String name, String city, Certificate certificate) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.certificate = certificate;
	}

	public Student() {
		super();
	}
}
