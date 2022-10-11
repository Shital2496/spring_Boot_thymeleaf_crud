package com.springExample.sms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="students")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="name", nullable=false)
	private String Name;
	@Column(name="email")
	private String email;
	
	
	
	//generate default constructor
	
	public Student() {
		super();
	}
	
	//generate construcor without id
	
	public Student(String name, String email) {
		super();
		this.Name = name;
		this.email = email;
	}
	
	//generate getter setter method
	
	
		

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
