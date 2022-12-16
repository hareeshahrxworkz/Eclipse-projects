package com.xworkz.pizza.services;

import com.xworkz.pizza.dto.RailwayStationDTO;
import com.xworkz.pizza.exeception.DataInvalidException;
import com.xworkz.pizza.repository.RailwayStationRepository;

public class RailwayStationServicesImpl implements RailwayStationServices {

	private RailwayStationRepository railwayStationRepository;

	public RailwayStationServicesImpl(RailwayStationRepository railwayStationRepository) {
		super();
		this.railwayStationRepository = railwayStationRepository;
	}

	@Override
	public boolean validateandsave(RailwayStationDTO dto) throws DataInvalidException {

		String name = dto.getName();
		String area = dto.getArea();
		int platform = dto.getNoOfPlatForm();
		Double ticket = dto.getPlatformTicketPrice();
		boolean nameValid = false;
		boolean areaValid = false;
		boolean ticketeValid = false;
		boolean platformValid = false;

		if (name != null && name.length() > 2 && name.length() <= 20) {
			System.out.println("Name Data is Valid ");
			nameValid = true;
		} else {
			System.out.println("Name Data is InValid Please Wait Exception is Comming Soon");
		}

		if (area != null && area.length() > 2 && area.length() <= 20) {
			System.out.println("area Data is Valid ");
			areaValid = true;
		} else {
			System.out.println("Area Data is InValid Please Wait Exception is Comming Soon");
		}
		if (platform >= 2 && platform <= 20) {
			System.out.println("Platform  Data is Valid ");
			platformValid = true;
		} else {
			System.out.println("Platform Data is InValid Please Wait Exception is Comming Soon");
		}
		if (ticket != null && ticket >= 20D && ticket <= 2000D) {
			System.out.println("Ticket Data is Valid ");
			ticketeValid = true;
		} else {
			System.out.println("ticket Data is InValid Please Wait Exception is Comming Soon");
		}
		if (platformValid && ticketeValid && nameValid && areaValid) {
			System.out.println("Data Validation is Susess next Saving Valid Data ");
			boolean save=railwayStationRepository.saveData(dto);
			System.out.println("Data Saved Sucessfully   :"+save);
			return save;

		}

		throw new DataInvalidException("Data Invalid Exception");
	}

}
