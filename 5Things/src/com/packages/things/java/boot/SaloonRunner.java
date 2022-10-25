package com.packages.things.java.boot;

import com.packages.things.java.Saloon;
import com.packages.things.java.Saloon.Location;

public class SaloonRunner {

	public static void main(String[] args) {
		
		Saloon saloon=new Saloon(Location.KRPURAM, "Male");
		
		saloon.price=110;
		saloon.display();
		
		
		
		
		
	}

}
