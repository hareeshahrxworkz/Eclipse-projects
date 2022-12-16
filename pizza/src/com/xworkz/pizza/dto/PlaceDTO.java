package com.xworkz.pizza.dto;

public class PlaceDTO extends AbstractAuditDTO {
	private String  placeName;
	private String famousTemple;
	private int distance;
	private String wether;
	private String placeType;
	public PlaceDTO(String placeName, String famousTemple, int distance, String wether, String placeType) {
		super();
		this.placeName = placeName;
		this.famousTemple = famousTemple;
		this.distance = distance;
		this.wether = wether;
		this.placeType = placeType;
	}
	@Override
	public String toString() {
		return "PlaceDTO [placeName=" + placeName + ", famousTemple=" + famousTemple + ", distance=" + distance
				+ ", wether=" + wether + ", placeType=" + placeType + ", toString()=" + super.toString() + "]";
	}
	public String getPlaceName() {
		return placeName;
	}
	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}
	public String getFamousTemple() {
		return famousTemple;
	}
	public void setFamousTemple(String famousTemple) {
		this.famousTemple = famousTemple;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public String getWether() {
		return wether;
	}
	public void setWether(String wether) {
		this.wether = wether;
	}
	public String getPlaceType() {
		return placeType;
	}
	public void setPlaceType(String placeType) {
		this.placeType = placeType;
	}
	
	
	
	
	

}
