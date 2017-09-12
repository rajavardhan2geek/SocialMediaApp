package com.socialmedia.service;

import java.util.ArrayList;
import java.util.List;

import com.socialmedia.model.Message;

public class MessageServices {

	

	List<Message> messageslist;
	public MessageServices() {
		// TODO Auto-generated constructor stub
		
	}
	
	public List<Message> getAllMessages()
	{
		messageslist = new ArrayList<Message>();
		Message msg1 = new Message(1,"hello world","fire");
    	Message msg2 = new Message(2,"hello king","air");
    	messageslist.add(msg1);
    	messageslist.add(msg2);
		return  messageslist;
	}
	public Message getMessages(Long msgid)
	{
		
		Message msg1 = new Message(1,"hello world","fire");
    	
		return  msg1;
	}


}
