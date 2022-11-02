package com.xworkz.encapsuletion.packages.thing;

public class PerfumeUse {
	Perfume perfume;
	public void usage(Perfume perfume)
	{
		perfume.setPerfume("nilagiri", "manju", "india0", 250, "21-2-2022", "25-2-2024",true, 20,  "Heigh", "green");
		
		System.out.println(perfume.getBrandOwner());
		System.out.println(perfume.getColour());
		System.out.println(perfume.getExpiryDate());
		System.out.println(perfume.getFragrance());
		System.out.println(perfume.getManufactureCountry());
		System.out.println(perfume.getManufactureDate());
		System.out.println(perfume.getPrice());
		System.out.println(perfume.getQuantity());
		System.out.println(perfume.isQuality());

	}
}
