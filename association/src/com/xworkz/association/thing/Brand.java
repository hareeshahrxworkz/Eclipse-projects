package com.xworkz.association.thing;

public class Brand {

	

	public String name;
	public long gstNo;
	public Location location;
	public int rating;

	public Brand(String name, long gstNo, Location location, int rating) {
		this.name = name;
		this.gstNo = gstNo;
		this.location = location;
		this.rating = rating;

	}

	public void showOff()

	{
		System.out.println("Brand execute agtha ede");


		System.out.println(this.name);
		System.out.println(this.gstNo);
		System.out.println(this.location);
		System.out.println(this.rating);

	}
}
