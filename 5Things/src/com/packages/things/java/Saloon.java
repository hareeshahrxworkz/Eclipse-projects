package com.packages.things.java;

public class Saloon {
public enum Location{
	BANGLORE,MANGLORE,RAJAJINAGAR,SHIVAJINAGAR,KRPURAM,VIJAYNAGAR
}
	
	public static String shopeName="NIKIL saloon Shop";
	public Location location;
	public String gender;
	public Integer price;
	public long contactNo=7619403108L;
	
	
	public Saloon(Location location, String gender) {
		this.location = location;
		this.gender = gender;
	}
	
	
	public void display()
	{
		System.out.println(shopeName);
		System.out.println(location);
		System.out.println(gender);
		System.out.println(price);
		System.out.println(contactNo);

		
	}


}
