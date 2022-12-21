package com.xworkz.association.many.things;

public class Country {
	public Presedent name;
	public String countryname;
	public String capital;
	public Integer areaarround;
	public City[] cites;

	public Country(Presedent name, String countryname, String capital, Integer areaarround) {
		super();
		this.countryname = countryname;
		this.capital = capital;
		this.areaarround = areaarround;
		this.name = name;
	}

	public void setCites(City[] city) {

		this.cites = city;

	}

	public void display() {
		System.out.println(this.countryname);
		System.out.println(this.capital);
		System.out.println(this.areaarround);

		if (name != null) {

			this.name.display();

		}
		if (cites != null) {
			for (int i = 0; i < cites.length; i++) {
				City city = cites[i];
				if (city != null) {
					city.display();
				}

			}
		} else {
			System.out.println("cites is null");
		}
	}

}
