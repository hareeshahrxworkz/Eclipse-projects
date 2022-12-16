package com.xworkz.pizza.boot;

import com.xworkz.pizza.dto.PlaceDTO;
import com.xworkz.pizza.exeception.DataInvalidException;
import com.xworkz.pizza.repository.PlaceRepository;
import com.xworkz.pizza.repository.PlaceRepositoryImpl;
import com.xworkz.pizza.services.PlaceService;
import com.xworkz.pizza.services.PlaceServiceImpl;

public class PlaceDTORunner {
	public static void main(String[] args) {
		System.out.println("Place DTO Runner Running ");
		PlaceDTO dto = new PlaceDTO("Mysore", "Chamundi Hill", 250, "Cold", "Historical Place");
		PlaceDTO dto1 = new PlaceDTO("Nanjanagugu", "srikanteshwara", 280, "very Cold", "Historical Place");
		PlaceDTO dto2 = new PlaceDTO("Shivamogga", "Falls", 260, "Normal Cold", "Fallsa nature");
		PlaceDTO dto3 = new PlaceDTO("Hampi", "Hampi TEmple", 160, "warm", "Temple Place");
		PlaceDTO dto4 = new PlaceDTO("Badami", "Badamia temple", 600, "Normal Warm", "Temple Place");
		PlaceRepository placeRepository = new PlaceRepositoryImpl();
		PlaceService placeService=new PlaceServiceImpl(placeRepository);
		try {
			boolean save=placeService.validateAndSave(dto);
			System.out.println(save);
			boolean save1=placeService.validateAndSave(dto1);
			System.out.println(save1);
			boolean save2=placeService.validateAndSave(dto2);
			System.out.println(save2);
			boolean save3=placeService.validateAndSave(dto3);
			System.out.println(save3);
			boolean save4=placeService.validateAndSave(dto4);
			System.out.println(save4);
			
			
		} catch (DataInvalidException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
