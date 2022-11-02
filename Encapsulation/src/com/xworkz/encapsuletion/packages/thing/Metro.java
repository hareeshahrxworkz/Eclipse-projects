package com.xworkz.encapsuletion.packages.thing;

public class Metro {

	private String metroName;
	String DirectorName;
	String location;
	int noOfStations;
	String metroTiming;
	String Souce;
	String destination;
	double price;
	boolean available;
	int noOfVisitors;

	void setMetro(String directorName, String location, int noOfStations, String metroTiming, String souce,
			String destination, double price, boolean available, int noOfVisitors) {
		DirectorName = directorName;
		this.location = location;
		this.noOfStations = noOfStations;
		this.metroTiming = metroTiming;
		Souce = souce;
		this.destination = destination;
		this.price = price;
		this.available = available;
		this.noOfVisitors = noOfVisitors;
	}

	public String getDirectorName() {
		return DirectorName;
	}

	public String getLocation() {
		return location;
	}

	public int getNoOfStations() {
		return noOfStations;
	}

	public String getMetroTiming() {
		return metroTiming;
	}

	public String getSouce() {
		return Souce;
	}

	public String getDestination() {
		return destination;
	}

	public double getPrice() {
		return price;
	}

	public boolean isAvailable() {
		return available;
	}

	public int getNoOfVisitors() {
		return noOfVisitors;
	}

}
