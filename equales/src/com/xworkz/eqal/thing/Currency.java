package com.xworkz.eqal.thing;

public class Currency {
	private String currencyName;
	private String country;
	private boolean exchange;
	private String mfgArea;
	private String type;
	private String color;
	private String mark;
	private String year;
	private double price;

	public Currency(String currencyName, String country, boolean exchange, String mfgArea, String type, String color,
			String mark, String year, double price) {
		super();
		this.currencyName = currencyName;
		this.country = country;
		this.exchange = exchange;
		this.mfgArea = mfgArea;
		this.type = type;
		this.color = color;
		this.mark = mark;
		this.year = year;
		this.price = price;

	}

	@Override
	public boolean equals(Object rupe) {

		if (rupe instanceof Currency) {
			System.out.println("instance entry==========");
			Currency currency = (Currency) rupe;
			if (this.currencyName.equals(currency.currencyName) && this.color.equals(currency.color)
					&& this.mark.equals(currency.mark) && this.mfgArea.equals(currency.mfgArea)) {
				System.out.println("both are equal");
				return true;
			} else {
				System.err.println("both or not equal");
			}

		}

		return false;
	}

	@Override
	public String toString() {
		return "Currency [currencyName=" + currencyName + ", country=" + country + ", exchange=" + exchange
				+ ", mfgArea=" + mfgArea + ", type=" + type + ", color=" + color + ", mark=" + mark + ", year=" + year
				+ ", price=" + price + "]";

	}

	public String getCurrencyName() {
		return currencyName;
	}

	public void setCurrencyName(String currencyName) {
		this.currencyName = currencyName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public boolean isExchange() {
		return exchange;
	}

	public void setExchange(boolean exchange) {
		this.exchange = exchange;
	}

	public String getMfgArea() {
		return mfgArea;
	}

	public void setMfgArea(String mfgArea) {
		this.mfgArea = mfgArea;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
