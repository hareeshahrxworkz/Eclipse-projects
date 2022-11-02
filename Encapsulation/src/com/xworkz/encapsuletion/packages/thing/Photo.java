package com.xworkz.encapsuletion.packages.thing;

public class Photo {
	private String material = "plastic";
	char size;
	boolean Quality;
	int quantity;
	int price;
	String colour;
	String mountingType;
	String shape;
	double weight;
	String brand;
	boolean damage;

	void setPhoto(char size, boolean quality, int quantity, int price, String colour, String mountingType, String shape,
			double weight, String brand, boolean damage) {
		this.size = size;
		Quality = quality;
		this.quantity = quantity;
		this.price = price;
		this.colour = colour;
		this.mountingType = mountingType;
		this.shape = shape;
		this.weight = weight;
		this.brand = brand;
		this.damage = damage;
	}

	public char getSize() {
		return size;
	}

	public boolean isQuality() {
		return Quality;
	}

	public int getQuantity() {
		return quantity;
	}

	public int getPrice() {
		return price;
	}

	public String getColour() {
		return colour;
	}

	public String getMountingType() {
		return mountingType;
	}

	public String getShape() {
		return shape;
	}

	public double getWeight() {
		return weight;
	}

	public String getBrand() {
		return brand;
	}

	public boolean isDamage() {
		return damage;
	}

}
