package com.xworkz.pizza.dto;

public class RailwayStationDTO  extends AbstractAuditDTO{
	
	private String name;
	private int noOfPlatForm;
	private String area;
	private Integer platformTicketPrice;
	public RailwayStationDTO(String name, int noOfPlatForm, String area, Integer platformTicketPrice) {
		super();
		this.name = name;
		this.noOfPlatForm = noOfPlatForm;
		this.area = area;
		this.platformTicketPrice = platformTicketPrice;
	}
	@Override
	public String toString() {
		return "RailwayStationDTO [name=" + name + ", noOfPlatForm=" + noOfPlatForm + ", area=" + area
				+ ", platformTicketPrice=" + platformTicketPrice + ", toString()=" + super.toString() + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNoOfPlatForm() {
		return noOfPlatForm;
	}
	public void setNoOfPlatForm(int noOfPlatForm) {
		this.noOfPlatForm = noOfPlatForm;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public Integer getPlatformTicketPrice() {
		return platformTicketPrice;
	}
	public void setPlatformTicketPrice(Integer platformTicketPrice) {
		this.platformTicketPrice = platformTicketPrice;
	}
	
	
	

}
