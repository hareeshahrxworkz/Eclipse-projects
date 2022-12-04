package com.xworkz.interfaces.followers;

import com.xworkz.interfaces.rules.Airport;

public class AirportRule implements Airport {

	@Override
	public boolean airportRules() {
System.out.println("Airport Rules running");	
return false;
	}

	@Override
	public int passangers() {
		System.out.println("passanger Rules running");	
		return 20;
	}

}
