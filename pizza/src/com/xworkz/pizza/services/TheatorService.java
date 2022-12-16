package com.xworkz.pizza.services;

import com.xworkz.pizza.dto.TheatorDto;
import com.xworkz.pizza.exeception.DataInvalidException;

public interface TheatorService {

	boolean validateAndSaveData(TheatorDto dto) throws DataInvalidException;
	
}
