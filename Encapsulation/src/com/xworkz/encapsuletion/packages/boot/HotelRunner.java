package com.xworkz.encapsuletion.packages.boot;

import com.xworkz.encapsuletion.packages.thing.*;

public class HotelRunner {
	public static void main(String[] args) {

		Manager manager = new Manager();
		System.out.println("Hotel Main naditha ede");
		System.out.println();
		Hotel hotel = new Hotel();
		manager.setProperties(hotel);
		System.out.println("Hotel Main  naditha ede");
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
