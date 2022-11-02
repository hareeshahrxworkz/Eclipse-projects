package com.xworkz.encapsuletion.packages.boot;

import com.xworkz.encapsuletion.packages.thing.*;

public class MetroRunner {
	public static void main(String[] args) {
		Metro metro = new Metro();
		MetroUsage metrousage = new MetroUsage();
		metrousage.metroUsage(metro);
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
