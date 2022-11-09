package com.xworkz.inheritance.object.boot;

import com.xworkz.inheritance.object.child.Moon;
import com.xworkz.inheritance.object.parent.Satellite;

public class SatelliteRunner {
	public static void main(String[] args) {
		Satellite satellite=new Moon("Banglore", "Rajajinagar", "Hassan");
		satellite.display();
	}
	

}
