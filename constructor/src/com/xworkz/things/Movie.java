package com.xworkz.things;

public class Movie {
	
	static String MovieName="ramachari";
	public String heroName;
	public String DirectorName;
	public String villen;
	public boolean animation;
	public Integer budject;
	
	public String [] Scene;
	public String [] comedyens;
	public String [] runninglocation;
	
public Movie(String heroName,String DirectorName,String villen, String [] Scene, boolean animation, String [] comedyens,Integer budject,String [] runninglocation) {

	
this.heroName=heroName;
this.DirectorName=DirectorName;
this.villen=villen;
this.animation=animation;
this.budject=budject;
this.Scene=Scene;
this.comedyens=comedyens;
this.runninglocation=runninglocation;


}

public void display()
{
	System.out.println(System.lineSeparator());
System.out.println("Printing naditha ede movie du");	
System.out.println(MovieName);
System.out.println(this.heroName);
System.out.println(this.DirectorName);
System.out.println(this.villen);
System.out.println(this.animation);
System.out.println(this.budject);

System.out.println(System.lineSeparator());
System.out.println("Scene Printing naditha ede ");	

for (int i = 0; i < Scene.length; i++) {
	System.out.println(Scene[i]);
	
}

System.out.println(System.lineSeparator());
System.out.println("runninglocation Printing naditha ede ");	

for (int i = 0; i < runninglocation.length; i++) {
	System.out.println(runninglocation[i]);
	
}
System.out.println(System.lineSeparator());
System.out.println("comedyens Printing naditha ede ");	

for (int i = 0; i < comedyens.length; i++) {
	System.out.println(comedyens[i]);
	
}



}
}
