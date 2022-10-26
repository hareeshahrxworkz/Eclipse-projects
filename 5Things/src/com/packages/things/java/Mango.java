package com.packages.things.java;

public class Mango {
	
	public enum Location{
		
		BANGLORE,CHITRADURGA,TUMAKURU,RAJAJINAGAR,BELAGAVI,DAVANAGERE;
		
	}	
	public static String  brand="Mango Masti";
	public  Location loction;
	public String color="Yellow";
	public double price;
	public  double weight;
	
	
	public void  setMango(Location loction, double price) {
		this.loction = loction;
		this.price = price;
	}
	
	
	public void display()
	{
		System.out.println(brand);
		System.out.println(this.loction);
		System.out.println(this.color);
		System.out.println(this.price);
		System.out.println(this.weight);
	}

}
