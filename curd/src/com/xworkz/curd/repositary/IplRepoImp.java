package com.xworkz.curd.repositary;

import com.xworkz.curd.dto.Ipldto;
import com.xworkz.curd.exeception.SizeExeedException;

public class IplRepoImp implements IpoRepo {

	private Ipldto[] ipldtos = new Ipldto[6];
	private int index = 0;

	@Override
	public boolean create(Ipldto dto) {
		System.out.println("running iple implements repsitory" + dto);
		if (this.index >= this.ipldtos.length) {
			throw new SizeExeedException();
		}
		this.ipldtos[index] = dto;
		System.out.println("svaing ipl dto");
		index++;
//		System.out.println("total elements is  :" + index);

		return true;
	}

	@Override

	public int total() {
		return index;
	}

}
