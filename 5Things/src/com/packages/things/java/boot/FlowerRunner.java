package com.packages.things.java.boot;

import com.packages.things.java.Flower;
import com.packages.things.java.Flower.FlowerName;

public class FlowerRunner {

	public static void main(String[] args) {

		
		Flower flower =new Flower();
		flower.setFlower("Nelamangala", 2500,FlowerName.ROSE);
		flower.dipslay();
		
		
	}

}
