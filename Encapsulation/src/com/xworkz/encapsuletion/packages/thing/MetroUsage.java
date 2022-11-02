package com.xworkz.encapsuletion.packages.thing;

public class MetroUsage {
	
	Metro metro;
	public void metroUsage(Metro metro)
	{
		metro.setMetro("basavaraju", "Banglore", 20, "5:30", "Nagasandra", "silkBoard", 45, true, 2500);
		System.out.println(metro.getDirectorName());
		System.out.println(metro.getLocation());
		System.out.println(metro.getNoOfStations());
		System.out.println(metro.getMetroTiming());
		System.out.println(metro.getSouce());
		System.out.println(metro.getDestination());
		System.out.println(metro.getPrice());
		System.out.println(metro.isAvailable());
		System.out.println(metro.getNoOfVisitors());

		
	}

}
