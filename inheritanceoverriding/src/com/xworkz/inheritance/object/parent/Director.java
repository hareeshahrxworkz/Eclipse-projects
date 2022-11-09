package com.xworkz.inheritance.object.parent;

public class Director {

	public String directorName;
	public String production;

	public Director(String directorName, String production) {
		this.directorName = directorName;
		this.production = production;
	}

	public void display() {
		System.out.println(this.directorName);
		System.out.println(this.production);

	}

}
