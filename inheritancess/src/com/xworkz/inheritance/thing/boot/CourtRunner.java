package com.xworkz.inheritance.thing.boot;

import com.xworkz.inheritance.thing.Child.*;
import com.xworkz.inheritance.thing.parent.Court;

public class CourtRunner {

	public static void main(String[] args) {
		
		Court court=new HighCourt();
		System.out.println("HighCourtCourtPrinting");
		System.out.println(court.CourtName);
		System.out.println(court.location);
		HighCourt high=(HighCourt)court;
		System.out.println("AfterHighCourt Casting");
		System.out.println(high.location);
		System.out.println(high.year);

		Court court1=new DistricCourt();
		System.out.println("DistricCourt Printing");
		System.out.println(court1.CourtName);
		System.out.println(court1.location);
		DistricCourt dist=(DistricCourt)court1;
		System.out.println("After DistricCourt Casting");
		System.out.println(dist.DistricCourt);
		System.out.println(dist.Address);


		Court court2=new SuprimeCourt();
		System.out.println("SuprimeCourt Printing");
		System.out.println(court2.CourtName);
		System.out.println(court2.location);
		SuprimeCourt sup=(SuprimeCourt)court2;
		System.out.println("After SuprimeCourt Casting");
		System.out.println(sup.Suprime);
		System.out.println(sup.Power);
		
		


		
		
	}
}
