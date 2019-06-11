package com.axelor.test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.axelor.service.ContactCrud;



@Path("myresource")
public class MyResource{

	@GET
	@Produces("text/html")
	public String getIt() {
//		System.out.println("hello");
//		ContactCrud.contactCrudMain();
		return "Hello";
	}
	
	
//	@Path("/hello")
//	public Response getIt() {
//		System.out.println("Hey!!");
//		return Response.status(200).entity("hello").build();
//	}
}
