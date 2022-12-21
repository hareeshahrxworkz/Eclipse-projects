package com.xworkz.pizza.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class AnimalRunner {

	public static void main(String[] args) {

		String animalName = "Lion";
		String animalName1 = "Tiger";
		String animalName2 = "Cheeth";
		String animalName3 = "Bear";
		String animalName4 = "Hare";
		String animalName5 = "Rabbit";
		String animalName6 = "Donkey";
		String animalName7 = "Fox";
		String animalName8 = "Cow";
		String animalName9 = "Cat";

		Collection<String> animals = new ArrayList<String>();

		animals.add(animalName);
		animals.add(animalName1);
		animals.add(animalName2);
		animals.add(animalName3);
		animals.add(animalName4);
		animals.add(animalName5);
		animals.add(animalName6);
		animals.add(animalName7);
		animals.add(animalName8);
		animals.add(animalName9);

		System.out.println(animals);
		System.out.println(System.lineSeparator());

		System.out.println("For Using Printing animals  ===================================");

		for (String ref : animals) {
			System.out.println(ref);
		}

		System.out.println("Iteretor Using Printing animals  ===================================");

		Iterator<String> ref = animals.iterator();

		while (ref.hasNext()) {
			String value = ref.next();
			System.out.println(value);

		}

		System.out.println("Before Animals Clearing   : " + animals.size());

		animals.clear();
		System.out.println("after Animals Clearing   : " + animals.size());

	}

}
