package com.xworkz.person.association.thing;

public class City {

	public String cityName;
	public String cityOldName;
	public String cityNewName;
	public String Whether;

	public City(String cityName, String cityOldName, String cityNewName, String Whether) {
		this.cityName = cityName;
		this.cityOldName = cityOldName;
		this.cityNewName = cityNewName;
		this.Whether = Whether;
	}

	public void display() {
		System.out.println(System.lineSeparator());

		System.out.println("City Printing Agtha ede");
		System.out.println(this.cityName);
		System.out.println(this.cityOldName);
		System.out.println(this.cityNewName);

		System.out.println(this.Whether);

	}

}
