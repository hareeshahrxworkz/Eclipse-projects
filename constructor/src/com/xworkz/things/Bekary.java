package com.xworkz.things;

public class Bekary {
	
	static  String name="Manjunatha Bekari";
	public  String location;
	public  long contactNo;
	public String  choclates;
	public String chips;
	
	public String [] coolDrinks;
	public String [] iceCreame;
	public Integer [] cakePrice;
	public String [] snacks;
	public String [] sweet;
	public String [] biskete;

	public Bekary(String location,long contactNO,String choclets, String [] iceCreame,Integer [] cakePrice,String Chips,String [] coolDrinks,String [] snacks,String [] sweet,String [] biskete ) 
	{
	this.location=location;
	this.contactNo=contactNO;
	this.choclates=choclets;
	this.chips=Chips;
	this.iceCreame=iceCreame;
	this.coolDrinks=coolDrinks;
	this.cakePrice=cakePrice;
	this.snacks=snacks;
	this.sweet=sweet;
	this.biskete=biskete;
	
	}
	public void display()
	{
		System.out.println("BEkary naditha Ede evaga");
		System.out.println( name);
		System.out.println( this.location);
		System.out.println( this.contactNo);
		System.out.println( this.choclates);
		System.out.println( this.chips);
		System.out.println(System.lineSeparator());

		for (int i = 0; i < coolDrinks.length; i++) {
			
			System.out.println(coolDrinks[i]);			
		}
		System.out.println(System.lineSeparator());

		for (int i = 0; i < iceCreame.length; i++) {
			String icecreame = iceCreame[i];
			System.out.println(icecreame);			
		}
		System.out.println(System.lineSeparator());

		for (int i = 0; i < cakePrice.length; i++) {
			Integer cakeprice = cakePrice[i];
			System.out.println(cakeprice);			
		}
		System.out.println(System.lineSeparator());

		for (int i = 0; i < snacks.length; i++) {
			String snaacks = snacks[i];
			System.out.println(snaacks);			
		}
		System.out.println(System.lineSeparator());

		for (int i = 0; i < sweet.length; i++) {
			String string = sweet[i];
			System.out.println(string);			
		}
		System.out.println(System.lineSeparator());

		for (int i = 0; i < biskete.length; i++) {
			String string = biskete[i];
			System.out.println(string);			
		}

		
		
		
		
	}
	
}
