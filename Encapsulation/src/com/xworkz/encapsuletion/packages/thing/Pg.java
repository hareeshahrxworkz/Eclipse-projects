package com.xworkz.encapsuletion.packages.thing;

public class Pg {

	String PGName;
	String PgOwnerName;
	int nOfPeople;
	String startingYear;
	double rent;
	String location;
	String State;
	String Country;
	String foodTimings;
	String ManageerName;
	String Cooking;

	void setPg(String pGName, String pgOwnerName, int nOfPeople, String startingYear, double rent, String location,
			String state, String country, String foodTimings, String manageerName, String cooking) {
		PGName = pGName;
		PgOwnerName = pgOwnerName;
		this.nOfPeople = nOfPeople;
		this.startingYear = startingYear;
		this.rent = rent;
		this.location = location;
		State = state;
		Country = country;
		this.foodTimings = foodTimings;
		ManageerName = manageerName;
		Cooking = cooking;
	}

	public String getPGName() {
		return PGName;
	}

	public String getPgOwnerName() {
		return PgOwnerName;
	}

	public int getnOfPeople() {
		return nOfPeople;
	}

	public String getStartingYear() {
		return startingYear;
	}

	public double getRent() {
		return rent;
	}

	public String getLocation() {
		return location;
	}

	public String getState() {
		return State;
	}

	public String getCountry() {
		return Country;
	}

	public String getFoodTimings() {
		return foodTimings;
	}

	public String getManageerName() {
		return ManageerName;
	}

	public String getCooking() {
		return Cooking;
	}

}
