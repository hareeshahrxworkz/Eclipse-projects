package com.xworkz.person.association.thing;

public class Country {
	public CountryName countryname;
	public String president;
	public String capitalCity;
	public int countryCode;

	public Country(CountryName countryname, String president, String capitalCity, int countryCode) {
		super();
		this.countryname = countryname;
		this.president = president;
		this.capitalCity = capitalCity;
		this.countryCode = countryCode;
	}

	public void display() {
		System.out.println(this.countryname);
		System.out.println(this.president);
		System.out.println(this.capitalCity);
		System.out.println(this.countryCode);

	}

}
