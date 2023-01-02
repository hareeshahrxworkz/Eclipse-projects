package com.xworkz.pizza.dto;

public class CakeDTO {
	private String name;
	private String type;
	private Double price;

	public CakeDTO() {
	}

	public CakeDTO(String name, String type, Double price) {
		super();
		this.name = name;
		this.type = type;
		this.price = price;
	}

	@Override
	public String toString() {
		return "CakeDTO [name=" + name + ", type=" + type + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		System.out.println("Hash code Running");
		return 30;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

}
