package com.xworkz.pizza.boot;

import com.xworkz.pizza.dto.RailwayStationDTO;
import com.xworkz.pizza.exeception.DataInvalidException;
import com.xworkz.pizza.repository.RailwayStationRepository;
import com.xworkz.pizza.repository.RailwayStationRepositoryImpl;
import com.xworkz.pizza.services.RailwayStationServices;
import com.xworkz.pizza.services.RailwayStationServicesImpl;

public class RailwayStationRunner {

	public static void main(String[] args) {

		System.out.println("Railway Station Running ");
		RailwayStationDTO dto = new RailwayStationDTO("Yashavanthapura", 20, "Banglore", 150D);
		RailwayStationDTO dto1 = new RailwayStationDTO("Hassan", 5, "Hassan", 120D);
		RailwayStationDTO dto2 = new RailwayStationDTO("Tumakur", 3, "Tumakur", 100D);
		RailwayStationDTO dto3 = new RailwayStationDTO("Hubli", 15, "Hubli", 1000D);
		RailwayStationDTO dto4 = new RailwayStationDTO("Arasikere", 12, "Arasikere", 500D);
//		RailwayStationDTO dto5 = new RailwayStationDTO("Shivamogga", 6, "shivamogga", 750D);

		RailwayStationRepository railwayStationRepository = new RailwayStationRepositoryImpl();
		RailwayStationServices railwayStationServices = new RailwayStationServicesImpl(railwayStationRepository);

		try {
			boolean store = railwayStationServices.validateandsave(dto);
			System.out.println(store);
			boolean store1 = railwayStationServices.validateandsave(dto1);
			System.out.println(store1);

			boolean store2 = railwayStationServices.validateandsave(dto2);
			System.out.println(store2);

			boolean store3 = railwayStationServices.validateandsave(dto3);
			System.out.println(store3);

			boolean store4 = railwayStationServices.validateandsave(dto4);
			System.out.println(store4);


//			boolean store5 = railwayStationServices.validateandsave(dto5);
//			System.out.println(store5);

		} catch (DataInvalidException e) {
			System.err.println(e.getMessage());
		}
	}

}
