package com.xworkz.pizza.repository;

import com.xworkz.pizza.dto.PlaceDTO;
import com.xworkz.pizza.exeception.SizeExceedException;

public interface PlaceRepository {

	
	boolean save(PlaceDTO dto)throws SizeExceedException;

}
