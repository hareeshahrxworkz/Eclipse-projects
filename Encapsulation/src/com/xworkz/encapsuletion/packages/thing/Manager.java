package com.xworkz.encapsuletion.packages.thing;

public class Manager {

	Hotel hotel;

	public void setProperties(Hotel hotel) {

		hotel.setproperties("manjunatha", "Chitranna", 250, "Banglore", "1AGST123466", 50, 10, true, "Online order", 5);
		System.out.println(hotel.getOwnerName());
		System.out.println(hotel.getMenu());
		System.out.println(hotel.getPrice());
		System.out.println(hotel.getLocation());
		System.out.println(hotel.getGstNO());
		System.out.println(hotel.getNoOfWorkers());
		System.out.println(hotel.getSeatingCapacity());
		System.out.println(hotel.isVegiterien());
		System.out.println(hotel.getServicetype());
		System.out.println(hotel.getHotelRating());

	}

}
