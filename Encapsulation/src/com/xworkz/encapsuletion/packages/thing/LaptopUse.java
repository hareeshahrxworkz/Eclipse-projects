package com.xworkz.encapsuletion.packages.thing;

public class LaptopUse {
	Laptop laptop;

	public void LaptopRunner(Laptop laptop) {
		laptop.setLaptop("Hp", "intel", "intel i5", "yes", 2022, 10, 2500, 10, 2, 2);

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
