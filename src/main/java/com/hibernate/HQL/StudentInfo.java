package com.hibernate.HQL;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "StudentInfo")
public class StudentInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "Students Name")
	private String name;
	@Column(name = "Students Email")
	private String email;
	@Column(name = "Students Mobile")
	private String mobile;
	@ManyToOne
	@JoinColumn(name = "Address_id")
	private AddressInfo addressInfo;

	public StudentInfo(int id, String name, String email, String mobile, AddressInfo addressInfo) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.addressInfo = addressInfo;
	}

	public StudentInfo() {
		super();
	}

	@Override
	public String toString() {
		return "StudentInfo [id=" + id + ", name=" + name + ", email=" + email + ", mobile=" + mobile + ", addressInfo="
				+ addressInfo + "]";
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public AddressInfo getAddressInfo() {
		return addressInfo;
	}

	public void setAddressInfo(AddressInfo addressInfo) {
		this.addressInfo = addressInfo;
	}
}