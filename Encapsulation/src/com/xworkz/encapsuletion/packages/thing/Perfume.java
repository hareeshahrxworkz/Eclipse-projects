package com.xworkz.encapsuletion.packages.thing;

public class Perfume {

	private String name;
	String brandOwner;
	String manufactureCountry;
	Integer price;
	String manufactureDate;
	String expiryDate;
	boolean quality;
	int quantity;
	String fragrance;
	String colour;

	void setPerfume(String name, String brandOwner, String manufactureCountry, Integer price, String manufactureDate,
			String expiryDate, boolean quality, int quantity, String fragrance, String colour) {
		this.name = name;
		this.brandOwner = brandOwner;
		this.manufactureCountry = manufactureCountry;
		this.price = price;
		this.manufactureDate = manufactureDate;
		this.expiryDate = expiryDate;
		this.quality = quality;
		this.quantity = quantity;
		this.fragrance = fragrance;
		this.colour = colour;
	}

	public String getBrandOwner() {
		return brandOwner;
	}

	public String getManufactureCountry() {
		return manufactureCountry;
	}

	public Integer getPrice() {
		return price;
	}

	public String getManufactureDate() {
		return manufactureDate;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public boolean isQuality() {
		return quality;
	}

	public int getQuantity() {
		return quantity;
	}

	public String getFragrance() {
		return fragrance;
	}

	public String getColour() {
		return colour;
	}

	public void setManufactureDate(String manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

}
