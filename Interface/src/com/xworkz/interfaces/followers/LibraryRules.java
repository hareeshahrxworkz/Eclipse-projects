package com.xworkz.interfaces.followers;

public class LibraryRules {
	Libryrian libryrian;

	public LibraryRules(Libryrian libryrian) {
		super();
		this.libryrian = libryrian;
	}
	
	public void cheackLibraryan()
	{
		if(libryrian!=null)
		{
			System.err.println("Libraryan ching null sucessfully");
			int reader=libryrian.libraryreaders();
			boolean rule=libryrian.libraryRules();
			if(reader>10&& rule==false)
			{
				System.out.println("Following rules Library");
			}
			else
			{
				System.out.println("is not Following rules Library");

			}
		}
	}

}
