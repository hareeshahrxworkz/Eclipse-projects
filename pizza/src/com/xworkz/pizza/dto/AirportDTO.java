package com.xworkz.pizza.dto;

import java.io.Serializable;

public class AirportDTO  implements Serializable{
	
	private String name;
	private String location;
	private Integer totalVisitors;
	private String contry;

	public AirportDTO() {
	}
	public AirportDTO(String name, String location, Integer totalVisitors,String contry) {
		super();
		this.name = name;
		this.location = location;
		this.totalVisitors = totalVisitors;
		this.contry= contry;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null)
		{
			if (obj instanceof AirportDTO) {
				System.out.println("Equals is Cheacking ");
				AirportDTO airportDTO=(AirportDTO)obj;
				if(this.contry.equals(airportDTO.getContry()))
				{
					System.out.println("Cheacking Sucessfully ");
					return true;
				}
				
			}
		}
		
		return false;
	}
	
	
	@Override
	public String toString() {
		return "AirportDTO [name=" + name + ", location=" + location + ", totalVisitors=" + totalVisitors + ", contry=" + contry +"]";
	}
	public String getContry() {
		return contry;
	}
	public void setContry(String contry) {
		this.contry = contry;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Integer getTotalVisitors() {
		return totalVisitors;
	}
	public void setTotalVisitors(Integer totalVisitors) {
		this.totalVisitors = totalVisitors;
	}
	
	
	
	

}
