package com.xworkz.pizza.repository;

import com.xworkz.pizza.dto.BekaryDTO;
import com.xworkz.pizza.exeception.SizeExceedException;

public class BekaryRepositoryImp implements BekaryRepository {

	private BekaryDTO dtos[] = new BekaryDTO[5];
	private int index = 0;

	@Override
	public boolean store(BekaryDTO dto) throws SizeExceedException{
		if (index >= dtos.length) {
			System.out.println("Dtos size cheaking size is full you are not store ");
			throw new SizeExceedException("Bekary size is exceeded do you want to continue........ ");
		}

		this.dtos[this.index] = dto;
		this.index++;

		return true;
	}

}
