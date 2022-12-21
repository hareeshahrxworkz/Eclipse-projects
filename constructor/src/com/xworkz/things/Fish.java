package com.xworkz.things;

public class Fish {
	
	public String name;
	public  String type;
	public Integer price;
	public  Integer weight;
	public Integer height;
	
	public Fish(String name ,String type)
	{
		this.name=name;
		this.type=type;
		
	}
	public Fish(String name ,Integer  price)
	{
		this.name=name;
		this.price=price;
		
	}
	public Fish(Integer price ,Integer weight)
	{
		this.price=price;
		this.weight=weight;
		
	}
	public Fish(Integer  weight ,Integer height ,String name)
	{
		this.weight=weight;
		this.height=height;
		this.name=name;
		
	}
	public Fish(String name ,Integer price,String type)
	{
		this.name=name;
		this.price=price;
		this.type=type;
		
	}
	public Fish(Integer price ,String name, String type)
	{
		this.price=price;
		this.name=name;
		this.type=type;
		
		
	}

}
