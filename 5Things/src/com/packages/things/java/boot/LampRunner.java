package com.packages.things.java.boot;

import com.packages.things.java.Lamp;
import com.packages.things.java.Lamp.Color;

public class LampRunner {

	public static void main(String[] args) {

		Lamp lamp=new Lamp(Color.BLUE, 250, "21-10-2022");
		lamp.watts=6.5;
		lamp.disply();
		
	}

}
