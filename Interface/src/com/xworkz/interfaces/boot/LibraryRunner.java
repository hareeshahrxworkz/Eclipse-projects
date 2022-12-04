package com.xworkz.interfaces.boot;

import com.xworkz.interfaces.followers.LibraryRules;
import com.xworkz.interfaces.followers.Libryrian;

public class LibraryRunner {
	public static void main(String[] args) {
		Libryrian libryrian=new Libryrian();
		LibraryRules libraryRules=new LibraryRules(libryrian);
		libraryRules.cheackLibraryan();
	}

}
