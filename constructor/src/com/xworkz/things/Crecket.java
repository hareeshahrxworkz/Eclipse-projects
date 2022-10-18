package com.xworkz.things;

public class Crecket {
	
	public String place;
	public String groungName;
	public double entryPrice;
	public String groung_Color;
	public int noOfSeats;
	public boolean playing;
	
	public String playersName [];
	public String alroungPylayar [];
	public String bolers[];
	public String weketkeepers[];
	public double salary[];
	
	
	public Crecket(String place,String playersName [], String groungName, String alroungPylayar [],double entryPrice,String groung_Color,String bolers[],int noOfSeats,String weketkeepers[],boolean playing,double salary[])
	{
		this.place=place;
		this.groungName=groungName;
		this.entryPrice=entryPrice;
		this.groung_Color=groung_Color;
		this.noOfSeats=noOfSeats;
		this.playing=playing;
		this.playersName=playersName;
		this.alroungPylayar=alroungPylayar;
		this.bolers=bolers;
		this.weketkeepers=weketkeepers;
		this.salary=salary;

		
		
	}
	public void display()
	{
		System.out.println("place Printing naditha ede");
		System.out.println(this.place);
		
		System.out.println(this.groungName);
		System.out.println(this.entryPrice);
		System.out.println(this.groung_Color);
		System.out.println(this.noOfSeats);
		System.out.println(this.playing);

		
		
		System.out.println(System.lineSeparator());
		System.out.println("playersName Printing naditha ede");
		for (int i = 0; i < playersName.length; i++) {
			System.out.println(playersName[i]);
			
		}
		
		System.out.println(System.lineSeparator());
		System.out.println("alroungPylayar Printing naditha ede");
		for (int i = 0; i < alroungPylayar.length; i++) {
			System.out.println(alroungPylayar[i]);
			
		}
		
		System.out.println(System.lineSeparator());
		System.out.println("bolers Printing naditha ede");
		for (int i = 0; i < bolers.length; i++) {
			System.out.println(bolers[i]);
			
		}
		System.out.println(System.lineSeparator());
		System.out.println("weketkeepersPrinting naditha ede");
		for (int i = 0; i < weketkeepers.length; i++) {
			System.out.println(weketkeepers[i]);
			
		}
		System.out.println(System.lineSeparator());
		System.out.println("salary printing  naditha ede");
		for (int i = 0; i < salary.length; i++) {
			System.out.println(salary[i]);
			
		}
	}}

