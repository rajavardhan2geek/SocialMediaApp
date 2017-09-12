package com.socialmedia.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Profiles {

	
	String kingdomname;
	String kingdomemblem;
	public String getKingdomemblem() {
		return kingdomemblem;
	}

	public void setKingdomemblem(String kingdomemblem) {
		this.kingdomemblem = kingdomemblem;
	}

	Long id;
	public String getProfilename() {
		return kingdomname;
	}

	public void setProfilename(String profilename) {
		this.kingdomname = profilename;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	

	public Profiles() {
		// TODO Auto-generated constructor stub
	}

	public Profiles(int id,String name,String emblem) {
		// TODO Auto-generated constructor stubid
		this.id = (long) id;
		this.kingdomname = name;
		this.kingdomemblem = emblem;
	}
}
