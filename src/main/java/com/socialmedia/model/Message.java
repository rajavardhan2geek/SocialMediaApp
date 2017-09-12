package com.socialmedia.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message {

	
	long id;
	String sender;
	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return message;
	}

	public void setName(String name) {
		this.message = name;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	String message;
	Date created;
	
	public Message() {
		// TODO Auto-generated constructor stub
	}
	
	public Message(int i,String message,String sendername) {
		// TODO Auto-generated constructor stub
	  this.id= i;
	  this.message = message;
	  this.sender = sendername;
	  this.created = new Date();
	
	}


}
