package com.xworkz.pizza.boot;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.xworkz.pizza.dto.MovieDTO;

public class MovieDTORunner {

	public static void main(String[] args) {

		System.out.println("Main Running start");

		MovieDTO dto = new MovieDTO("Bahaddur", 200, 120D, "Banglore");
		MovieDTO dto1 = new MovieDTO("Gaja", 250, 170D, "Chitradurga");
		MovieDTO dto2 = new MovieDTO("O nanna Nalle", 70, 120D, "Mysore");
		MovieDTO dto3 = new MovieDTO("Dasharatha", 100, 95, "Kolar");
		MovieDTO dto4 = new MovieDTO("Dandu Palya", 260, 100, "Tumakur");
		MovieDTO dto5 = new MovieDTO("Chakravarthi", 350, 250, "Nelamangala");

		List<MovieDTO> streams = Stream.of(dto, dto1, dto2, dto3, dto4, dto5).collect(Collectors.toList());
		streams.stream().forEach(e->System.out.println(e));

		System.out.println(System.lineSeparator());

		Collections.sort(streams);
		streams.forEach(ele -> System.out.println(ele));
		
		
		System.out.println(System.lineSeparator());

		streams.stream().sorted((a1,a2)->Integer.compare(a2.getVisitors(), a1.getVisitors())).forEach(e->System.out.println(e));
		


	}

}
