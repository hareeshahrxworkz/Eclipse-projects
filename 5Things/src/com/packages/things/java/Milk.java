package com.packages.things.java;

public class Milk {
	
	public enum MilkBrand
	{
		NANDINI,AMUL,AVIN,DUDSAGAR,NESTEL;
		
	}
	
	public static String color="WHITE";
	public MilkBrand milkbrand ;
	public String mfgDate="26-10-2022";	
	public double price;
	public String expDate;
	
	
	public void setMilk(MilkBrand milkbrand, String expDate) {

		this.milkbrand = milkbrand;
		this.expDate = expDate;
	}
	
	public void  display()
	{
		System.out.println(color);
		System.out.println(this.milkbrand);
		System.out.println(this.mfgDate);
		System.out.println(this.price);
		System.out.println(this.expDate);

				
	}
	
	
}
