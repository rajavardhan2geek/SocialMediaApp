package com.socialmedia.database;

import java.util.HashMap;
import java.util.Map;

import com.socialmedia.model.Message;
import com.socialmedia.model.Profiles;

public class DatabaseClass {

	private  static Map<Long, Message> messages = new HashMap<>();
	private  static Map<Long, Profiles> kingdomlist = new HashMap<>();
	 
		
		public static Map<Long,Message> getMessages()
		{
			return messages;
		}
		
		public static Map<Long,Profiles> getkingdoms()
		{
			return kingdomlist;
		}
	

	
}
