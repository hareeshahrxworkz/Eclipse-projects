package com.packages.things.java;

public class Flower {
	public enum FlowerName {

		ROSE, LOTUS, JASMINE, SUNFLOUR, TULIP;

	}

	public static String FlowerCompany = " Roses are Red";
	public FlowerName flower = FlowerName.SUNFLOUR;
	public String address;
	public long contactNo = 9900775088L;
	public Integer price;

	public void setFlower(String address, Integer price, FlowerName flower) {
		this.address = address;
		this.price = price;
		this.flower = flower;

	}

	public void dipslay() {

		System.out.println(FlowerCompany);
		System.out.println(this.flower);
		System.out.println(this.address);
		System.out.println(this.contactNo);
		System.out.println(this.price);

	}

}
