package com.xworkz.encapsuletion.packages.thing;

public class VichalUsing {
	Vichal vichal;
	public void vichalusage(Vichal vichal)
	{
		vichal.setVichal("jhon", 10, "Available", "11",2500, 9900775088L, "Banglore", "Karnataka", "india");
		System.out.println(vichal.getOwnerName());
		System.out.println(vichal.getNofVichals());
		System.out.println(vichal.getDelivery());
		System.out.println(vichal.getNofVisitors());
		System.out.println(vichal.getPrice());
		System.out.println(vichal.getContactNo());
		System.out.println(vichal.getState());
		System.out.println(vichal.getLocation());
		System.out.println(vichal.getCountry());
	

	
	}
	
	
}
