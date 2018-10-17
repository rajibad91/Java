package com.messenger.MessengerApp.Resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.messenger.MessengerApp.model.Message;
import com.messenger.MessengerApp.service.MessageService;

@Path("/messages")
public class MessageResource {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getMessages()
	{
		return "Hello World!!!";
	}
	MessageService service=new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/getAllMessages")
	public List<Message> getAllMessages()
	{
		return service.getAllMesaages();
	}

}
