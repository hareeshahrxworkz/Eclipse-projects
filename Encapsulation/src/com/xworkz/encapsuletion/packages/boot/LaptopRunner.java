package com.xworkz.encapsuletion.packages.boot;

import com.xworkz.encapsuletion.packages.thing.*;

public class LaptopRunner {
	public static void main(String[] args) {
		
		Laptop laptop=new Laptop();
		LaptopUse use=new LaptopUse();
		use.LaptopRunner(laptop);
		System.out.println("main naditha ede");
		System.out.println(laptop.getModelName());
		System.out.println(laptop.getProcessorBrand());
		System.out.println(laptop.getProcessorName());
		System.out.println(laptop.getGraphicProcessor());
		System.out.println(laptop.getBatteryBackUp());
		System.out.println(laptop.getBatteryBackUp());
		System.out.println(laptop.getPrice());
		System.out.println(laptop.getLaunchYear());
		System.out.println(laptop.getCapacityOfSSD());
		
		
		
		
	}

}
