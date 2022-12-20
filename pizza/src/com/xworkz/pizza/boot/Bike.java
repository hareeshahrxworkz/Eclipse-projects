package com.xworkz.pizza.boot;

import java.util.Collection;
import java.util.TreeSet;

public class Bike {
	public static void main(String[] args) {
		Collection<String> bikes = new TreeSet<String>();
		String BikeNames = "Hero";
		String BikeNames1 = "Honda";
		String BikeNames2 = "Passion Pro";
		String BikeNames3 = "CT00";
		String BikeNames4 = "Yamaha";
		String BikeNames5 = "Appache";
		String BikeNames6 = "Pulser";
		String BikeNames7 = "Due";
		String BikeNames8 = "Platinum";
		String BikeNames9 = "Tvs";
		String BikeNames10 = "Activa";
		String BikeNames11 = "Jupitar";
		String BikeNames12 = "Scooty";
		String BikeNames13 = "RX100";
		String BikeNames14 = "KTM";
		String BikeNames15 = "Rayal Enfield";
		
		bikes.add(BikeNames);
		bikes.add(BikeNames1);
		bikes.add(BikeNames2);
		bikes.add(BikeNames3);
		bikes.add(BikeNames4);
		bikes.add(BikeNames5);
		bikes.add(BikeNames6);
		bikes.add(BikeNames7);
		bikes.add(BikeNames8);
		bikes.add(BikeNames9);
		bikes.add(BikeNames10);
		bikes.add(BikeNames11);
		bikes.add(BikeNames12);
		bikes.add(BikeNames13);
		bikes.add(BikeNames14);
		bikes.add(BikeNames15);


		System.out.println("Before Clear Method Use   :" + bikes.size());

		bikes.clear();
		System.out.println("After Clear Method Use   :" + bikes.size());

	}

}