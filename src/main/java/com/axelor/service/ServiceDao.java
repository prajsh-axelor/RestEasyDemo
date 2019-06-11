package com.axelor.service;

import javax.persistence.EntityManager;

import com.axelor.db.Contact;
import com.google.inject.Inject;
import com.google.inject.persist.Transactional;

public class ServiceDao {
	protected EntityManager em;
	
	@Inject
	public ServiceDao (EntityManager em) {
		this.em = em;
	}
	
	public void saveInNewTransaction(Contact contact) {
//		em.getTransaction().begin();
		save(contact);
//		em.getTransaction().commit();
	}
	
	@Transactional
	public void save(Contact contact) {
		em.persist(contact);
	}
}