package com.xworkz.pizza.boot;

import com.xworkz.pizza.dto.TheatorDto;
import com.xworkz.pizza.exeception.DataInvalidException;
import com.xworkz.pizza.repository.TheatorRepository;
import com.xworkz.pizza.repository.TheatorRepositoryImpl;
import com.xworkz.pizza.services.TheatorService;
import com.xworkz.pizza.services.TheatorServiceImpl;

public class TheatorRunner {

	public static void main(String[] args) {

		System.out.println("Theator runner Running Sucessfully");

		TheatorDto dto = new TheatorDto("Navarang", 101, "HighQuality", 500);
		TheatorDto dto1 = new TheatorDto("Navarang", 102, "MIddle ", 200);
		TheatorDto dto2 = new TheatorDto("Navarang", 103, "Low", 100);
		TheatorDto dto3 = new TheatorDto("Navarang", 104, "VeryPoor", 160);
		TheatorDto dto4 = new TheatorDto("Navarang", 105, "VeryHigh", 300);
		TheatorRepository repository = new TheatorRepositoryImpl();
		TheatorService service = new TheatorServiceImpl(repository);
		try {
			boolean save = service.validateAndSaveData(dto);
			System.out.println(save);
			boolean save1 = service.validateAndSaveData(dto1);
			System.out.println(save1);

			boolean save2 = service.validateAndSaveData(dto2);
			System.out.println(save2);

			boolean save3 = service.validateAndSaveData(dto3);
			System.out.println(save3);

			boolean save4 = service.validateAndSaveData(dto4);
			System.out.println(save4);

		} catch (DataInvalidException e) {
			System.err.println(e.getMessage());
		}

	}

}
