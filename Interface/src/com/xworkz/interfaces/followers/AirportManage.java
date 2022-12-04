package com.xworkz.interfaces.followers;

public class AirportManage {
	
	AirportRule airportRule;
	
	
	public AirportManage(AirportRule airportRule) {
		this.airportRule=airportRule;
	}
	
	public void cheackingAirport()
	{
		if(airportRule!=null)
		{
			System.out.println("Airport Checking sucessfully");
			boolean airport=airportRule.airportRules();
			int passanger=airportRule.passangers();
			if (airport==false && passanger>10) {
				System.out.println("Following airport rules");
			}
			else {
				System.out.println("Not Following airport rules");

			}
		}
	}

}
