package com.xworkz.encapsuletion.packages.thing;

public class Furnicture {

	private String furnitureShopeName;
	private String ownerName;
	String items;
	String location;
	int NoofEmployees;
	double price;
	long contactNo;
	String state;
	String licenceNo;
	int noOfVisitors;
	String country;

	void setFurnicture(String items, String location, int noofEmployees, double price, long contactNo, String state,
			String licenceNo, int noOfVisitors, String country) {
		this.items = items;
		this.location = location;
		NoofEmployees = noofEmployees;
		this.price = price;
		this.contactNo = contactNo;
		this.state = state;
		this.licenceNo = licenceNo;
		this.noOfVisitors = noOfVisitors;
		this.country = country;
	}

	public String getFurnitureShopeName() {
		return furnitureShopeName;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setFurnitureShopeName(String furnitureShopeName) {
		this.furnitureShopeName = furnitureShopeName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getItems() {
		return this.items;
	}

	public String getLocation() {
		return this.location;
	}

	public int getNoofEmployees() {
		return this.NoofEmployees;
	}

	public double getPrice() {
		return this.price;
	}

	public long getContactNo() {
		return this.contactNo;
	}

	public String getState() {
		return this.state;
	}

	public String getLicenceNo() {
		return this.licenceNo;
	}

	public int getNoOfVisitors() {
		return this.noOfVisitors;
	}

	public String getCountry() {
		return this.country;
	}
	public void display()
	{
		System.out.println(furnitureShopeName);
		System.out.println(ownerName);
	}

}
