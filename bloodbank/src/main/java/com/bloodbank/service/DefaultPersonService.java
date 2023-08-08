package com.bloodbank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bloodbank.dao.PersonDao;
import com.bloodbank.model.Person;

@Component
public class DefaultPersonService implements PersonService {

	@Autowired
	PersonDao personDao;
	
	@Override
	public void createPerson(Person person) {
		personDao.createPerson(person);
		
	}

}
