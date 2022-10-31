package com.xworkz.person.association.thing;

public class Address {
	public Location location;

	public Address(Location location) {
		this.location = location;
	}

	public void display() {
		System.out.println(System.lineSeparator());
		System.out.println("addreess printing agtha ede");

		if (this.location != null) {
			location.display();

		}
	}

}
