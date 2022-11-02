package com.xworkz.encapsuletion.packages.thing;

public class PgUsage {

	Pg pg;

	public void pgUsage(Pg pg) {

		pg.setPg("Destiny", "manjula", 20, "21-07-2022", 6500, "Rajajinagar", "karnataka", "india", "9::00,1:00.9:00",
				"stupid prasanna", "Available");

		System.out.println(pg.getPgOwnerName());
		System.out.println(pg.getPGName());
		System.out.println(pg.getnOfPeople());
		System.out.println(pg.getFoodTimings());
		System.out.println(pg.getStartingYear());
		System.out.println(pg.getRent());
		System.out.println(pg.getLocation());
		System.out.println(pg.getState());
		System.out.println(pg.getCountry());
		System.out.println(pg.getFoodTimings());
		

		
	}
}
