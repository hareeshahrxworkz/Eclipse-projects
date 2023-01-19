package com.xworkz.soldgier.repositories;

import org.springframework.stereotype.Component;

import com.xworkz.soldgier.dto.SoldierDTO;
@Component
public class Soldgierepositoryimpl implements SoldgierRepository {

	@Override
	public boolean save(SoldierDTO dto) {

		System.out.println("Data Saving is running");

		return false;
	}

}
