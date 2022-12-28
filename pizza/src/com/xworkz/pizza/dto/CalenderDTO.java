package com.xworkz.pizza.dto;

public class CalenderDTO {
	
	private  Integer Year;
	private String name;
	private  Integer noOfDays;
	public CalenderDTO() {
	}
	public CalenderDTO(Integer year, String name, Integer noOfDays) {
		super();
		Year = year;
		this.name = name;
		this.noOfDays = noOfDays;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj!=null) {
			if (obj instanceof CalenderDTO ) {
				
				CalenderDTO calenderDTO=(CalenderDTO)obj;
				if (calenderDTO.noOfDays.equals(this.noOfDays)) {
					return true;
					
				}
				
				
			}
		}
		
		return false;
	}
	
	@Override
	public String toString() {
		return "CalenderDTO [Year=" + Year + ", name=" + name + ", noOfDays=" + noOfDays + "]";
	}
	public Integer getYear() {
		return Year;
	}
	public void setYear(Integer year) {
		Year = year;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getNoOfDays() {
		return noOfDays;
	}
	public void setNoOfDays(Integer noOfDays) {
		this.noOfDays = noOfDays;
	}
	
	

}
