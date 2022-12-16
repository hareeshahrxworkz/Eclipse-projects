package com.xworkz.pizza.services;

import com.xworkz.pizza.dto.BuildingDTO;
import com.xworkz.pizza.exeception.DataInvalidException;

public interface BuildingService {
	
	boolean validateAndsaving(BuildingDTO dto)throws DataInvalidException;

}
