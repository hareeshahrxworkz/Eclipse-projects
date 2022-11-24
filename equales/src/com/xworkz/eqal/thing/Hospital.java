package com.xworkz.eqal.thing;

public class Hospital {
	private String name;
	private String doctorName;
	private String place;
	private String state;
	private String nurseName;
	private String counterName;
	private String country;
	private String ambulence;
	private String wardName;
	private int pincode;

	public Hospital(String name, String doctorName, String place, String state, String nurseName, String counterName,
			String country, String ambulence, String wardName, int pincode) {
		super();
		this.name = name;
		this.doctorName = doctorName;
		this.place = place;
		this.state = state;
		this.nurseName = nurseName;
		this.counterName = counterName;
		this.country = country;
		this.ambulence = ambulence;
		this.wardName = wardName;
		this.pincode = pincode;
	}

	@Override
	public boolean equals(Object has) {

		if (has instanceof Hospital) {
			System.out.println("instance entry");
			Hospital hospital = (Hospital) has;
			if (this.name.equals(hospital.name) && this.ambulence.equals(hospital.ambulence)
					&& this.counterName.equals(hospital.counterName) && this.country.equals(hospital.country)
					&& this.doctorName.equals(hospital.doctorName) && this.nurseName.equals(hospital.nurseName)
					&& this.place.equals(hospital.place)) {
				System.out.println("Both are same ");
				return true;

			}
			else {
				System.err.println("Both are not equal");
			}
		}

		return false;
	}

	@Override
	public String toString() {
		return "Hospital [name=" + name + ", doctorName=" + doctorName + ", place=" + place + ", state=" + state
				+ ", nurseName=" + nurseName + ", counterName=" + counterName + ", country=" + country + ", ambulence="
				+ ambulence + ", wardName=" + wardName + ", pincode=" + pincode + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getNurseName() {
		return nurseName;
	}

	public void setNurseName(String nurseName) {
		this.nurseName = nurseName;
	}

	public String getCounterName() {
		return counterName;
	}

	public void setCounterName(String counterName) {
		this.counterName = counterName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getAmbulence() {
		return ambulence;
	}

	public void setAmbulence(String ambulence) {
		this.ambulence = ambulence;
	}

	public String getWardName() {
		return wardName;
	}

	public void setWardName(String wardName) {
		this.wardName = wardName;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

}
