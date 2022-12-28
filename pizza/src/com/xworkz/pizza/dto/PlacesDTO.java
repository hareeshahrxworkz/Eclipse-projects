package com.xworkz.pizza.dto;

import java.io.Serializable;

public class PlacesDTO implements Serializable {

	private String name;
	private String favirateTemple;
	private Integer visitors;

	public PlacesDTO() {
	}

	
	
	public PlacesDTO(String name, String favirateTemple, Integer visitors) {
		super();
		this.name = name;
		this.favirateTemple = favirateTemple;
		this.visitors = visitors;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj!=null) {
			if (obj instanceof PlacesDTO) {
				
				PlacesDTO dto=(PlacesDTO)obj;
				if (this.visitors.equals(dto.getVisitors())) {
					System.out.println("Both Are Equal Visitors");
					return true;
				}
				
			}
			
			
			
		}
		
		return false;
	}

	
	
	


	@Override
	public String toString() {
		return "PlacesDTO [name=" + name + ", favirateTemple=" + favirateTemple + ", visitors=" + visitors + "]";
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getFavirateTemple() {
		return favirateTemple;
	}



	public void setFavirateTemple(String favirateTemple) {
		this.favirateTemple = favirateTemple;
	}



	public Integer getVisitors() {
		return visitors;
	}



	public void setVisitors(Integer visitors) {
		this.visitors = visitors;
	}

	
	
}
