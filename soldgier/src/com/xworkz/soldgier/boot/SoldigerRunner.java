package com.xworkz.soldgier.boot;

import com.xworkz.soldgier.dto.SoldierDTO;
import com.xworkz.soldgier.repositories.SoldgierRepository;
import com.xworkz.soldgier.repositories.Soldgierrepositoryimpl;
import com.xworkz.soldgier.services.SoldgierServices;
import com.xworkz.soldgier.services.SoldgierServicesimpl;

public class SoldigerRunner {

	public static void main(String[] args) {

		SoldierDTO dto = new SoldierDTO("Chitra", 21, "India", "topper", "datalion", true);
		SoldgierRepository repository = new Soldgierrepositoryimpl();
		SoldgierServicesimpl services = new SoldgierServicesimpl();
		services.setRepository(repository);
		services.validateAndSave(dto);

	}

}
