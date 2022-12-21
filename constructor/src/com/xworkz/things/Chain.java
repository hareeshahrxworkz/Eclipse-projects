package com.xworkz.things;

public class Chain {
	
	public String type ;
	public Integer price ;
	public int  length ;
	public String matirial ;
	public int weight ;
	public String stolen ;
	public String usedFor ;
	public char fresh ;

	
	
	public Chain(String type) 

	{
		super();
		this.type=type;
		
	}
	public Chain(String type ,Integer price) 
	{
		this(type);
		this.price = price;

	}
	public Chain(Integer price,int length) 
	{
		this("circle",price);
		this.length = length;

	}
	public Chain(int length,String matirial) 
	{
		this(length,400);
		this.matirial = matirial;

	}
	public Chain(String stolen,int weight,String matirial) 
	{
		this(5,matirial);
		this.weight = weight;
		this.stolen=stolen;

	}
	public Chain(int Weight,String stolen ,String usedFor) 
	{
		this(stolen,5,"iron");
		this.usedFor = usedFor;

	}
	public Chain(int weight,String stolen ,String usedFor,char fresh) 
	{
		this(weight,stolen,usedFor);
		this.usedFor = usedFor;
		this.fresh=fresh;

	}
	
}
