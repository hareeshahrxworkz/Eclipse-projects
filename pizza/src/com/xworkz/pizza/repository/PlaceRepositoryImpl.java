package com.xworkz.pizza.repository;

import com.xworkz.pizza.dto.PlaceDTO;
import com.xworkz.pizza.exeception.SizeExceedException;

public class PlaceRepositoryImpl implements PlaceRepository {

	private PlaceDTO dtos[]=new PlaceDTO[5]; 
	private int index=0;
	@Override
	public boolean save(PlaceDTO dto) throws SizeExceedException {
		if(this.index>=dtos.length)
		{
			System.out.println("building Size Is full it seems exception is comming now");
			throw new SizeExceedException("Building Size Exceed Exception");
		}
		this.dtos[this.index]=dto;
		this.index++;
		return true;
	}
	
}
