package com.bloodbank.model;

/*import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;*/

//@Entity
//@Table(name="PERSON")
public class Person {
	/*
	 * @Id
	 * 
	 * @Column(name="id")
	 * 
	 * @GeneratedValue(strategy=GenerationType.IDENTITY)
	 */
	private int id;
	
	private String name;
	
	private String age;
	
	private String mobileno;

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

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
}
