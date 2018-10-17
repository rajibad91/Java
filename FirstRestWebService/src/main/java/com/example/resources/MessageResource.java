package com.example.resources;

import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.example.model.Message;

@Path("/messages")
public class MessageResource {
	
//	@GET
//	@Produces(MediaType.TEXT_PLAIN)
//	public String show()
//	{
//		return "Welcome to RestFul Web Services";
//	}
	
	@GET
	//@Produces(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_JSON)
	public Message show()
	{
		return new Message(1,"RestFul Webservices",new Date(),"rajiba") ;
	}

}
