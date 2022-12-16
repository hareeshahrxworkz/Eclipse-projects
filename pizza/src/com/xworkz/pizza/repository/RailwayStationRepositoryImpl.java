package com.xworkz.pizza.repository;

import com.xworkz.pizza.dto.RailwayStationDTO;
import com.xworkz.pizza.exeception.SizeExceedException;

public class RailwayStationRepositoryImpl implements RailwayStationRepository {

	private RailwayStationDTO dtos[] = new RailwayStationDTO[5];

	private int index = 0;

	@Override
	public boolean saveData(RailwayStationDTO dto) throws SizeExceedException {
		System.out.println("running Savind Data");
		if (this.index >= this.dtos.length) {
			System.out.println("Size Index is full is comming Exception please contace Develper");
			throw new SizeExceedException("Size Exceed Exception OverFlow of Dtos Size");

		}
		this.dtos[this.index] = dto;
		this.index++;
		return true;
	}

}
