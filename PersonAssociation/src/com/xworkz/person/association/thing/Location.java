package com.xworkz.person.association.thing;

public class Location {

	public int no;
	public String street;
	public City city;
	public State state;
	public Country country;

	public void setLocation(int no, String street, City city, State state, Country country) {
		this.no = no;
		this.street = street;
		this.city = city;
		this.state = state;
	}

	public void display() {
		System.out.println(System.lineSeparator());
		System.out.println("Locatin printing naditha ede");
		System.out.println(this.no);
		System.out.println(this.street);
		if (this.city != null) {
			city.display();
		}

		if (this.state != null) {
			this.state.display();

		}

	}

}