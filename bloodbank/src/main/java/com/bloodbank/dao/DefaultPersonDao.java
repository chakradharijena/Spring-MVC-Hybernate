package com.bloodbank.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.bloodbank.model.Person;

@Repository
public class DefaultPersonDao implements PersonDao {

	@Autowired 
	SessionFactory sessionFactory;
	
	@Override
	public void createPerson(Person person) {
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		session.save(person);
		tr.commit();
		session.close();
		
	}

	
}
