package com.xworkz.person.association.thing;

public class Company {

	public String name;
	public String ownerName;
	public Address address;

	
	
	
	public Company(String name, String ownerName, Address address) {
		super();
		this.name = name;
		this.ownerName = ownerName;
		this.address = address;
	}



	public void display() {
		System.out.println(System.lineSeparator());
		System.out.println("Company is printing");
		System.out.println(this.name);
		System.out.println(this.ownerName);
		if (this.address != null) {

			this.address.display();
		}

	}

}
