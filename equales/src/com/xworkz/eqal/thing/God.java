package com.xworkz.eqal.thing;

public class God {
	private String godName;
	private String wepan;
	private String templeName;
	private String place;
	private boolean Strong;
	private String model;
	private String year;
	private String entrancePrice;
	private String famous;
	private int noOfName;

	public God(String godName, String wepan, String templeName, String place, boolean strong, String model, String year,
			String entrancePrice, String famous, int noOfName) {
		super();
		this.godName = godName;
		this.wepan = wepan;
		this.templeName = templeName;
		this.place = place;
		Strong = strong;
		this.model = model;
		this.year = year;
		this.entrancePrice = entrancePrice;
		this.famous = famous;
		this.noOfName = noOfName;
	}

	@Override
	public boolean equals(Object go) {

		if (go instanceof God) {
			System.out.println("Entry  instance");
			God god = (God) go;
			if (this.godName.equals(god.godName) && this.famous.equals(god.famous) && this.model.equals(god.model)
					&& this.wepan.equals(god.wepan) && this.year.equals(god.year)) {
				System.out.println("GOd is Equal");
				return true;
			}
			else {
				System.err.println("is not match");
			}

		}

		return false;
	}

	@Override
	public String toString() {
		return "God [godName=" + godName + ", wepan=" + wepan + ", templeName=" + templeName + ", place=" + place
				+ ", Strong=" + Strong + ", model=" + model + ", year=" + year + ", entrancePrice=" + entrancePrice
				+ ", famous=" + famous + ", noOfName=" + noOfName + "]";
	}

	public String getGodName() {
		return godName;
	}

	public void setGodName(String godName) {
		this.godName = godName;
	}

	public String getWepan() {
		return wepan;
	}

	public void setWepan(String wepan) {
		this.wepan = wepan;
	}

	public String getTempleName() {
		return templeName;
	}

	public void setTempleName(String templeName) {
		this.templeName = templeName;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public boolean isStrong() {
		return Strong;
	}

	public void setStrong(boolean strong) {
		Strong = strong;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getEntrancePrice() {
		return entrancePrice;
	}

	public void setEntrancePrice(String entrancePrice) {
		this.entrancePrice = entrancePrice;
	}

	public String getFamous() {
		return famous;
	}

	public void setFamous(String famous) {
		this.famous = famous;
	}

	public int getNoOfName() {
		return noOfName;
	}

	public void setNoOfName(int noOfName) {
		this.noOfName = noOfName;
	}

}
