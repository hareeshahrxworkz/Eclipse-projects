package com.xworkz.pizza.dto;

public class BuildingDTO extends AbstractAuditDTO{
	private int no;
	private String name;
	private int flore;
	private boolean parking;
	private boolean lift;
	private String type;
	public BuildingDTO(int no, String name, int flore, boolean parking, boolean lift, String type) {
		super();
		this.no = no;
		this.name = name;
		this.flore = flore;
		this.parking = parking;
		this.lift = lift;
		this.type = type;
	}
	@Override
	public String toString() {
		return "BuildingDTO [no=" + no + ", name=" + name + ", flore=" + flore + ", parking=" + parking + ", lift="
				+ lift + ", type=" + type + ", toString()=" + super.toString() + "]";
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFlore() {
		return flore;
	}
	public void setFlore(int flore) {
		this.flore = flore;
	}
	public boolean isParking() {
		return parking;
	}
	public void setParking(boolean parking) {
		this.parking = parking;
	}
	public boolean isLift() {
		return lift;
	}
	public void setLift(boolean lift) {
		this.lift = lift;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	

}
