package com.xworkz.pizza.boot;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MetroRunner {

	public static void main(String[] args) {
		String metro = "Banglore";
		String metro1 = "Mumbai";
		String metro2 = "Hydaradbad";
		String metro3 = "KolKatta";
		String metro4 = "Delhi";

		Collection<String> metros = new ArrayList();
		metros.add(metro);
		metros.add(metro1);
		metros.add(metro2);
		metros.add(metro3);
		metros.add(metro4);

		System.out.println(metros);
		System.out.println(System.lineSeparator());
		System.out.println("For loop using Printing Elements ==============");
		for (String ref : metros) {
			System.out.println(ref);

		}
		System.out.println(System.lineSeparator());
		System.out.println("Iteretor loop using Printing Elements ==============");
		Iterator<String> ref=metros.iterator();
		while (ref.hasNext()) {
			String value = (String) ref.next();
			System.out.println(value);
		}
		
		System.out.println("Collection Size is  :"+metros.size());
		
		metros.clear();
		System.out.println(System.lineSeparator());
		System.out.println("after clearing Collection Size is  :"+metros.size());



	}

}
