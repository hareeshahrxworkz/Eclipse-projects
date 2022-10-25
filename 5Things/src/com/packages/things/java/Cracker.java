package com.packages.things.java;



enum Cracke
{
	ELEPHANT,CHINKANSTIK,AUTOMBOMB,ROCKET;

}

public class Cracker {
	
	static  String Brand="Lakshmi";
	public Cracke cracke=Cracke.CHINKANSTIK;
	public String companyName="Vasantha Packaging Industry";
	public double price;
	public String address;
	public long contactNo;
	public Cracker( double price, String address) {
		this.price = price;
		this.address = address;
	}
	
	public void display()
	{
		System.out.println(Brand);
		System.out.println(this.cracke);
		System.out.println(this.price);
		System.out.println(this.address);
		System.out.println(this.contactNo);

		
	}
	

}
