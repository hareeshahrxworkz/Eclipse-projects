package com.xworkz.pizza.repository;


import com.xworkz.pizza.dto.BuildingDTO;
import com.xworkz.pizza.exeception.SizeExceedException;

public interface BuildingRepository {
	
	boolean saveData(BuildingDTO dto)throws SizeExceedException;

}
