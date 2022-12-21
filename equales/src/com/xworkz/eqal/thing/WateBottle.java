package com.xworkz.eqal.thing;

public class WateBottle {
	private String brand;
	private String name;
	private int noOfBottels;
	private Integer  price;
	private String length;
	private String width;
	private String mfgDate;
	private String expDate;
	private String ownerName;
	private String country;
	public WateBottle(String brand, String name, int noOfBottels, Integer price, String length, String width,
			String mfgDate, String expDate, String ownerName, String country) {
		super();
		this.brand = brand;
		this.name = name;
		this.noOfBottels = noOfBottels;
		this.price = price;
		this.length = length;
		this.width = width;
		this.mfgDate = mfgDate;
		this.expDate = expDate;
		this.ownerName = ownerName;
		this.country = country;
	}
	
	
	@Override
	public boolean equals(Object water) {
		
		if(water instanceof WateBottle) {
			System.out.println("printing water");
			WateBottle wateBottle=(WateBottle)water;
			if(this.brand.equals(wateBottle.brand)&&this.country.equals(wateBottle.country)&&this.ownerName.equals(wateBottle.ownerName))
			{
				System.out.println("printing equal");
				return true;
			}
			else {
				System.err.println("is not equal");
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "WateBottle [brand=" + brand + ", name=" + name + ", noOfBottels=" + noOfBottels + ", price=" + price
				+ ", length=" + length + ", width=" + width + ", mfgDate=" + mfgDate + ", expDate=" + expDate
				+ ", ownerName=" + ownerName + ", country=" + country + "]";
	}


	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNoOfBottels() {
		return noOfBottels;
	}
	public void setNoOfBottels(int noOfBottels) {
		this.noOfBottels = noOfBottels;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getLength() {
		return length;
	}
	public void setLength(String length) {
		this.length = length;
	}
	public String getWidth() {
		return width;
	}
	public void setWidth(String width) {
		this.width = width;
	}
	public String getMfgDate() {
		return mfgDate;
	}
	public void setMfgDate(String mfgDate) {
		this.mfgDate = mfgDate;
	}
	public String getExpDate() {
		return expDate;
	}
	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	

}
