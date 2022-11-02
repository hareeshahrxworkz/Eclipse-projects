package com.xworkz.encapsuletion.packages.boot;

import com.xworkz.encapsuletion.packages.thing.Perfume;
import com.xworkz.encapsuletion.packages.thing.PerfumeUse;

public class PurfumeRunner {
	
	public static void main(String[] args) {
		Perfume perfume=new Perfume();
		PerfumeUse use=new PerfumeUse();
		use.usage(perfume);
		
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
