package com.xworkz.pizza.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.pizza.dto.AirportDTO;

public class AirportDTORunner {

	public static void main(String[] args) {
		System.out.println("Main AirportDTORunner sucessfull ");

		AirportDTO airportDTO = new AirportDTO("Kempegowda International Airport", "Banglore", 1000, "India");
		AirportDTO airportDTO1 = new AirportDTO("RaniChennamma Airport", "Hubli", 2000, "India");
		AirportDTO airportDTO2 = new AirportDTO("Mysore Airport", "Mysore", 1020, "India");
		AirportDTO airportDTO3 = new AirportDTO("Nava Mangalore Airport", "Manglore", 2000, "India");
		AirportDTO airportDTO4 = new AirportDTO("New Delhi Airport", "Delhi", 2500, "India");

		Collection<AirportDTO> airportDTOs = new ArrayList<AirportDTO>();
		airportDTOs.add(airportDTO);
		airportDTOs.add(airportDTO1);
		airportDTOs.add(airportDTO2);
		airportDTOs.add(airportDTO3);
		airportDTOs.add(airportDTO4);

		boolean cheacking = airportDTO.equals(airportDTO4);
		System.out.println(cheacking);

	}

}
