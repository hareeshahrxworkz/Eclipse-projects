package com.xworkz.things;

public class WineShop {

	static String wineShopName="vija WineShope";
	public long shopContactNo;
	public String wineShopOwnerName;
	public String address;
	public String wineshopLicence;
	public  String logo;
	
	public String [] harddrink;
	public Integer [] price;
	public String [] winetype;
	public  String [] wineColor;
	public String [] softDrink;
	
	public WineShop(long shopContactNo,String [] harddrink,Integer [] price,String address,String wineshopLicence,String [] winetype,String logo,String [] wineColor, String [] softDrink) {

		this.shopContactNo=shopContactNo;
		
		this.address=address;
		this.wineshopLicence=wineshopLicence;
		this.logo=logo;
		this.harddrink=harddrink;
		this.price=price;
		this.winetype=winetype;
		this.wineColor=wineColor;
		this.softDrink=softDrink;

		
	
	}
	public void display()
	{
		System.out.println(wineShopOwnerName);
		System.out.println(shopContactNo);
		System.out.println(address);
		System.out.println(wineshopLicence);
		System.out.println(logo);
		
		System.out.println(System.lineSeparator());
		System.out.println("Harddrinks Printing naditha ede");
		
		for (int i = 0; i < harddrink.length; i++) {
			
			System.out.println(harddrink[i]);
			
		}
		System.out.println(System.lineSeparator());
		System.out.println("Soft drinks Printing naditha ede");
		
for (int i = 0; i < softDrink.length; i++) {
			
			System.out.println(softDrink[i]);
			
		}
System.out.println(System.lineSeparator());
System.out.println("Price Printing naditha ede");

for (int i = 0; i < price.length; i++) {
	
	System.out.println(price[i]);
	
}
System.out.println(System.lineSeparator());
System.out.println("WineShopePrinting naditha ede");
for (int i = 0; i < winetype.length; i++) {
	
	System.out.println(harddrink[i]);
	
}
System.out.println(System.lineSeparator());
System.out.println("WineColor Printing naditha ede");
for (int i = 0; i < wineColor.length; i++) {
	
	System.out.println(wineColor[i]);
	
}


		
	}
	
	
	
}
