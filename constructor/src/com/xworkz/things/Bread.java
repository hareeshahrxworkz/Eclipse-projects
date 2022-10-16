package com.xworkz.things;

public class Bread {

	public  char type;
	public  String shape;
	public  double  price;
	public  int quantity;
	public  String  companyName;

	
	public Bread(char type)
	{
		
		this.type=type;
		
	}
	public Bread(char type , double  price)
	{
		
		this.type=type;
		
		this.price=price;
	}
	public Bread(char type ,double price,String shape)
	{
		
		this.type=type;
		this.shape=shape;
		this.price=price;
		
	}
	public Bread(String shape)
	{
		
		this.shape=shape;
		
	}
	public Bread(double price)
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
	public Bread(char type , String shape,double price,int quantity,String companyName)
	{
		
		this.type=type;
		this.shape=shape;
		this.price=price;
		this.quantity=quantity;
		this.companyName=companyName;
		
	}
}
