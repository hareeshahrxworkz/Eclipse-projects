package com.xworkz.pizza.repository;

import com.xworkz.pizza.dto.TheatorDto;
import com.xworkz.pizza.exeception.SizeExceedException;

public class TheatorRepositoryImpl implements TheatorRepository{
	
	private TheatorDto dtos[]=new TheatorDto[5];
	private int index=0;
	
@Override
public boolean save(TheatorDto dto) throws SizeExceedException {

	if (this.index>=this.dtos.length) {
		System.out.println("size is full next you will get Exception Please Wait ");
		throw new SizeExceedException("Size is full Dosent Store more dto Please Contact Developer");
		
	}
	this.dtos[this.index]=dto;
	this.index++;
	
	
	return true;
}
}
