package com.xworkz.pizza.dto;

import java.io.Serializable;

public class SanitizerDTO implements Serializable{
	private int id;
	private String brand;
	private Double price;
	private Color color;
	public SanitizerDTO() {
	}
	
	public SanitizerDTO(int id, String brand, Double price, Color color) {
		super();
		this.id = id;
		this.brand = brand;
		this.price = price;
		this.color = color;
		
	}

	@Override
	public String toString() {
		return "SanitizerDTo [id=" + id + ", brand=" + brand + ", price=" + price + ", color=" + color + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	
	
	

}
