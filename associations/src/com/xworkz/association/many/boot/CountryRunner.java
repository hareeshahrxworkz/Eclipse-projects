package com.xworkz.association.many.boot;

import com.xworkz.association.many.things.City;
import com.xworkz.association.many.things.Country;
import com.xworkz.association.many.things.Gender;
import com.xworkz.association.many.things.Presedent;

public class CountryRunner {

	public static void main(String[] args) {

		
		Presedent presedent=new Presedent("narendra modiji");
		presedent.setGender(Gender.MALE);
		
		Country country=new Country(presedent,"india", "delhi", 400);
		
		City city=new City("Karnataka", "Banglore", 30);
		City city1=new City("Andrapradesh","Hydaradbad", 25);
		


		City [] cityes= {city,city1};
		country.setCites(cityes);
		
		city.display();
		country.display();

		
		
		
	}

}
