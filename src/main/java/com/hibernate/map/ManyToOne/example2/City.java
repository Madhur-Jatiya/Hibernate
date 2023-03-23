package com.hibernate.map.ManyToOne.example2;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "City")
public class City {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "Name")
	private String name;
	@Column(name = "Pin Code")
	private int pin;

	public int getId() {
		return id;
	}

	public City(int id, String name, int pin) {
		super();
		this.id = id;
		this.name = name;
		this.pin = pin;
	}

	public City() {
		super();
	}

	@Override
	public String toString() {
		return "City [id=" + id + ", name=" + name + ", pin=" + pin + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public void setId(int id) {
		this.id = id;
	}

}
