package com.xworkz.person.association.thing;

public class Address {
	public Location location;

	public Address(Location location) {
		this.location = location;
	}

	public void display() {
		System.out.println(System.lineSeparator());

		if (this.location != null) {
			location.display();

		}
	}

}
