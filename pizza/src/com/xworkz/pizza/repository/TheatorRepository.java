package com.xworkz.pizza.repository;

import com.xworkz.pizza.dto.TheatorDto;
import com.xworkz.pizza.exeception.SizeExceedException;

public interface TheatorRepository {
	
	boolean save(TheatorDto dto)throws SizeExceedException;
	

}
