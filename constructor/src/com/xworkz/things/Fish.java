package com.xworkz.things;

public class Fish {
	
	public String name;
	public  String type;
	public double price;
	public  double weight;
	public double height;
	
	public Fish(String name ,String type)
	{
		this.name=name;
		this.type=type;
		
	}
	public Fish(String name ,double  price)
	{
		this.name=name;
		this.price=price;
		
	}
	public Fish(double price ,double weight)
	{
		this.price=price;
		this.weight=weight;
		
	}
	public Fish(double  weight ,double height ,String name)
	{
		this.weight=weight;
		this.height=height;
		this.name=name;
		
	}
	public Fish(String name ,double price,String type)
	{
		this.name=name;
		this.price=price;
		this.type=type;
		
	}
	public Fish(double price ,String name, String type)
	{
		this.price=price;
		this.name=name;
		this.type=type;
		
		
	}

}
