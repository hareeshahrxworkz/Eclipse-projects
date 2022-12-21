package com.xworkz.pizza.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class WatchRunner {

	public static void main(String[] args) {

		String watch="Titan";
		String watch1="Fastrak";
		String watch2="LimeStone";
		String watch3="Rado";
		String watch4="Hmt";
		
		Collection<String> watches=new ArrayList<String>();
		watches.add(watch1);
		watches.add(watch2);
		watches.add(watch3);
		watches.add(watch4);
		watches.add(watch);
		System.out.println(watches);
		System.out.println(System.lineSeparator());
		
		for (String ref : watches) {
			
			System.out.println(ref);
			
		}
		System.out.println(System.lineSeparator());

		System.out.println("Itereter Using Printion Collection Element ============================================");
		Iterator<String> ref=watches.iterator();
		while (ref.hasNext()) {
			String value = (String) ref.next();
			
			System.out.println(value);
			
		}
		
		System.out.println(watches.size());
		
		System.out.println(System.lineSeparator());
		watches.clear();
		System.out.println("After clear method using   :"+watches.size());
		
		
		
		
	}

}
