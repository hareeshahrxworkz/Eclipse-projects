package com.xworkz.soldgier.repositories;

import com.xworkz.soldgier.dto.SoldierDTO;

public class Soldgierrepositoryimpl implements SoldgierRepository {

	@Override
	public boolean save(SoldierDTO dto) {

		System.out.println("Data Saving is running");

		return false;
	}

}
