package com.xworkz.association.thing.boot;

import com.xworkz.association.thing.Fuel;
import com.xworkz.association.thing.Type;

public class FuelRunner {
	
	public static void main(String[] args) {
		
		Fuel fuel=new Fuel(true, Type.ESSER, 101.2, 1);
		fuel.showOff();
		
	}

}
