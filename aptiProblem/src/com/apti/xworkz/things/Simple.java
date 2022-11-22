package com.apti.xworkz.things;

public class Simple {
	
	static  String ShopName;
	public String ownerNAme;
	public long contactNo;
	
	public void shope( String ShopName,String ownerNAme ,long contactNo)
	{
		this.ShopName=ShopName;
		this.ownerNAme=ownerNAme;
		this.contactNo=contactNo;
		
		
	}
	
	public void display ()
	
	{
		System.out.println(this.ShopName);
		System.out.println(this.ownerNAme);
		System.out.println(this.contactNo);

		
	}
}
