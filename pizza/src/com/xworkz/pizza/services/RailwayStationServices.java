package com.xworkz.pizza.services;

import com.xworkz.pizza.dto.RailwayStationDTO;
import com.xworkz.pizza.exeception.DataInvalidException;

public interface RailwayStationServices {
	
	boolean validateandsave(RailwayStationDTO dto) throws DataInvalidException;

}
