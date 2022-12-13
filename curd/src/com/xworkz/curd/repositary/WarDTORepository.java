package com.xworkz.curd.repositary;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.xworkz.curd.dto.WarDTO;

public interface WarDTORepository {
	boolean create(WarDTO dto);

	boolean create(WarDTO[] dtos);

	WarDTO findByStartedBy(String startedBy);

	WarDTO findByStartedByAndStartedWith(String startedBy, String startedWith);

	WarDTO findStartGreaterThanequalTo(LocalDateTime date);

	WarDTO findStartLesserThanequalTo(LocalDateTime date);

	WarDTO findByStartDateAndEndDate(LocalDateTime start, LocalDateTime end);

	default int total() {
		return 0;
	}

}
