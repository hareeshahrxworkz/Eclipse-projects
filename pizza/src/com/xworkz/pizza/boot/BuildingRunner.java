package com.xworkz.pizza.boot;

import com.xworkz.pizza.dto.BuildingDTO;
import com.xworkz.pizza.exeception.DataInvalidException;
import com.xworkz.pizza.repository.BuildingRepository;
import com.xworkz.pizza.repository.BuildingRepositoryImpl;
import com.xworkz.pizza.services.BuildingService;
import com.xworkz.pizza.services.BuildingServiceImpl;

public class BuildingRunner {
	public static void main(String[] args) {

		System.out.println("Building Runner is Running ........");
		BuildingDTO buildingDTO = new BuildingDTO(101, "Manjunath Nivas", 2, true, true, "6BHK");
		BuildingDTO buildingDTO1 = new BuildingDTO(102, "Shanti Nivas", 5, true, true, "4BHK");
		BuildingDTO buildingDTO2 = new BuildingDTO(103, "MAnu Nivas", 3, true, true, "3BHK");
		BuildingDTO buildingDTO3 = new BuildingDTO(104, "Omkar Nivas", 6, true, true, "3BHK");
		BuildingDTO buildingDTO4 = new BuildingDTO(105, "Hareesha Nivas", 3, true, true, "1BHk");
		BuildingDTO buildingDTO5 = new BuildingDTO(106, "Ravi Nivas", 4, true, true, "2BHK");

		BuildingRepository buildingRepository = new BuildingRepositoryImpl();
		BuildingService buildingService = new BuildingServiceImpl(buildingRepository);
		try {
			boolean save=buildingService.validateAndsaving(buildingDTO);
			System.out.println(save);
			boolean save1=buildingService.validateAndsaving(buildingDTO1);
			System.out.println(save1);
			boolean save2=buildingService.validateAndsaving(buildingDTO2);
			System.out.println(save2);
			boolean save3=buildingService.validateAndsaving(buildingDTO3);
			System.out.println(save3);
			boolean save4=buildingService.validateAndsaving(buildingDTO4);
			System.out.println(save4);
			boolean save5=buildingService.validateAndsaving(buildingDTO5);
			System.out.println(save4);
		} catch (DataInvalidException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
