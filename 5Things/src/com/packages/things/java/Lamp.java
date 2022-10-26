package com.packages.things.java;

public class Lamp {

	public enum Color {

		WHITE, BLUE, YELLOW, RED, GREEN;

	}

	public static String brand = "Valaista";
	public Color color;
	public double price;
	public String mfgDate;
	public double watts;

	public void setLamp(Color color, double price, String mfgDate) {
		this.color = color;
		this.price = price;
		this.mfgDate = mfgDate;
	}

	public void disply() {
		System.out.println(brand);
		System.out.println(this.color);
		System.out.println(this.price);
		System.out.println(this.mfgDate);
		System.out.println(this.watts);

	}

}
