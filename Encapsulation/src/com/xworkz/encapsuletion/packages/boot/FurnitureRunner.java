package com.xworkz.encapsuletion.packages.boot;

import com.xworkz.encapsuletion.packages.thing.*;

public class FurnitureRunner {

	public static void main(String[] args) {
		FurnitureSetting setfurniture = new FurnitureSetting();
		Furnicture furniture = new Furnicture();
		setfurniture.settingFurniture(furniture);
		
		System.out.println("Furniture runner naditha ede");
		furniture.display();
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
