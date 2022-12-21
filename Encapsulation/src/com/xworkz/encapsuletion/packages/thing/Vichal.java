package com.xworkz.encapsuletion.packages.thing;

public class Vichal {

	private String CompanyName;
	String ownerName;
	int nofVichals;
	String delivery;
	String nofVisitors;
	Integer price;
	long contactNo;
	String location;
	String state;
	String country;
	

	void setVichal(String ownerName, int nofVichals, String delivery, String nofVisitors, Integer price, long contactNo,
			String location, String state, String country) {
		this.ownerName = ownerName;
		this.nofVichals = nofVichals;
		this.delivery = delivery;
		this.nofVisitors = nofVisitors;
		this.price = price;
		this.contactNo = contactNo;
		this.location = location;
		this.state = state;
		this.country = country;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public int getNofVichals() {
		return nofVichals;
	}

	public String getDelivery() {
		return delivery;
	}

	public String getNofVisitors() {
		return nofVisitors;
	}

	public Integer getPrice() {
		return price;
	}

	public long getContactNo() {
		return contactNo;
	}

	public String getLocation() {
		return location;
	}

	public String getState() {
		return state;
	}

	public String getCountry() {
		return country;
	}

}
