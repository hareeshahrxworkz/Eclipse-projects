package com.xworkz.curd.repositary;

import com.xworkz.curd.dto.Ipldto;

public interface IpoRepo {
	boolean create(Ipldto dto);
	default int total()
	{
		return 0;
	}
	

}
