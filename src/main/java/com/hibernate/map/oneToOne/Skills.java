package com.hibernate.map.oneToOne;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Skills")
public class Skills {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "Skill 1")
	private String skill1;
	@Column(name = "Skill 2")
	private String skill2;
	@Column(name = "Skill 3")
	private String skill3;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSkill1() {
		return skill1;
	}

	public void setSkill1(String skill1) {
		this.skill1 = skill1;
	}

	public String getSkill2() {
		return skill2;
	}

	public void setSkill2(String skill2) {
		this.skill2 = skill2;
	}

	public String getSkill3() {
		return skill3;
	}

	public void setSkill3(String skill3) {
		this.skill3 = skill3;
	}

	public Skills(int id, String skill1, String skill2, String skill3) {
		super();
		this.id = id;
		this.skill1 = skill1;
		this.skill2 = skill2;
		this.skill3 = skill3;
	}

	public Skills() {
		super();
	}

	@Override
	public String toString() {
		return "Skills [id=" + id + ", skill1=" + skill1 + ", skill2=" + skill2 + ", skill3=" + skill3 + "]";
	}

}
