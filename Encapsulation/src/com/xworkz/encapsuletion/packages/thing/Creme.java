package com.xworkz.encapsuletion.packages.thing;

public class Creme {

	private String brand;
	public int quantity;
	Integer price;
	String owner;
	String purpose;
	String color;
	float grams;
	boolean gelly;
	boolean white;
	boolean pimple;
	float quality;

	void setCreme(String brand, int quantity, Integer price, String owner, String purpose, String color, float grams,
			boolean gelly, boolean white, boolean pimple, float quality) {
		this.brand = brand;
		this.quantity = quantity;
		this.price = price;
		this.owner = owner;
		this.purpose = purpose;
		this.color = color;
		this.grams = grams;
		this.gelly = gelly;
		this.white = white;
		this.pimple = pimple;
		this.quality = quality;
	}
	 void setBrand(String brand) {
		this.brand = brand;
	}

	
	public String getBrand() {
		return brand;
	}

	public int getQuantity() {
		return quantity;
	}

	public Integer getPrice() {
		return price;
	}

	public String getOwner() {
		return owner;
	}

	public String getPurpose() {
		return purpose;
	}

	public String getColor() {
		return color;
	}

	public float getGrams() {
		return grams;
	}

	public boolean isGelly() {
		return gelly;
	}

	public boolean isWhite() {
		return white;
	}

	public boolean isPimple() {
		return pimple;
	}

	public float getQuality() {
		return quality;
	}

}
