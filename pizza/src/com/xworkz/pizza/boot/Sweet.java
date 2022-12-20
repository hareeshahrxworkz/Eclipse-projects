package com.xworkz.pizza.boot;

import java.util.Collection;
import java.util.Collections;
import java.util.TreeSet;

public class Sweet {

	public static void main(String[] args) {
		
		System.out.println("Main Running Sucessfully");
		Collection<String> collection=new  TreeSet<>();
		String sweet1="Peda";
		String sweet2="Sugar";
		String sweet3="Jeelabi";
		String sweet4="Kesari bath";
		String sweet5="Kalakand";
		String sweet6="KeerKadam";
		String sweet7="Kesari Peda";
		String sweet8="Soan Pada";
		String sweet9="Mysur Pak";
		String sweet10="Sompa ";
		String sweet11="Halva";
		String sweet12="Jamun";
		String sweet13="Ladoo";

		
		
		collection.add(sweet1);
		collection.add(sweet2);
		collection.add(sweet3);
		collection.add(sweet4);
		collection.add(sweet5);
		collection.add(sweet6);
		collection.add(sweet7);
		collection.add(sweet8);
		collection.add(sweet9);
		collection.add(sweet10);
		collection.add(sweet11);
		collection.add(sweet12);
		collection.add(sweet13);

		System.out.println(collection.size());
		
		collection.clear();
		System.out.println("After clearing Collection on array");
		System.out.println(collection.size());
		
		
		
		
		
		
	}

}
