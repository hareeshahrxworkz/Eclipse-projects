package com.xworkz.encapsuletion.packages.thing;

public class Restorent {

	private String restorentName = "Madhuloka";
	 String ownerName;
	String Items;
	String adress;
	String licenceNo;
	int price;
	String state;
	String country;
	String ServiceType;
	boolean available;
	boolean RestorentAvailable;

	void setRestorent(String ownerName, String items, String adress, String licenceNo, int price, String state,
			String country, String serviceType, boolean available, boolean restorentAvailable) {
		this.ownerName = ownerName;
		Items = items;
		this.adress = adress;
		this.licenceNo = licenceNo;
		this.price = price;
		this.state = state;
		this.country = country;
		ServiceType = serviceType;
		this.available = available;
		RestorentAvailable = restorentAvailable;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public String getItems() {
		return Items;
	}

	public String getAdress() {
		return adress;
	}

	public String getLicenceNo() {
		return licenceNo;
	}

	public int getPrice() {
		return price;
	}

	public String getState() {
		return state;
	}

	public String getCountry() {
		return country;
	}

	public String getServiceType() {
		return ServiceType;
	}

	public 	boolean isAvailable() {
		return available;
	}

	public boolean isRestorentAvailable() {
		return RestorentAvailable;
	}

	public void display()
	{
		System.out.println(this.restorentName);
	}
	
}
