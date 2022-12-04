package com.xworkz.interfaces.boot;

import java.awt.geom.Area;

import com.xworkz.interfaces.followers.AirportManage;
import com.xworkz.interfaces.followers.AirportRule;

public class AirportRunner {

	public static void main(String[] args) {

		AirportRule airportRule=new AirportRule();
		AirportManage airportManage=new AirportManage(airportRule);
		airportManage.cheackingAirport();
	}

}
