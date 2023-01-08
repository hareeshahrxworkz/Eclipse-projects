package com.xworkz.pizza.boot;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapRunner {
	public static void main(String[] args) {

		Map<String, Double> entrys = new HashMap<String, Double>();
		// adding Entry to the Hash map implementation
		entrys.put("Banglore", 20.6);
		entrys.put("Shivamogga", 26.9);
		entrys.put("Belagavi", 30.8);
		entrys.put("Chitradurga", 18.7);
		entrys.put("Davanagere", 12.23);
		entrys.put("Hassan", 24.25);
		entrys.put("Mysore", 16.7);
		entrys.put("Ballery", 26.4);
		entrys.put("Badami", 20.1);
		entrys.put("Vijayapura", 15.5);

		// Accessing entries only values
		System.out.println("Values printing ======================== ");
		Collection<Double> value = entrys.values();
		value.forEach(e -> System.out.println(e));
		// accessing element only key
		System.out.println("Values printing  ****************************** ");

		Set<String> set = entrys.keySet();
		set.forEach(e -> System.out.println(e));
		System.out.println("All Entries Printing");

		Set<Entry<String, Double>> ref = entrys.entrySet();
		ref.forEach(e -> System.out.println("Keys   : " + e.getKey() + "  Values   : " + e.getValue()));

		Map<String, Integer> chocolats = new HashMap<String, Integer>();
		chocolats.put("KachaMango", 100);
		chocolats.put("KitKat", 250);
		chocolats.put("DiryMilk", 150);
		chocolats.put("copico", 501);
		chocolats.put("Mango", 123);
		chocolats.put("Mars", 178);
		chocolats.put("Sinickers", 562);
		chocolats.put("Munch", 250);
		chocolats.put("Tonys", 140);
		chocolats.put("CoffyByte", 270);

		// Accessing entries only values
		System.out.println("Values printing ======================== ");
		Collection<Integer> chocolateValue = chocolats.values();
		chocolateValue.forEach(e -> System.out.println(e));
		// accessing element only key
		System.out.println("Values printing  ****************************** ");

		Set<String> choclateSet = chocolats.keySet();
		choclateSet.forEach(e -> System.out.println(e));
		System.out.println("All Entries Printing");

		Set<Entry<String, Integer>> choclateEntry = chocolats.entrySet();
		choclateEntry.forEach(e -> System.out.println("Keys   : " + e.getKey() + "  Values   : " + e.getValue()));

		Map<Long, String> areas = new HashMap<Long, String>();

		areas.put(577542L, "Chitradurga");
		areas.put(577527L, "Hosadurga");
		areas.put(571313L, "Chamarajanagr");
		areas.put(577001L, "Banglore");
		areas.put(575001L, "Chikkamagaluru");
		areas.put(577712L, "Belagm");
		areas.put(577821L, "Mysore");
		areas.put(586521L, "Haassan");
		areas.put(577281L, "Davanagere");

		// Accessing entries only values
		System.out.println("Values printing ======================== ");
		Collection<String> areaValue = areas.values();
		areaValue.forEach(e -> System.out.println(e));
		// accessing element only key
		System.out.println("Values printing  ****************************** ");

		Set<Long> areaSet = areas.keySet();
		areaSet.forEach(e -> System.out.println(e));
		System.out.println("All Entries Printing");

		Set<Entry<Long, String>> areaEntry = areas.entrySet();
		areaEntry.forEach(e -> System.out.println("Keys   : " + e.getKey() + "  Values   : " + e.getValue()));

		Map<String, String> companys = new HashMap<String, String>();

		companys.put("Amezon", "AmezonSoftware");
		companys.put("Google", "Angular Softwares");
		companys.put("Facebook", "React softwares");
		companys.put("Meta", "Watsapp");
		companys.put("Microsoft", "MS Office");
		companys.put("Xworkz", "XworkzSoftware");
		companys.put("Microsofts", "Windows10");
		companys.put("Tcs", "Banking Application");
		companys.put("Axixs", "Axixs Software");
		companys.put("ICICI", "ICICI Softwares");

		// Accessing entries only values
		System.out.println("Values printing ======================== ");
		Collection<String> companyValue = companys.values();
		companyValue.forEach(e -> System.out.println(e));
		// accessing element only key
		System.out.println("Values printing  ****************************** ");

		Set companySet = companys.keySet();
		companySet.forEach(e -> System.out.println(e));
		System.out.println("All Entries Printing");

		Set<Entry<String, String>> companyEntry = companys.entrySet();
		companyEntry.forEach(e -> System.out.println("Keys   : " + e.getKey() + "  Values   : " + e.getValue()));

		Map<String, Double> pgs = new HashMap<String, Double>();
		pgs.put("Destiny", 6000.0);
		pgs.put("Venkateshware", 6000.0);
		pgs.put("Balagi", 6000.0);
		pgs.put("Vishnu", 4000.0);
		pgs.put("Sudha", 5000.0);
		pgs.put("MAnu", 6500.0);
		pgs.put("Maruti", 4000.0);
		pgs.put("Navarang", 4500.0);
		pgs.put("Bahnu pg", 7500.0);

		// Accessing entries only values
		System.out.println("Values printing ======================== ");
		Collection<Double> pgsValue = pgs.values();
		pgsValue.forEach(e -> System.out.println(e));
		// accessing element only key
		System.out.println("Values printing  ****************************** ");

		Set pgsSet = pgs.keySet();
		companySet.forEach(e -> System.out.println(e));
		System.out.println("All Entries Printing");

		Set<Entry<String, Double>> pgsEntry = pgs.entrySet();
		pgsEntry.forEach(e -> System.out.println("Keys   : " + e.getKey() + "  Values   : " + e.getValue()));

	}

}
