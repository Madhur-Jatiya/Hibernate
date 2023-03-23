package com.hibernate.map.manyToMany.example1;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Students")
public class Students {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "Students Name")
	private String name;
	@ManyToMany(mappedBy = "students")
	private List<Subjects> subjects;

	public Students(int id, String name, List<Subjects> subjects) {
		super();
		this.id = id;
		this.name = name;
		this.subjects = subjects;
	}

	public Students() {
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

	public List<Subjects> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subjects> subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", subjects=" + subjects + "]";
	}

}