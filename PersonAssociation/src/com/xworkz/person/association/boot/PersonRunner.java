package com.xworkz.person.association.boot;

import com.xworkz.person.association.thing.Address;
import com.xworkz.person.association.thing.City;
import com.xworkz.person.association.thing.Company;
import com.xworkz.person.association.thing.Country;
import com.xworkz.person.association.thing.CountryName;
import com.xworkz.person.association.thing.Email;
import com.xworkz.person.association.thing.Job;
import com.xworkz.person.association.thing.Location;
import com.xworkz.person.association.thing.Person;
import com.xworkz.person.association.thing.State;
import com.xworkz.person.association.thing.StateName;

public class PersonRunner {

	public static void main(String[] args) {
		Country country = new Country();
		country.setCountry(CountryName.INDIA, "Narendra Modi", "Delhi", 91);
		State state = new State();
		state.setState(StateName.KARNATAKA, "Banglore", 750, 10, country);
		City city = new City();
		city.setCity("Banglore", "Bendakaluru", "Electronic city", "Cold");
		Location location = new Location();
		location.setLocation(20, "Rajajinagara", city, state, country);

		Address address = new Address(location);
		Company company = new Company();
		company.setCompany("XworkZ", "Omkar", address);

		Job job = new Job();
		job.setJob(4.5, "Softwere developer", false, company);

		Email email = new Email();
		email.setEmail("mohan.xworkz@gmail", "mohan123m", 9900775088L, company);

		Email email2 = new Email();
		email2.setEmail("jhon.xworkz@gmail.com", "12456dom", 9844537206L, company);

		Email[] array = { email, email2 };

		Person person = new Person();
		person.setPerson("Manjunatha",array, job);

		person.display();

	}

}
