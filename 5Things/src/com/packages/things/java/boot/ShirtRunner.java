package com.packages.things.java.boot;

import com.packages.things.java.Shirt;
import com.packages.things.java.Shirt.ShirtBrand;

public class ShirtRunner {

	public static void main(String[] args) {

		Shirt shirt=new Shirt(ShirtBrand.ADIDAS, "Mysore",250);
		shirt.contacuNo= 9844537206L;
		shirt.display();
		
		
	}

}
