package com.xworkz.curd.repositary;

import com.xworkz.curd.dto.Ipldto;

public class IplRepoImp implements IpoRepo {

	private  Ipldto [] ipldtos = new Ipldto[10];
	private int index = 0;

	@Override
	public boolean create(Ipldto dto) {
		System.out.println("running iple implements repsitory" + dto);
		if(this.index>=this.ipldtos.length) {
			System.out.println("array size exceeded cannot add more ipl item");
			return false;
		}
		this.ipldtos[index]=dto;
		System.out.println("svaing ipl dto");
		index++;
		System.out.println("total elements is  :" +index);

		
		return false;
	}

}
