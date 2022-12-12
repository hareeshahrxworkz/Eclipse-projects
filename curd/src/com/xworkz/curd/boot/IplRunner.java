package com.xworkz.curd.boot;

import java.time.LocalDateTime;

import com.xworkz.curd.dto.Ipldto;
import com.xworkz.curd.repositary.IplRepoImp;
import com.xworkz.curd.repositary.IpoRepo;

public class IplRunner {

	public static void main(String[] args) {

		Ipldto ipldto=new Ipldto();
		ipldto.setCaptionName("Virat kohili");
		ipldto.setCreateDate(LocalDateTime.now());;
		ipldto.setCreatedBy("Omkar");
		ipldto.setDefeats(10);
		ipldto.setOnowerAlive(false);
		ipldto.setPurse(20);
		ipldto.setTeamName("RCB");
		ipldto.setUpdateBy("Banglore");
		ipldto.setUpdateDate(LocalDateTime.now());
		ipldto.setWins(107);



		
		IpoRepo ipoRepo=new IplRepoImp();
		ipoRepo.create(ipldto);
		
		
		
		
	}

}
