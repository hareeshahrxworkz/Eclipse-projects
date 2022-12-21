package com.xworkz.things;

public class Bread {

	public  char type;
	public  String shape;
	public  Integer  price;
	public  int quantity;
	public  String  companyName;

	
	public Bread(char type)
	{
		
		this.type=type;
		
	}
	public Bread(char type , Integer  price)
	{
		
		this.type=type;
		
		this.price=price;
	}
	public Bread(char type ,Integer price,String shape)
	{
		
		this.type=type;
		this.shape=shape;
		this.price=price;
		
	}
	public Bread(String shape)
	{
		
		this.shape=shape;
		
	}
	public Bread(Integer price)
	{
		
		this.price=price;
		
	}
	public Bread(int quantity)
	{
		
		this.quantity=quantity;
		
	}
	public Bread(String companyName,int quantity )
	{
		
		this.quantity=quantity;
		this.companyName=companyName;
		
	}
	public Bread(char type , String shape,Integer price,int quantity,String companyName)
	{
		
		this.type=type;
		this.shape=shape;
		this.price=price;
		this.quantity=quantity;
		this.companyName=companyName;
		
	}
}
