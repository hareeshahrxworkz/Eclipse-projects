package com.xworkz.pizza.services;

import com.xworkz.pizza.dto.BekaryDTO;
import com.xworkz.pizza.exeception.DataInvalidException;

public interface BekarySerivice {
	
	boolean validAndStore(BekaryDTO  dto)throws DataInvalidException;

}
