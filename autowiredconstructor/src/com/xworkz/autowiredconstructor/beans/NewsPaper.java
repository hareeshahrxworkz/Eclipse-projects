package com.xworkz.autowiredconstructor.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NewsPaper {
	@Autowired
	private int id;
	private String name;
	private String ownerName;
	@Autowired
	private String langauge;
	private double price;

	@Autowired
	public NewsPaper(String name, String ownerName) {
		super();
		this.name = name;
		this.ownerName = ownerName;
	}

	@Override
	public String toString() {
		return "NewsPaper [id=" + id + ", name=" + name + ", ownerName=" + ownerName + ", langauge=" + langauge
				+ ", price=" + price + "]";
	}

	@Autowired
	public void setPrice(@Qualifier("price") double price) {
		this.price = price;
	}

}
