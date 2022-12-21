package com.xworkz.association.many.things;

public class City {
	
	public Name cityName;
	public String citycapital;
	public Integer noOfCites;
	public String  name; 
		
	public City(Name cityName,String citycapital,Integer noOfCites)
	{
		
		this.citycapital=citycapital;
		this.noOfCites=noOfCites;
		this.cityName=cityName;
		

	}
	
	


	public void display()
	{
		
		System.out.println("city printing");
		System.out.println(this.citycapital);
		System.out.println(this.noOfCites);
		if(cityName!=null)
		{
			this.cityName.display();
		}
		
	}

}
