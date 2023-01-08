package com.xworkz.pizza.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

import com.xworkz.pizza.dto.AirportDTO;

public class AirportDTORunner {

	public static void main(String[] args) {
		System.out.println("Main AirportDTORunner sucessfull ");

		AirportDTO airportDTO = new AirportDTO("Kempegowda International Airport", "Banglore", 1000, "India");
		AirportDTO airportDTO1 = new AirportDTO("RaniChennamma Airport", "Hubli", 2000, "India");
		AirportDTO airportDTO2 = new AirportDTO("Mysore Airport", "Mysore", 1020, "India");
		AirportDTO airportDTO3 = new AirportDTO("Nava Mangalore Airport", "Manglore", 2000, "India");
		AirportDTO airportDTO4 = new AirportDTO("New Delhi Airport", "Delhi", 2500, "India");

		List<AirportDTO> airportDTOs = new ArrayList<AirportDTO>();
		airportDTOs.add(airportDTO);
		airportDTOs.add(airportDTO1);
		airportDTOs.add(airportDTO2);
		airportDTOs.add(airportDTO3);
		airportDTOs.add(airportDTO4);

		boolean cheacking = airportDTOs.contains(airportDTO4);
		System.out.println(cheacking);
		
		ListIterator<AirportDTO> ref=airportDTOs.listIterator();
		while (ref.hasNext()) {
			AirportDTO airportDTO5 = (AirportDTO) ref.next();
			System.out.println(airportDTO5);
		}
		
		
	
		
		

	}

}
