package com.hibernate.map.manyToMany.example1;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Subjects")
public class Subjects {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "Subjects Name")
	private String name;
	@ManyToMany
	private List<Students> students;

	public Subjects(int id, String name, List<Students> students) {
		super();
		this.id = id;
		this.name = name;
		this.students = students;
	}

	public Subjects() {
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

	public List<Students> getStudents() {
		return students;
	}

	public void setStudents(List<Students> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Subjects [id=" + id + ", name=" + name + ", students=" + students + "]";
	}

}
