package com.xworkz.things;

public class Fan {
	static String brandName="Bajaj";
	public String shopeName;
	public Integer price;
	public Integer weight;
	public Integer height;
	public boolean stand;
	
	public String fanBrand [] ;
	public String [] fanColors;
	public String [] Manufacturer;
	public String [] countryOrigin;
	
	public Fan( String shopeName,String fanBrand [], Integer price ,String [] fanColors,Integer weight,String [] Manufacturer,Integer height,String [] countryOrigin,boolean stand) {

		this.shopeName=shopeName;
		this.fanColors=fanColors;
		this.price=price;
		this.weight=weight;
		this.height=height;
		this.stand=stand;
		this.fanBrand=fanBrand;
		this.Manufacturer=Manufacturer;
		this.countryOrigin=countryOrigin;

		
	
	}
	
	public void display()
	{
		System.out.println("Printing naditha ede");
		System.out.println(this.shopeName);
		
		System.out.println(this.price);
		System.out.println(this.weight);
		System.out.println(this.height);
		System.out.println(this.stand);
		
		
		System.out.println(System.lineSeparator());
		System.out.println("Printing naditha ede");
		for (int i = 0; i < fanBrand.length; i++) {
			System.out.println(fanBrand[i]);
			
		}
		
		System.out.println(System.lineSeparator());
		System.out.println("countryOrigin Printing naditha ede");
		for (int i = 0; i < countryOrigin.length; i++) {
			System.out.println(countryOrigin[i]);
			
		}
		
		System.out.println(System.lineSeparator());
		System.out.println("fanColors Printing naditha ede");
		for (int i = 0; i < fanColors.length; i++) {
			System.out.println(fanColors[i]);
			
		}
		System.out.println(System.lineSeparator());
		System.out.println("Printing naditha ede");
		for (int i = 0; i < Manufacturer.length; i++) {
			System.out.println(Manufacturer[i]);
			
		}

		


		
	}
	
	

}
