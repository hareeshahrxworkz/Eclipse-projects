package com.xworkz.eqal.thing;

public class Instutation {
	private String name;
	private String founder;
	private String hrName;
	private String development;
	private String type;
	private String year;
	private String noOfTriners;
	private String state;
	private String place;
	private String country;

	public Instutation(String name, String founder, String hrName, String development, String type, String year,
			String noOfTriners, String state, String place, String country) {
		super();
		this.name = name;
		this.founder = founder;
		this.hrName = hrName;
		this.development = development;
		this.type = type;
		this.year = year;
		this.noOfTriners = noOfTriners;
		this.state = state;
		this.place = place;
		this.country = country;
	}

	@Override
	public boolean equals(Object inst) {

		if (inst instanceof Instutation) {
			System.out.println("instance ok");
			Instutation instutation = (Instutation) inst;
			if (this.name.equals(instutation.name) && this.founder.equals(instutation.founder)
					&& this.country.equals(instutation.country) && this.type.equals(instutation.type)
					&& this.hrName.equals(instutation.hrName) && this.development.equals(instutation.development))
				
			{
				System.out.println("Equal instutatioon");
				return true;

			}

		}

		return false;
	}

	@Override
	public String toString() {
		return "Instutation [name=" + name + ", founder=" + founder + ", hrName=" + hrName + ", development="
				+ development + ", type=" + type + ", year=" + year + ", noOfTriners=" + noOfTriners + ", state="
				+ state + ", place=" + place + ", country=" + country + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFounder() {
		return founder;
	}

	public void setFounder(String founder) {
		this.founder = founder;
	}

	public String getHrName() {
		return hrName;
	}

	public void setHrName(String hrName) {
		this.hrName = hrName;
	}

	public String getDevelopment() {
		return development;
	}

	public void setDevelopment(String development) {
		this.development = development;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getNoOfTriners() {
		return noOfTriners;
	}

	public void setNoOfTriners(String noOfTriners) {
		this.noOfTriners = noOfTriners;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
