package com.xworkz.pizza.services;

import com.xworkz.pizza.dto.PlaceDTO;
import com.xworkz.pizza.exeception.DataInvalidException;

public interface PlaceService {
	
	boolean validateAndSave(PlaceDTO dto)throws DataInvalidException;

}
