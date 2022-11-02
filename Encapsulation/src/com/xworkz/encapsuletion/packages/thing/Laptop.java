package com.xworkz.encapsuletion.packages.thing;

public class Laptop {
	private String brand = "Dell";
	String modelName ;
	String processorBrand ;
	String processorName ;
	String graphicProcessor ;
	double launchYear;
	double capacityOfSSD ;
	double price ;
	int ram ;
	int batteryBackUp ;
	int warranty ;
	
	
	
	void setLaptop(String modelName, String processorBrand, String processorName, String graphicProcessor, double launchYear,
			double capacityOfSSD, double price, int ram, int batteryBackUp, int warranty) {
		this.modelName = modelName;
		this.processorBrand = processorBrand;
		this.processorName = processorName;
		this.graphicProcessor = graphicProcessor;
		this.launchYear = launchYear;
		this.capacityOfSSD = capacityOfSSD;
		this.price = price;
		this.ram = ram;
		this.batteryBackUp = batteryBackUp;
		this.warranty = warranty;
	}
	public String getModelName() {
		return modelName;
	}
	public String getProcessorBrand() {
		return processorBrand;
	}
	public String getProcessorName() {
		return processorName;
	}
	public String getGraphicProcessor() {
		return graphicProcessor;
	}
	public double getLaunchYear() {
		return launchYear;
	}
	public double getCapacityOfSSD() {
		return capacityOfSSD;
	}
	public double getPrice() {
		return price;
	}
	public int getRam() {
		return ram;
	}
	public int getBatteryBackUp() {
		return batteryBackUp;
	}
	public int getWarranty() {
		return warranty;
	}


}
