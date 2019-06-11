package com.axelor.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;

public class ServiceModule extends AbstractModule{
	
	@Override
	protected void configure() {
		// TODO Auto-generated method stub
		
	}
	
	@Provides
	public EntityManagerFactory provideEntityManagerFactory() {
		return Persistence.createEntityManagerFactory("Persistence_Unit");
	}
	
	@Provides
	public EntityManager provideEntityManager(EntityManagerFactory entityManagerFactory) {
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
	    
	    return entityManager;
	}

}