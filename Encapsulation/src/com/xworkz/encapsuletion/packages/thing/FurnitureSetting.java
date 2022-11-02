package com.xworkz.encapsuletion.packages.thing;

public class FurnitureSetting {
	
	Furnicture furniture;
	public void settingFurniture(Furnicture furniture)
	{
		
		furniture.setFurnicture("Chair", "vijaynagar", 100,10, 9900775088L, "Karnataka", "52022hksajf", 200, "india");

		System.out.println(furniture.getItems());
		System.out.println(furniture.getLicenceNo());
		System.out.println(furniture.getLocation());
		System.out.println(furniture.getNoOfVisitors());
		System.out.println(furniture.getNoofEmployees());
		System.out.println(furniture.getContactNo());
		System.out.println(furniture.getLicenceNo());
		System.out.println(furniture.getPrice());
		System.out.println(furniture.getCountry());
		
	}

}
