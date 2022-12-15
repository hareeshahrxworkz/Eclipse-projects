package com.xworkz.pizza.repository;

import com.xworkz.pizza.dto.HelmetDTO;

public class HelmetRepositoryImp implements HelmateRepository {
	
	private HelmetDTO dtos[]=new HelmetDTO[20];	
	private int index=0;
	@Override
	public boolean createSaveData(HelmetDTO dto) {

		if(index>=dtos.length)
		{
			System.out.println("Array size exceed");
		}
		
		dtos[index]=dto;
		
		index++;
		
		return true;
	}

}
