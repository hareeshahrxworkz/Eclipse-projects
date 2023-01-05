package com.xworkz.pizza.dto;

import java.io.Serializable;

public class MovieDTO implements Serializable,Comparable<MovieDTO>{
	private String name;
	private int visitors;
	private double price;
	private String location;

	public MovieDTO() {
		// TODO Auto-generated constructor stub
	}

	public MovieDTO(String name, int visitors, double price, String location) {
		super();
		this.name = name;
		this.visitors = visitors;
		this.price = price; 
		this.location = location;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 21;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if(obj instanceof MovieDTO)
			{
				MovieDTO dto=(MovieDTO)obj;
				
				if (dto.getName().equals(this.name)) {
					System.out.println("Cheackkin gis equal");
					return true;
					
				}
			}
		}
		return false;
	}
	
	@Override
	public int compareTo(MovieDTO o) {
		return o.getName().compareToIgnoreCase(this.name);
	}
	

	@Override
	public String toString() {
		return "MovieDTO [name=" + name + ", visitors=" + visitors + ", price=" + price + ", location=" + location
				+ "]";
	}

	public String getName() {
		return name;
	}

	public int getVisitors() {
		return visitors;
	}

	public double getPrice() {
		return price;
	}

	public String getLocation() {
		return location;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setVisitors(int visitors) {
		this.visitors = visitors;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
