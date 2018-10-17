package com.messenger.MessengerApp.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.messenger.MessengerApp.model.Message;

public class MessageService {
	
	public List<Message> getAllMesaages()
	{
		Date d=new Date();
		Message m1=new Message(1,"Hello","Rajiba",d);
		Message m2=new Message(2,"HI","Lochan",d);
		List<Message> list=new ArrayList<>();
		list.add(m1);
		list.add(m2);
		return list;
	}

}
