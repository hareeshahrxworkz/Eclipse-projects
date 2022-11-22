package com.xworkz.multiple.parent;

public class Simple {
	
	public String fruitName;
	public   int price;
	public String shop;
	
	
	
	public Simple(String fruitName) {
	
		super();
		this.fruitName = fruitName;
	
	}
	public Simple(String fruitName, int price, String shop) {
		
		this(fruitName);
		this.fruitName = fruitName;
		this.price = price;
		this.shop = shop;
	}
	
	public void display()
	{
		
		System.out.println(this.fruitName);
		
		System.out.println(this.price);
		System.out.println(this.shop);

	}
	
	
	
	
	
	

}
