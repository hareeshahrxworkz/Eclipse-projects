package com.xworkz.association.thing;

public class Fuel {
	

	
	public Brand brand=new Brand("Petrol", 9865325l, Location.BANGLORE, 5);
	public boolean special;
	public Type type;
	public Integer price;
	public Integer quantity;
	
	
	public Fuel(boolean special, Type type, Integer price, Integer quantity) {
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
