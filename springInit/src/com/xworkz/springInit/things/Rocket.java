package com.xworkz.springInit.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("rocket")
public class Rocket {
	
	@Value("India")
	private String country;
	@Value ("Kepegowda international Air port")
	private String name;
	@Value("1234578.0")
	private double budget;
	
	
	public Rocket() {
		System.out.println("Actor Is Creating Constructor");
	}
	
	
	public Rocket(String country, String name, double budget) {
		super();
		this.country = country;
		this.name = name;
		this.budget = budget;
	}


	public void setCountry(String country) {
		this.country = country;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public String getCountry() {
		return country;
	}

	public String getName() {
		return name;
	}

	public double getBudget() {
		return budget;
	}



	
	
	
	
	

}
