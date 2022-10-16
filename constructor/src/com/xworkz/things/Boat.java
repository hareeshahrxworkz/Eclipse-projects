package com.xworkz.things;

public class Boat {

	public String name;
	public String color;
	public String companyName;
	public char type;
	public String owner;

	public Boat(String name) {
		this.name = name;
	}

	public Boat(String color, String name) {
		this.color = color;
		this.name = name;

	}

	public Boat(String owner, String companyName, String name) {
		this.companyName = companyName;
		this.owner = owner;
		this.name = name;
	}

	public Boat(String name, char type) {
		this.name = name;
		this.type = type;
	}

	public Boat(char type, String name) {
		this.name = name;
		this.type = type;
	}

	public Boat(String owner, char type, String name) {
		this.name = name;
		this.owner = owner;
		this.name = name;

	}

	public Boat(String owner, char type, String name, String color) {
		this.name = name;
		this.owner = owner;
		this.name = name;
		this.color = color;

	}

	public Boat(String owner, String name, char type) {
		this.name = name;
		this.owner = owner;
		this.name = name;

	}

}
