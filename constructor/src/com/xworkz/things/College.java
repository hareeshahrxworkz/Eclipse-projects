package com.xworkz.things;

public class College {

	static String univercityName="VTU";
	public String collegeLocation;
	public int noOfColleges;
	public int noOfBranchas;
	public String collegePrinciple;
	
	public String [] branchas;
	public String [] collegeNames;
	public String [] places;
	
	public College( String collegeLocation,int noOfColleges,String [] branchas,int noOfBranchas ,String [] places,String collegePrinciple,String [] collegeNames) {
this.collegeLocation=collegeLocation;
this.noOfColleges=noOfColleges;
this.noOfBranchas=noOfBranchas;
this.collegePrinciple=collegePrinciple;
this.branchas=branchas;
this.collegeNames=collegeNames;
this.places=places;

	
	}	
	public void Display()
	{
		System.out.println("Printing naditha Ede");
		
		System.out.println(univercityName);
		System.out.println(this.collegeLocation);
		System.out.println( this.noOfColleges);
		System.out.println(  this.noOfBranchas);
		System.out.println( this.collegePrinciple);
		
		System.out.println(System.lineSeparator());
		System.out.println("Branch Printing naditha Ede");
		
		for (int i = 0; i < branchas.length; i++) {
			
			System.out.println(this.branchas[i]);
			
		}
		System.out.println(System.lineSeparator());
		System.out.println("collegeNames Printing naditha Ede");
		
		for (int i = 0; i < collegeNames.length; i++) {
			
			System.out.println(this.collegeNames[i]);
			
		}
			System.out.println(System.lineSeparator());
			System.out.println("Printing naditha Ede");
			
			for (int i = 0; i < places.length; i++) {
				
				System.out.println(this.places[i]);
				
			
		

			}

}
	
	
	
	
}
