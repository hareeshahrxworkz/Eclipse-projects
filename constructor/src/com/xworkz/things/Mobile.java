package com.xworkz.things;

public class Mobile {
	public String mobileShopName;
	public long contactNo;
	public String mobileOwenerName;
	public String landmark;
	public Integer shopRent;
	public Integer advance;
	
	public String [] mobileName;
	public String [] color;
	public String [] MobileAcceries;
	public Integer [] priceList;
	public String [] typesOfbatterys;
	
	
	public Mobile(String mobileShopName,String [] mobileName, long contactNo,String [] color,String mobileOwenerName, String [] MobileAcceries, String landmark,Integer shopRent,Integer [] priceList,Integer advance,String [] typesOfbatterys) {

	this.mobileShopName=mobileShopName;
	this.contactNo=contactNo;
	this.mobileOwenerName=mobileOwenerName;
	this.landmark=landmark;
	this.shopRent=shopRent;
	this.advance=advance;
	this.mobileName=mobileName;
	this.color=color;
	this.priceList=priceList;
	this.typesOfbatterys=typesOfbatterys;
	this.priceList=priceList;
	}
	
	public void display()
	{
		System.out.println(mobileShopName);
		System.out.println(contactNo);
		System.out.println(mobileOwenerName);
		System.out.println(landmark);
		System.out.println(shopRent);
		System.out.println(advance);

		
		System.out.println(System.lineSeparator());
		System.out.println("mobileName Printing naditha ede");
		
		for (int i = 0; i < mobileName.length; i++) {
			
			System.out.println(mobileName[i]);
			
		}
		System.out.println(System.lineSeparator());
		System.out.println("color Printing naditha ede");
		
for (int i = 0; i < color.length; i++) {
			
			System.out.println(color[i]);
			
		}
System.out.println(System.lineSeparator());
System.out.println("MobileAcceries Printing naditha ede");

for (int i = 0; i < MobileAcceries.length; i++) {
	
	System.out.println(MobileAcceries[i]);
	
}
System.out.println(System.lineSeparator());
System.out.println("priceList naditha ede");
for (int i = 0; i < priceList.length; i++) {
	
	System.out.println(priceList[i]);
	
}
System.out.println(System.lineSeparator());
System.out.println("typesOfbatterys Printing naditha ede");
for (int i = 0; i < typesOfbatterys.length; i++) {
	
	System.out.println(typesOfbatterys[i]);
	
}


		
	}
	

}
