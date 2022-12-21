package com.xworkz.pizza.dto;

import java.time.LocalDateTime;

import com.xworkz.pizza.constant.PizzaSize;

public class PizzaDto extends AbstractAuditDTO {

	private String name;
	private String company;
	private PizzaSize size;
	private boolean chese;
	private Integer price;
	private String flavour;
	private String type;

	public PizzaDto() {
		super("AVA", LocalDateTime.now(), "HHH", LocalDateTime.now());
	}
	
	public PizzaDto(String createdBy, LocalDateTime createdDate, String updatedBy, LocalDateTime updatedDate,
			String name, String company, PizzaSize size, boolean chese, Integer price, String flavour, String type) {
		super(createdBy, createdDate, updatedBy, updatedDate);
		this.name = name;
		this.company = company;
		this.size = size;
		this.chese = chese;
		this.price = price;
		this.flavour = flavour;
		this.type = type;
	}

	@Override
	public String toString() {
		return "PizzaDto [name=" + name + ", company=" + company + ", size=" + size + ", chese=" + chese + ", price="
				+ price + ", flavour=" + flavour + ", type=" + type + ", getName()=" + getName() + ", getCompany()="
				+ getCompany() + ", getSize()=" + getSize() + ", isChese()=" + isChese() + ", getPrice()=" + getPrice()
				+ ", getFlavour()=" + getFlavour() + ", getType()=" + getType() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public PizzaSize getSize() {
		return size;
	}

	public void setSize(PizzaSize size) {
		this.size = size;
	}

	public boolean isChese() {
		return chese;
	}

	public void setChese(boolean chese) {
		this.chese = chese;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
