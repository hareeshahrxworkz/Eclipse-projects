package com.xworkz.pizza.repository;

import com.xworkz.pizza.dto.BekaryDTO;
import com.xworkz.pizza.exeception.SizeExceedException;

public interface BekaryRepository {
	boolean store(BekaryDTO dto) throws SizeExceedException;

}
