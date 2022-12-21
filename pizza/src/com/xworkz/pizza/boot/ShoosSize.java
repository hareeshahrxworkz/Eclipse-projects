package com.xworkz.pizza.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ShoosSize {

	public static void main(String[] args) {

		Integer size = 10;
		Integer size1 = 07;
		Integer size2 = 06;
		Integer size3 = 04;
		Integer size4 = 03;
		Integer size5 = 05;
		Integer size6 = 11;
		Integer size7 = 07;
		Integer size8 = 9;
		Integer size9 = 11;
		Integer size10 = 12;
		Integer size11 = 13;
		Integer size12 = 8;
		Integer size13 = 03;
		Integer size14 = 10;
		
		
		Collection<Integer> sizes = new ArrayList<Integer>();
		sizes.add(size1);
		sizes.add(size2);
		sizes.add(size3);
		sizes.add(size4);
		sizes.add(size5);
		sizes.add(size6);
		sizes.add(size7);
		sizes.add(size8);
		sizes.add(size9);
		sizes.add(size10);
		sizes.add(size11);
		sizes.add(size12);
		sizes.add(size13);
		sizes.add(size14);
		System.out.println(sizes);

		System.out.println(System.lineSeparator());
		System.out.println("Array Size is   :" + sizes.size());
		System.out.println(" Using For printing Elements  :========================================");

		for (Integer ref : sizes) {
			System.out.println(ref);
		}

		System.out.println(" Using iteration printing Elements  :========================================");

		Iterator<Integer> ref = sizes.iterator();

		while (ref.hasNext()) {
			Integer value = ref.next();
			System.out.println(value);

		}
		
		System.out.println(System.lineSeparator());
		sizes.clear();
		System.out.println("After Clearing  Colection method================ :"+sizes.size());

	}

}
