package com.xworkz.things.boot;

import com.xworkz.things.College;

public class CollegeRunner {

	public static void main(String[] args) {
		 String [] branchas={"CSE","ECS","ME","Civi","Automobile"};
		 String [] collegeNames= {"GEC Chamarajanagar","GEC Hassan","GEC KUshalNAgar"};
		 String [] places= {"chamarajanagara","hassan","mandya","davanagere"};
		
		 College college= new College("Davanagere", 2, branchas, 4, places, "Venkatesh", collegeNames);
		 
		 college.Display();
	}
	

}
