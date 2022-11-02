package com.xworkz.encapsuletion.packages.thing;

public class Hotel {
	private String hotelName = "RaviTeja 2* Hotel";
	String ownerName;
	String menu;
	double price;
	String location;
	String gstNO;
	int noOfWorkers;
	int seatingCapacity;
	boolean Vegiterien;
	public String servicetype;
	int hotelRating;

	public void setproperties(String ownerName, String menu, double price, String location, String gstNO,
			int noOfWorkers, int seatingCapacity, boolean vegiterien, String servicetype, int hotelRating) {
		this.ownerName = ownerName;
		this.menu = menu;
		this.price = price;
		this.location = location;
		this.gstNO = gstNO;
		this.noOfWorkers = noOfWorkers;
		this.seatingCapacity = seatingCapacity;
		this.Vegiterien = vegiterien;
		this.servicetype = servicetype;
		this.hotelRating = hotelRating;
	}

	public String getOwnerName() {
		return this.ownerName;
	}

	public String getMenu() {
		return this.menu;
	}

	public double getPrice() {
		return this.price;
	}

	public String getLocation() {
		return this.location;
	}

	public String getGstNO() {
		return this.gstNO;
	}

	public int getNoOfWorkers() {
		return this.noOfWorkers;
	}

	public int getSeatingCapacity() {
		return this.seatingCapacity;
	}

	public boolean isVegiterien() {
		return this.Vegiterien;
	}

	public String getServicetype() {
		return this.servicetype;
	}

	public int getHotelRating() {
		return this.hotelRating;
	}

}
