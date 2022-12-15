package com.xworkz.pizza.dto;

import java.time.LocalDateTime;

public class HelmetDTO extends AbstractAuditDTO{

	private String name;
	private Double price;
	private Color color;
	private HelmateType type;
	
	
	
	public HelmetDTO() {

	System.out.println("Explicit constructor running");
	}



	public HelmetDTO(String name, Double price, com.xworkz.pizza.dto.Color color, HelmateType type) {
		super();
		this.name = name;
		this.price = price;
		this.color = color;
		this.type = type;
	}



	@Override
	public String toString() {
		return "HelmetDTO [name=" + name + ", price=" + price + ", color=" + color + ", type=" + type + "]";
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
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



	public HelmateType getType() {
		return type;
	}



	public void setType(HelmateType type) {
		this.type = type;
	}
	
	
	

}
