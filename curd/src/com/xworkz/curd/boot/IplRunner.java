package com.xworkz.curd.boot;

import java.time.LocalDateTime;

import com.xworkz.curd.dto.Ipldto;
import com.xworkz.curd.repositary.IplRepoImp;
import com.xworkz.curd.repositary.IpoRepo;

public class IplRunner {

	public static void main(String[] args) {

		Ipldto ipldto = new Ipldto();
		ipldto.setCaptionName("Virat kohili");
		ipldto.setCreateDate(LocalDateTime.now());
		
		ipldto.setCreatedBy("Omkar");
		ipldto.setDefeats(10);
		ipldto.setOnowerAlive(false);
		ipldto.setPurse(20);
		ipldto.setTeamName("RCB");
		ipldto.setUpdateBy("Banglore");
		ipldto.setUpdateDate(LocalDateTime.now());
		ipldto.setWins(107);

		Ipldto ipldto1 = new Ipldto();

		ipldto1.setCaptionName("MS dhoni");
		ipldto1.setCreateDate(LocalDateTime.now());
		ipldto1.setCreatedBy("Hareesha");
		ipldto1.setDefeats(10);
		ipldto1.setOnowerAlive(true);
		ipldto1.setPurse(30);
		ipldto1.setTeamName("RR");
		ipldto1.setUpdateBy("Banglore");
		ipldto1.setUpdateDate(LocalDateTime.now());
		ipldto1.setWins(120);

		Ipldto ipldto2 = new Ipldto();

		ipldto2.setCaptionName("Arjun");
		ipldto2.setCreateDate(LocalDateTime.now());
		ipldto2.setCreatedBy("RAvi");
		ipldto2.setDefeats(10);
		ipldto2.setOnowerAlive(true);
		ipldto2.setPurse(20);
		ipldto2.setTeamName("KKR");
		ipldto2.setUpdateBy("Chanai");
		ipldto2.setUpdateDate(LocalDateTime.now());
		ipldto2.setWins(118);

		Ipldto ipldto3 = new Ipldto();
		ipldto3.setCaptionName("Sachin");
		ipldto3.setCreateDate(LocalDateTime.now());
		ipldto3.setCreatedBy("Manu");
		ipldto3.setDefeats(10);
		ipldto3.setOnowerAlive(false);
		ipldto3.setPurse(20);
		ipldto3.setTeamName("CSK");
		ipldto3.setUpdateBy("Banglore");
		ipldto3.setUpdateDate(LocalDateTime.now());
		ipldto3.setWins(98);
		Ipldto ipldto4 = new Ipldto();

		ipldto4.setCaptionName("Mangolian");
		ipldto4.setCreateDate(LocalDateTime.now());
		
		ipldto4.setCreatedBy("Fazalm");
		ipldto4.setDefeats(15);
		ipldto4.setOnowerAlive(false);
		ipldto4.setPurse(20);
		ipldto4.setTeamName("RR");
		ipldto4.setUpdateBy("Banglore");
		ipldto4.setUpdateDate(LocalDateTime.now());
		ipldto4.setWins(18);


		IpoRepo ipoRepo = new IplRepoImp();
		ipoRepo.create(ipldto);

		ipoRepo.create(ipldto1);

		ipoRepo.create(ipldto2);

		ipoRepo.create(ipldto3);

		ipoRepo.create(ipldto4);
		System.out.println(ipoRepo.total());

	}

}
