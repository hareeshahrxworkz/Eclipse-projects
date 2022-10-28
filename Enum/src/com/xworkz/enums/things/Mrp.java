package com.xworkz.enums.things;

import com.xworkz.enums.EnumClass;

public class Mrp {
	
	public Name name;
	public String  customers;
	
	public int price;
	public Location location=new Location("Rajajinagara",EnumClass.CHITRADURGA, "india", 30);
	
	public Mrp()
	{
		
	}
	
	public Mrp(Name name, String customers, int price) {
		super();
		this.name = name;
		this.customers = customers;
		this.price = price;
	}

	


	public void display()
	{
		System.out.println("mrp naditha ede");
		System.out.println(this.name);
		System.out.println(this.customers);
		System.out.println(this.price);
		System.out.println(this.location.country);
		
		
		
		if(location!=null) {
		location.display();
		
		}
		
		name.dis();

	}
	

	

}
