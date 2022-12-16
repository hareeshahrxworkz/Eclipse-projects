package com.xworkz.pizza.repository;

import com.xworkz.pizza.dto.RailwayStationDTO;
import com.xworkz.pizza.exeception.SizeExceedException;

public interface RailwayStationRepository {
	boolean saveData(RailwayStationDTO dto)throws SizeExceedException;

}
