package com.xworkz.person.association.boot;

import com.xworkz.person.association.thing.Address;
import com.xworkz.person.association.thing.City;
import com.xworkz.person.association.thing.Company;
import com.xworkz.person.association.thing.Country;
import com.xworkz.person.association.thing.Email;
import com.xworkz.person.association.thing.Job;
import com.xworkz.person.association.thing.Location;
import com.xworkz.person.association.thing.Person;
import com.xworkz.person.association.thing.State;

public class PersonRunner {
	
	public static void main(String[] args) {
		
		State state=new State("Karnataka", "Banglore", 750,10, Country.INDIA);
		City city=new City("Banglore", "Bendakaluru", "Electronic city", "Cold");
		Location location=new Location();
		location.setLocation(20, "Rajajinagara", city, state, Country.INDIA);
		
		Address address=new Address(location);
		Company company=new Company("XworkZ", "Omkar", address);
		
		Job job=new Job(4.5, "Softwere developer", false,company);
		
		Email email=new Email();
		email.setEmail(101, "hareesha12345", 9900775088L, company);
		
		Email email2=new Email();
		email2.setEmail(102, "12456dom", 9844537206L, company);
		
		
		Email [] array= {email,email2};
		
		Person person =new Person("Manjunatha");
		person.setPerson(array, job);

		
		person.display();
		
	}

}
