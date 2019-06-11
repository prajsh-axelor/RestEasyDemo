package com.axelor.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.axelor.db.Contact;
import com.axelor.db.Phone;
import com.google.inject.Guice;
import com.google.inject.Injector;

@Path("contact")
public class ContactCrud {
	
//	Injector injector = Guice.createInjector(new ServiceModule());
//	ServiceDao sDao = injector.getInstance(ServiceDao.class);

	@GET
	@Produces("text/html")
	public String createContact() {
		
		Contact contact = new Contact("Prajjwal");
		Phone phone = new Phone("Home", "9934979586");
		
		contact.add(phone);
		contact.add(new Phone("Work", "1234567890"));
		
//		sDao.saveInNewTransaction(contact);
//		System.out.println(contact);
		System.out.println("Done");
		
		return contact.toString();
		
		
	}
	
}