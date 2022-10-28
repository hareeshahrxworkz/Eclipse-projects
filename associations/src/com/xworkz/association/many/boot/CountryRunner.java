package com.xworkz.association.many.boot;

import com.xworkz.association.many.things.City;
import com.xworkz.association.many.things.Country;
import com.xworkz.association.many.things.Gender;
import com.xworkz.association.many.things.Name;
import com.xworkz.association.many.things.Presedent;

public class CountryRunner {

	public static void main(String[] args) {

		
		Presedent presedent=new Presedent("narendra modiji");
		presedent.setGender(Gender.MALE);
		
		Country country=new Country(presedent,"india", "delhi", 400);
		Name name=new Name("Bendakaluru", "Bengaluru", "Electronic city");
		City city=new City(name, "Karnataka", 30);
		Name name1=new Name("kalpataranadu", "Tumakuru", " Smart city");

		City city1=new City(name1,"Karnataka", 25);
		


		City [] cityes= {city,city1};
		country.setCites(cityes);
		
		country.display();
		
		
		
	}

}
