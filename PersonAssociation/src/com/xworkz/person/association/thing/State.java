package com.xworkz.person.association.thing;

public class State {

	public StateName name;
	public String capital;
	public Integer areaAround;
	public int noOfCites;
	public Country country;

	public void setState(StateName name, String capital, Integer areaAround, int noOfCites, Country country) {
		this.name = name;
		this.capital = capital;
		this.areaAround = areaAround;
		this.noOfCites = noOfCites;
		this.country = country;
	}

	public void display() {
		System.out.println(System.lineSeparator());
		System.out.println("State priting");
		System.out.println(this.name);
		System.out.println(this.capital);
		System.out.println(this.areaAround);
		System.out.println(this.noOfCites);
		if (this.country != null) {
			this.country.display();

		}
	}

}
