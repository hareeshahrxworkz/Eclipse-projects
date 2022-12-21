package com.xworkz.interfaces.followers;

import com.xworkz.interfaces.rules.HospitalManagement;

public class Doctor  implements HospitalManagement{

	@Override
	public Integer entryPrice() {
		
		
		return 7;
	}

	@Override
	public boolean followingRules() {
		
		
		return false;
	}
	
	
	

}
