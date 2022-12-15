package com.xworkz.pizza.boot;

import com.xworkz.pizza.dto.Color;
import com.xworkz.pizza.dto.HelmateType;
import com.xworkz.pizza.dto.HelmetDTO;
import com.xworkz.pizza.repository.HelmateRepository;
import com.xworkz.pizza.repository.HelmetRepositoryImp;
import com.xworkz.pizza.services.HelmetService;
import com.xworkz.pizza.services.HelmetServiceImp;

public class HelmetRunner {

	public static void main(String[] args) {

		HelmetDTO dto = new HelmetDTO("Hero", 1000D, Color.BLACK, HelmateType.HALF);
		HelmateRepository helmateRepository=new HelmetRepositoryImp();
		HelmetService helmetService = new HelmetServiceImp(helmateRepository);
		boolean saved=helmetService.validateAndSave(dto);
		System.out.println(saved);

	}

}
