package com.xworkz.curd.boot;

import java.time.LocalDateTime;

import com.xworkz.curd.dto.AbstractIpldto;
import com.xworkz.curd.dto.WarDTO;
import com.xworkz.curd.repositary.WarDTORepository;
import com.xworkz.curd.repositary.WarRepositoryImplements;

public class WarDTORunner {

	public static void main(String[] args) {
		WarDTO dto = new WarDTO();

		dto.setEndDate(LocalDateTime.of(2022, 02, 21, 10, 20));
		dto.setName("omkar");
		dto.setNoOfDeths(20);
		dto.setOwnBy("chanai");
		dto.setStartDate(LocalDateTime.of(2022, 10, 19, 10, 25));
		dto.setStartedBy("Banglore");
		dto.setStartedWith("mumbai");
		System.out.println(dto.toString());

		WarDTO dto1 = new WarDTO();

		dto1.setEndDate(LocalDateTime.of(2022, 03, 30, 11, 28));
		dto1.setName("RaviTeja");
		dto1.setNoOfDeths(10);
		dto1.setOwnBy("Rajastan");
		dto1.setStartDate(LocalDateTime.of(2022, 11, 18, 11, 25));
		dto1.setStartedBy("Banglore");
		dto1.setStartedWith("Chanai");
		System.out.println(dto1.toString());

		WarDTO dto2 = new WarDTO();

		dto2.setEndDate(LocalDateTime.of(2022, 01, 26, 18, 18));
		dto2.setName("Hareesha");
		dto2.setNoOfDeths(18);
		dto2.setOwnBy("Mumbai");
		dto2.setStartDate(LocalDateTime.of(2022, 10, 12, 9, 25));
		dto2.setStartedBy("Pakistan");
		dto2.setStartedWith("Russia");
		System.out.println(dto2.toString());


		WarDTO dto3 = new WarDTO();

		dto3.setEndDate(LocalDateTime.of(2022, 02, 21, 10, 20));
		dto3.setName("Uday");
		dto3.setNoOfDeths(20);
		dto3.setOwnBy("Kolkatta");
		dto3.setStartDate(LocalDateTime.of(2022, 10, 19, 10, 25));
		dto3.setStartedBy("RCB");
		dto3.setStartedWith("CKS");
		System.out.println(dto3.toString());


		WarDTO dto4 = new WarDTO();

		dto4.setEndDate(LocalDateTime.of(2022, 9, 12, 11, 18));
		dto4.setName("Gagan");
		dto4.setNoOfDeths(20);
		dto4.setOwnBy("Mumbai");
		dto4.setStartDate(LocalDateTime.of(2022, 02, 15, 11, 15));
		dto4.setStartedBy("RR");
		dto4.setStartedWith("MI");
		System.out.println(dto4.toString());

		WarDTO dto5 = new WarDTO();

		dto5.setEndDate(LocalDateTime.of(2022, 02, 21, 10, 20));
		dto5.setName("Sanddep");
		dto5.setNoOfDeths(11);
		dto5.setOwnBy("Banglore");
		dto5.setStartDate(LocalDateTime.of(2022, 10, 19, 10, 25));
		dto5.setStartedBy("MI");
		dto5.setStartedWith("NDI");
		System.out.println(dto5.toString());


		WarDTO dto6 = new WarDTO();

		dto6.setEndDate(LocalDateTime.of(2022, 02, 21, 10, 20));
		dto6.setName("Vishnu");
		dto6.setNoOfDeths(50);
		dto6.setOwnBy("MumbaiIndians");
		dto6.setStartDate(LocalDateTime.of(2022, 10, 19, 10, 25));
		dto6.setStartedBy("Delhi");
		dto6.setStartedWith("RR");
		System.out.println(dto6.toString());

		WarDTO dto7 = new WarDTO();

		dto7.setEndDate(LocalDateTime.now());
		dto7.setName("Naveen");
		dto7.setNoOfDeths(20);
		dto7.setOwnBy("India");
		dto7.setStartDate(LocalDateTime.of(2022, 10, 19, 10, 25));
		dto7.setStartedBy("Pakistan");
		dto7.setStartedWith("India");
		System.out.println(dto7.toString());


		WarDTO dto8 = new WarDTO();

		dto8.setEndDate(LocalDateTime.of(2022, 02, 21, 10, 20));
		dto8.setName("Srinivas");
		dto8.setNoOfDeths(07);
		dto8.setOwnBy("INdia");
		dto8.setStartDate(LocalDateTime.of(2022, 10, 19, 10, 25));
		dto8.setStartedBy("China");
		dto8.setStartedWith("Amerika");
		System.out.println(dto8.toString());


		WarDTO dto9 = new WarDTO();

		dto9.setEndDate(LocalDateTime.of(2022, 02, 21, 10, 20));
		dto9.setName("Pramod");
		dto9.setNoOfDeths(100);
		dto9.setOwnBy("China");
		dto9.setStartDate(LocalDateTime.of(2022, 10, 19, 10, 25));
		dto9.setStartedBy("Srilanka");
		dto9.setStartedWith("Japan");
		System.out.println(dto9.toString());


		WarDTO dto10 = new WarDTO();

		dto10.setEndDate(LocalDateTime.of(2022, 02, 21, 10, 20));
		dto10.setName("Praju");
		dto10.setNoOfDeths(120);
		dto10.setOwnBy("Amerika");
		dto10.setStartDate(LocalDateTime.of(2022, 10, 19, 10, 25));
		dto10.setStartedBy("Japan");
		dto10.setStartedWith("Cenada");
		System.out.println(dto10.toString());


		WarDTORepository dtoRepository = new WarRepositoryImplements();
		dtoRepository.create(dto);
		dtoRepository.create(dto1);
		dtoRepository.create(dto2);
		dtoRepository.create(dto3);
		dtoRepository.create(dto4);
		dtoRepository.create(dto5);
		dtoRepository.create(dto6);
		dtoRepository.create(dto7);
		dtoRepository.create(dto8);
		dtoRepository.create(dto9);
//		dtoRepository.create(dto10);
		System.out.println(System.lineSeparator());
		System.out.println(dtoRepository.total());
		
		
		dtoRepository.findByStartedBy("Banglore");
		dtoRepository.findByStartedByAndStartedWith("Banglore", "Mumbai");
		dtoRepository.findStartGreaterThanequalTo(LocalDateTime.of(2022, 10, 18, 10, 25));
		dtoRepository.findStartLesserThanequalTo(LocalDateTime.of(2022, 10, 20, 10, 25));
		dtoRepository.findByStartDateAndEndDate(LocalDateTime.of(2022, 10, 19, 10, 25),
				LocalDateTime.of(2022, 02, 21, 10, 20));

	}

}
