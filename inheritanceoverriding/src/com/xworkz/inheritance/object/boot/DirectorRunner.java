package com.xworkz.inheritance.object.boot;

import com.xworkz.inheritance.object.child.Prasanth;
import com.xworkz.inheritance.object.parent.Director;

public class DirectorRunner {
	public static void main(String[] args) {
		Director director=new Prasanth("Pradeep", "Movie","Rajahuli" );
		director.display();
	}

}
