package com.xworkz.pizza.repository;

import com.xworkz.pizza.dto.BuildingDTO;
import com.xworkz.pizza.exeception.SizeExceedException;
public class BuildingRepositoryImpl  implements BuildingRepository{
	
	private BuildingDTO dtos []=new BuildingDTO[5];
	private int index=0;
	@Override
	public boolean saveData(BuildingDTO dto) throws SizeExceedException {
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
