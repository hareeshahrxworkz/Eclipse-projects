package com.xworkz.interfaces.followers;

import com.xworkz.interfaces.rules.DevelopmentInstitute;
import com.xworkz.interfaces.rules.TestingInstitute;
import com.xworkz.interfaces.rules.TrafficRules;

public class XworksRajajinagar implements DevelopmentInstitute, TestingInstitute ,TrafficRules{

	@Override
	public void trining() {
		System.out.println("running  instute trining");
	}

	@Override
	public void placement() {
		System.out.println("running  instute placement");

	}

	@Override
	public void interviews() {
		System.out.println("running  Interviews");

	}

	@Override
	public void WearHelmet() {
		System.out.println("running  Wear Helmet");
		
	}

	@Override
	public void TripleRiding() {
		System.out.println("running  Triple Riding");
		
	}

}
