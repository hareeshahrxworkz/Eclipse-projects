package com.xworkz.eqal.thing;

public class Vechile {

	private String brand;
	private String name;
	private String color;
	private String companyName;
	private String engine;
	private String model;
	private Integer price;
	private String location;
	private String state;
	private String distric;
	private String country;

	public Vechile(String brand, String name, String color, String companyName, String mngine, String model,
			Integer price, String location, String state, String distric, String country) {
		super();
		this.brand = brand;
		this.name = name;
		this.color = color;
		this.companyName = companyName;
		this.engine = mngine;
		this.model = model;
		this.price = price;
		this.location = location;
		this.state = state;
		this.distric = distric;
		this.country = country;
	}

	@Override
	public boolean equals(Object main) {

		if (main instanceof Vechile) {
			System.out.println("instance entry");
			Vechile vechile = (Vechile) main;

			if (this.brand.equals(vechile.brand)&& this.name.equals(vechile.name)) {
				System.out.println("comparing visited");

				return true;
			}
			else {
				System.err.println("is not match properties");
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "Vechile [brand=" + brand + ", name=" + name + ", color=" + color + ", companyName=" + companyName
				+ ", mngine=" + engine + ", model=" + model + ", price=" + price + ", location=" + location + ", state="
				+ state + ", distric=" + distric + ", country=" + country + "]";
	}

	public String getBrand() {
		return brand;
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public String getCompanyName() {
		return companyName;
	}

	public String getMngine() {
		return engine;
	}

	public String getModel() {
		return model;
	}

	public Integer getPrice() {
		return price;
	}

	public String getLocation() {
		return location;
	}

	public String getState() {
		return state;
	}

	public String getDistric() {
		return distric;
	}

	public String getCountry() {
		return country;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public void setEngine(String mngine) {
		this.engine = mngine;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setDistric(String distric) {
		this.distric = distric;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
