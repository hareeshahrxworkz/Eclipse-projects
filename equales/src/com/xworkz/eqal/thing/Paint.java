package com.xworkz.eqal.thing;

public class Paint {

	private String brand;
	private String name;
	private double price;
	private String ownerName;
	private String location;
	private String state;
	private String country;
	private int pincode;
	private long contactNo;
	private String source;

	public Paint(String brand, String name, double price, String ownerName, String location, String state,
			String country, int pincode, long contactNo, String source) {
		super();
		System.out.println("running constructor method");

		this.brand = brand;
		this.name = name;
		this.price = price;
		this.ownerName = ownerName;
		this.location = location;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
		this.contactNo = contactNo;
		this.source = source;
	}

	@Override
	public String toString() {
		return "Paint [brand=" + brand + ", name=" + name + ", price=" + price + ", ownerName=" + ownerName
				+ ", location=" + location + ", state=" + state + ", country=" + country + ", pincode=" + pincode
				+ ", contactNo=" + contactNo + ", source=" + source + "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("running Equals method");
		if (obj instanceof Paint) {
			System.out.println("instance of naditha ede");
			Paint pain = (Paint) obj;

			if (this.brand.equals(pain.brand)) {
				System.out.println("eqals naditha ede");
				return true;
			}
			 else {

					System.out.println("it is mis match eqals");
				}

		}
		return false;
	}

	public String getBrand() {
		return brand;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public String getOwnerName() {
		return ownerName;
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

	public int getPincode() {
		return pincode;
	}

	public long getContactNo() {
		return contactNo;
	}

	public String getSource() {
		return source;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public void setSource(String source) {
		this.source = source;
	}

}
