package com.hibernate.map.oneToOne;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Intern")
public class Intern {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "Intern Name")
	private String name;
	@OneToOne
	@JoinColumn(name = "Skill_id")
	private Skills skills;

	public Intern(int id, String name, Skills skills) {
		super();
		this.id = id;
		this.name = name;
		this.skills = skills;
	}

	public Intern() {
		super();
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

	public Skills getSkills() {
		return skills;
	}

	public void setSkills(Skills skills) {
		this.skills = skills;
	}

	@Override
	public String toString() {
		return "Intern [id=" + id + ", name=" + name + ", skills=" + skills + "]";
	}

}