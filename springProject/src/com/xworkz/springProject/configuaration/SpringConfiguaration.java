package com.xworkz.springProject.configuaration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration("springConfiguaration")
@ComponentScan("com.xworkz.springProject")

public class SpringConfiguaration {
	@Bean
	public String getTempleName() {
		return "Temple Runner";

	}

	@Bean
	public String getGodName() {
		return "Shiva ";
	}

	@Bean

	public String getFrindName() {
		return "Omkar";

	}

	@Bean
	public String getThing() {
		return "Chair";
	}

	@Bean
	public String getPlace() {
		return "Hosadurga";
	}

	@Bean
	public boolean isDrinkHalkoHal() {
		return true;

	}

	@Bean
	public boolean isMale() {
		return true;
	}

	@Bean
	public boolean isFestival() {
		return false;

	}

	public boolean isCommit() {
		return false;

	}

	@Bean
	public boolean isXworkz()

	{
		return true;
	}

	@Bean
	public double getprice() {
		return 20.0;
	}

	@Bean
	public double getSize() {
		return 6.5;
	}

	@Bean
	public double getlength() {
		return 5.6;

	}

	@Bean
	public double getWidth() {
		return 890.2;
	}

	@Bean
	public double gethight() {
		return 8.32;
	}

	@Bean
	public StringBuffer getString() {
		StringBuffer buffer = new StringBuffer("Raviteja");
		return buffer;
	}

	@Bean
	public StringBuffer getNative() {
		StringBuffer buffer = new StringBuffer("Hareesha");
		return buffer;
	}

	@Bean
	public StringBuffer getChange() {
		StringBuffer buffer = new StringBuffer("Omkar Dvelopment Center");
		return buffer;
	}

	@Bean
	public StringBuffer getTemples() {
		StringBuffer buffer = new StringBuffer("Shiva Temple");
		return buffer;
	}

	@Bean
	public StringBuffer getApplications() {
		StringBuffer buffer = new StringBuffer("Enterprise Application");
		return buffer;
	}

	@Bean
	public StringBuilder getbuild() {
		StringBuilder builder = new StringBuilder("Kaveri");

		return builder;
	}

	@Bean
	public StringBuilder getBodyName() {
		StringBuilder builder = new StringBuilder("BUS");

		return builder;
	}

	@Bean
	public StringBuilder getWines() {
		StringBuilder builder = new StringBuilder("old munk");

		return builder;
	}

	@Bean
	public StringBuilder getFory() {
		StringBuilder builder = new StringBuilder("Chitradurga");

		return builder;
	}

	@Bean
	public StringBuilder getPgs() {
		StringBuilder builder = new StringBuilder("Destiny");

		return builder;
	}

	@Bean
	public ArrayList getArrayOfNames() {
		List<String> arrayList = Stream.of("Lakshmana", "govinda").collect(Collectors.toList());
		return (ArrayList) arrayList;
	}

	@Bean
	public ArrayList getPrices() {
		List<String> arrayList = Stream.of("Lakshmana", "govinda", "Mala", "manu", "manoja")
				.collect(Collectors.toList());
		return (ArrayList) arrayList;
	}

	@Bean
	public ArrayList getWeights() {
		List<Double> arrayList = Stream.of(10.2, 10.25, 20.5, 63.25, 45.2, 100.1).collect(Collectors.toList());
		return (ArrayList) arrayList;
	}

	@Bean
	public ArrayList getKilometers() {
		List<Double> arrayList = Stream.of(1000.2, 30521.1, 5640.1, 3564.1, 3265.1, 2546.0)
				.collect(Collectors.toList());
		return (ArrayList) arrayList;
	}

	@Bean
	public ArrayList isWisky() {
		List<Boolean> arrayList = Stream.of(true, false, false, true).collect(Collectors.toList());
		return (ArrayList) arrayList;
	}

	@Bean
	public Map getMapEntrys() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Banglore", 577542);
		map.put("Chitradurga", 577527);
		map.put("Holalkere", 571313);
		map.put("Hosadurga", 577527);
		map.put("Mysore", 575001);
		return map;

	}

}
