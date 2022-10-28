package com.xworkz.association.many.things;

public class City {
	
	public String cityName;
	public String citycapital;
	public double noOfCites;
	public String  name; 
		
	public City(String cityName,String citycapital,double noOfCites)
	{
		
		this.citycapital=citycapital;
		this.noOfCites=noOfCites;
		this.cityName=cityName;
		

	}
	
	


	public void display()
	{
		
		System.out.println("city printing");
		System.out.println(this.citycapital);
		System.out.println(this.cityName);
		System.out.println(this.noOfCites);
		
	}

}
