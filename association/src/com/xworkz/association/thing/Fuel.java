package com.xworkz.association.thing;

public class Fuel {
	

	
	public Brand brand=new Brand("Petrol", 9865325l, Location.BANGLORE, 5);
	public boolean special;
	public Type type;
	public double price;
	public double quantity;
	
	
	public Fuel(boolean special, Type type, double price, double quantity) {
		this.special = special;
		this.type = type;
		this.price = price;
		this.quantity = quantity;
	}




	public void showOff()
	{
		System.out.println("Fual execute agtha ede");
		System.out.println(this.special);
		System.out.println(this.type);
		System.out.println(this.price);
		System.out.println(this.quantity);
		
		brand.showOff();

		
	}
	
	
	

}
