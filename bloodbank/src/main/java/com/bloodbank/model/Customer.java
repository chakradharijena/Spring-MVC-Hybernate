package com.bloodbank.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {

	@Id
	private int personId;
	private String personName;
	private String personMobile;
	public int getPersonId() {
		return personId;
	}
	
	
	
	
	public Customer() {
		super();
	}




	public Customer(int id, String nm, String mob) {
		
	}




	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getPersonMobile() {
		return personMobile;
	}
	public void setPersonMobile(String personMobile) {
		this.personMobile = personMobile;
	}
	@Override
	public String toString() {
		return "Customer [personId=" + personId + ", personName=" + personName + ", personMobile=" + personMobile + "]";
	}
}
