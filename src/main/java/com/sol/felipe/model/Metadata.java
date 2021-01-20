package com.sol.felipe.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Metadata
{
	private Object public_alias;
	private Object private_alias;
	private Object more_info;
    @JsonProperty("URL")
    private Object uRL;
    private String image_URL;
    private Object open_corporates_URL;
    private Object corporate_location;
    private Object physical_location;
    
	public Metadata() {
	}

	public Metadata(Object public_alias, Object private_alias, Object more_info, Object uRL, String image_URL,
			Object open_corporates_URL, Object corporate_location, Object physical_location) {
		super();
		this.public_alias = public_alias;
		this.private_alias = private_alias;
		this.more_info = more_info;
		this.uRL = uRL;
		this.image_URL = image_URL;
		this.open_corporates_URL = open_corporates_URL;
		this.corporate_location = corporate_location;
		this.physical_location = physical_location;
	}

	public Object getPublic_alias() {
		return public_alias;
	}

	public void setPublic_alias(Object public_alias) {
		this.public_alias = public_alias;
	}

	public Object getPrivate_alias() {
		return private_alias;
	}

	public void setPrivate_alias(Object private_alias) {
		this.private_alias = private_alias;
	}

	public Object getMore_info() {
		return more_info;
	}

	public void setMore_info(Object more_info) {
		this.more_info = more_info;
	}

	public Object getuRL() {
		return uRL;
	}

	public void setuRL(Object uRL) {
		this.uRL = uRL;
	}
	//@JsonProperty("counterPartyLogoPath")
	public String getImage_URL() {
		return image_URL;
	}

	public void setImage_URL(String image_URL) {
		this.image_URL = image_URL;
	}

	public Object getOpen_corporates_URL() {
		return open_corporates_URL;
	}

	public void setOpen_corporates_URL(Object open_corporates_URL) {
		this.open_corporates_URL = open_corporates_URL;
	}

	public Object getCorporate_location() {
		return corporate_location;
	}

	public void setCorporate_location(Object corporate_location) {
		this.corporate_location = corporate_location;
	}

	public Object getPhysical_location() {
		return physical_location;
	}

	public void setPhysical_location(Object physical_location) {
		this.physical_location = physical_location;
	}
	
	
    
    
}