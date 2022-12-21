package com.xworkz.pizza.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class SoftwareCompanyRunner {

	public static void main(String[] args) {

		System.out.println("Software company Runner Is Running");

		String companyName = "Infosys";
		String companyName1 = "Wipro";
		String companyName2 = "Cogzant";
		String companyName3 = "Capgemini";
		String companyName4 = "TCS";
		String companyName5 = "Xl Soft";
		String companyName6 = "Mindtree";
		String companyName7 = "Tech Tree";
		String companyName8 = "Hp";
		String companyName9 = "Dxc";
		String companyName10 = "Mpasis";
		String companyName11 = "Tech Mehendra";
		String companyName12 = "Simenisis";
		String companyName13 = "Dell";
		String companyName14 = "Deliot";
		String companyName15 = "Apple";
		String companyName16 = "HCl";
		String companyName17 = "Samsung";
		String companyName18 = "IBM";
		String companyName19 = "Accenture";


		Collection<String> companynames = new ArrayList<String>();

		companynames.add(companyName);
		companynames.add(companyName1);
		companynames.add(companyName2);
		companynames.add(companyName3);
		companynames.add(companyName4);
		companynames.add(companyName5);
		companynames.add(companyName6);
		companynames.add(companyName7);
		companynames.add(companyName8);
		companynames.add(companyName9);
		companynames.add(companyName10);
		companynames.add(companyName11);
		companynames.add(companyName12);
		companynames.add(companyName13);
		companynames.add(companyName14);
		companynames.add(companyName15);
		companynames.add(companyName16);
		companynames.add(companyName17);
		companynames.add(companyName18);
		companynames.add(companyName19);

		System.out.println(companynames);
		System.out.println(System.lineSeparator());
		System.out.println("Using For loop Accessing Collection Element =========================================  ");
		for (String ref : companynames) {
			System.out.println(ref);
		}

		Iterator<String> ref = companynames.iterator();
		System.out.println(System.lineSeparator());
		System.out.println(
				"Using Iteretor loop Accessing Collection Element =========================================  ");
		while (ref.hasNext()) {
			String value = ref.next();
			System.out.println(value);

		}
		System.out.println("Array size is   :"+companynames.size());
		
		companynames.clear();
		System.out.println("After Clearing Array size is   :"+companynames.size());


	}

}
