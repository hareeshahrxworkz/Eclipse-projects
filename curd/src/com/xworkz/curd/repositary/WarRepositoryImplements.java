package com.xworkz.curd.repositary;

import java.time.LocalDateTime;

import com.xworkz.curd.dto.WarDTO;
import com.xworkz.curd.exeception.NullPointerExceptions;
import com.xworkz.curd.exeception.SizeExeedException;

public class WarRepositoryImplements implements WarDTORepository {

	private WarDTO[] dtos = new WarDTO[10];
	private int index = 0;

	@Override
	public boolean create(WarDTO dto) {
		if (index >= this.dtos.length) {
			throw new SizeExeedException();
		}
		this.dtos[index] = dto;
		index++;

		return true;

	}

	@Override
	public boolean create(WarDTO[] dtos) {

		return true;
	}

	@Override
	public int total() {
		return index;
	}

	@Override
	public WarDTO findByStartedBy(String startedBy) {
		System.out.println(System.lineSeparator());

		System.out.println("Running FindByStarted By");
		for (WarDTO dto : dtos) {
			if (startedBy != null && dto.getStartedBy().equalsIgnoreCase(startedBy)) {
				System.out.println("cheacking sucessfully");
				System.out.println(dto);
				return dto;
			}
		}

		return null;
	}

	@Override
	public WarDTO findByStartedByAndStartedWith(String startedBy, String startedWith) {
		System.out.println(System.lineSeparator());

		System.out.println("Running findByStartedByAndStartedWith  ");
		for (WarDTO dto : dtos) {
			if (startedBy != null && startedWith != null && dto.getStartedBy().equalsIgnoreCase(startedBy)
					&& dto.getStartedWith().equalsIgnoreCase(startedWith)) {
				System.out.println("findByStartedByAndStartedWith Checking sucessfully");
				System.out.println(dto);
				return dto;
			} else {
				throw new NullPointerExceptions();

			}

		}

		return null;
	}

	@Override
	public WarDTO findStartGreaterThanequalTo(LocalDateTime date) {

		System.out.println(System.lineSeparator());
		System.out.println("Running findStartGreaterThanequalTo ");
		for (WarDTO dto : dtos) {
			if (date != null && dto.getStartDate().isAfter(date))// Checking Greaterthan
			{
				System.out.println("Cheacking sucessful Greter than equal to");
				System.out.println(dto);
				return dto;
			} else {
				System.err.println("Is not Checking Greter than equal to ");
				throw new NullPointerExceptions();
			}
		}

		return null;
	}

	@Override
	public WarDTO findStartLesserThanequalTo(LocalDateTime date) {
		System.out.println(System.lineSeparator());
		System.out.println("Running findStartLesserThanequalTo ");
		for (WarDTO dto : dtos) {
			if (date != null && dto.getStartDate().isBefore(date))// Checking Lesserthan
			{
				System.out.println("Cheacking find  Start  Lesser  Thanequal  To ");
				System.out.println(dto);
				return dto;
			} else {
				throw new NullPointerExceptions();

			}
		}
		return null;
	}

	@Override
	public WarDTO findByStartDateAndEndDate(LocalDateTime start, LocalDateTime end)// Comparing
	{
		System.out.println(System.lineSeparator());
		System.out.println("Running findByStartDateAndEndDate ");

		for (WarDTO dto : dtos) {
			if (start != null && end != null && dto.getStartedBy().equals(start) && dto.getStartedBy().equals(end)) {
				System.out.println("Cheaking Sucessfull find By Start Date And End Date ");
				System.out.println(dto);
				return dto;
			}
		}
		return null;
	}

}
