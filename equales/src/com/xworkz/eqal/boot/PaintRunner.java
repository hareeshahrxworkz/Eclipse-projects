package com.xworkz.eqal.boot;

import com.xworkz.eqal.thing.Currency;
import com.xworkz.eqal.thing.God;
import com.xworkz.eqal.thing.Hospital;
import com.xworkz.eqal.thing.Instutation;
import com.xworkz.eqal.thing.Lipstik;
import com.xworkz.eqal.thing.Paint;
import com.xworkz.eqal.thing.Vechile;
import com.xworkz.eqal.thing.WateBottle;

public class PaintRunner {

	public static void main(String[] args) {

		Paint paint = new Paint("Asian", "Integer", 500, "manoj", "banglore", "karnataka", "india", 577542,
				99007780555L, "bittlenut");

		Paint paint1 = new Paint("aspair", "ligth", 700, "mamatha", "rajajinagar", "belagam", "india", 574578,
				99007795212L, "Nut");
		paint1.setBrand("Asian");

		boolean same = paint.equals(paint1);
		System.out.println(same);

		System.out.println(paint.toString());
		System.out.println(paint1.toString());

		System.out.println(System.lineSeparator());

		System.out.println("vichal ===================================================================");

		Vechile vechile = new Vechile("Marutu susuki", "Swift", "Red", "susuki", "symson", "Apr-2019", 2000, "dabaspet",
				"banglore", "Tumakur", "india");

		Vechile vechile1 = new Vechile("Marutu susuki", "dezire", "white", "susuki", "petrol", "Apr-2011", 8000,
				"rajajinagar", "tiptur", "sira", "usa");

		vechile1.setName("Swift");
		System.out.println(vechile.equals(vechile1));
		System.out.println(vechile.toString());
		System.out.println(vechile1.toString());

		System.out.println(System.lineSeparator());

		System.out.println("Lipstik ===================================================================");

		Lipstik lipstik = new Lipstik("Bullete", "lipstik", 800, "red", "female", "soft", "Girls", 20, "Belagavi",
				"Karnatak", "india");
		Lipstik lipstik2 = new Lipstik("line", "lipstik", 800, "red", "female", "soft", "Girls", 60, "Belagavi",
				"Karnatak", "india");
		lipstik2.setBrand("Bullete");
		System.out.println(lipstik.equals(lipstik2));
		System.out.println(lipstik.toString());
		System.out.println(lipstik2.toString());

		System.out.println(System.lineSeparator());

		System.out.println("waterbottle ===================================================================");

		WateBottle wateBottle = new WateBottle("Kingfisher", "aqua", 20, 250, "22mm", "5.3circle", "jul/2022",
				"dec/2022", "Prakash", "india");
		WateBottle wateBottle2 = new WateBottle("Bislari", "aqua", 80, 950, "30mm", "4.5circle", "may/2023", "jul/2023",
				"Prakash", "india");

		wateBottle2.setBrand("Kingfisher");

		System.out.println(wateBottle.equals(wateBottle2));
		System.out.println(wateBottle.toString());

		System.out.println(System.lineSeparator());

		System.out.println("currency ===================================================================");

		Currency currency = new Currency("rupe", "india", true, "Mysore", "coin", "brown", "Gandiji", "2019", 200);
		Currency currency1 = new Currency("dolor", "india", true, "Mysore", "coin", "brown", "Gandiji", "2022", 500);
		currency1.setCurrencyName("rupe");
		System.out.println(currency.equals(currency1));
		System.out.println(currency.toString());
		System.out.println(currency1.toString());

		System.out.println(System.lineSeparator());

		System.out.println("Temple ===================================================================");

		God god = new God("Shiva", "trishula", "shivatemple", "bannglore", true, "stone", "2016", "400", "fullStrong",
				250);
		God god1 = new God("Shiva", "trishula", "shivatemple", "bannglore", false, "stone", "2016", "400", "fullStrong",
				150);

		god1.setGodName("parvathi");
		System.out.println(god.equals(god1));
		System.out.println(god.toString());
		System.out.println(god1.toString());

		System.out.println(System.lineSeparator());

		System.out.println("instutation ===================================================================");
		Instutation instutation = new Instutation("Xworkz", "omkar", "vinay", "akshara", "softwere", "2022", "50",
				"karnataka", "rajajinagar", "india");
		Instutation instutation1 = new Instutation("Xworkz", "omkar", "vinay", "akshara", "softwere", "2018", "10",
				"karnataka", "rajajinagar", "india");
		instutation1.setCountry("nepal");

		System.out.println(instutation.equals(instutation1));
		System.out.println(instutation.toString());
		System.out.println(instutation1.toString());

		System.out.println(System.lineSeparator());

		System.out.println("Hospital ===================================================================");

		Hospital hospital = new Hospital("shubam", "raju", "chitradurga", "Karnataka", "gouramma", "lakshmi", "india",
				"Taraveller", "shanti", 577542);
		Hospital hospital1 = new Hospital("shubam", "raju", "chitradurga", "Karnataka", "gouramma", "lakshmi", "india",
				"Taraveller", "Maharaj", 571313);
		hospital1.setDoctorName("manoj");
		System.out.println(hospital.equals(hospital1));
		System.out.println(hospital.toString());
		System.out.println(hospital1.toString());
	}

}
