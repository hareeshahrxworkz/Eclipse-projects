package com.xworkz.things.boot;

import com.xworkz.things.Movie;

public class MovieRunner {

	public static void main(String[] args) {
		 String [] Scene= {"Fighting","Romentic sene","comedy","love"};
		 String [] comedyens= {"sadukokil","Chikkana","chikkappa"};
		 String [] runninglocation= {"bangloe","chnagar","mysore","chitradurga"};
		 
		 Movie movie=new Movie("YESH", "prakesh", "jaggu", Scene, true, comedyens, 2564000, runninglocation); 
		 
		 movie.display();
	}

}
