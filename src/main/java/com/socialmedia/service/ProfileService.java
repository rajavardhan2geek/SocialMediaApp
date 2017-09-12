package com.socialmedia.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.socialmedia.database.DatabaseClass;
import com.socialmedia.model.Profiles;

public class ProfileService {

	Map<Long,Profiles> kingdommap = DatabaseClass.getkingdoms();
	List<Profiles> kingdomlist;
	public ProfileService() {
		// TODO Auto-generated constructor stub
		
		kingdomlist = new ArrayList<Profiles>();
		
	}
	
	public List<Profiles> getAllKingdoms()
	{
		
		Profiles king1 = new Profiles(1,"LAND", "PANDA");
		Profiles king2 = new Profiles(1,"FIRE", "DRAGON");
		kingdomlist.add(king1);
		kingdomlist.add(king2);
		return kingdomlist;
		
	}
	public List<Profiles> addkingdom(Profiles kingdom)
	{
		kingdomlist.add(kingdom);
		return kingdomlist;
	}

}
