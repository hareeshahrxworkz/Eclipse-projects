package com.xworkz.interfaces.followers;

import com.xworkz.interfaces.rules.Library;

public class Libryrian implements Library {

	@Override
	public boolean libraryRules() {
		System.out.println("Library Rules");
		return false;
	}

	@Override
	public int libraryreaders() {
		System.out.println("Library readers");
		return 50;
	}

}
