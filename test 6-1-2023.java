1

package com.xworkz.pizza.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MaxMin {

public static void main(String[] args) {
	
	int a[]= {45,333,76,29,900,23,474,654,29,454 };
	
	int max=a[0];
	int min=a[0];
	for (int i=1;i<a.length;i++)
	{
		if(max<a[i])
		{
			max=a[i];
		}
		else if(min>a[i]) {
			min=a[i];
			
		}
	}

System.out.println("Minimu number "+min);
System.out.println("Maximum number "+max);

}


}







3  Converting a subclass type into a superclass type is called Generalization
	Converting  subclasses from an existing class.
	
	
4 a)stop a class to extended inherited by other classes make  class constructor private.


 
b)java.lang.String, java.lang.Math are final classes.


c) Delegation is an alternative to inheritance. Delegation means instance of another class as an instance variable,


5
Collection used for Comparetor Sorted  and Comparable

6
Linked List 												Array List

Slower for reading data	node							faster for reading data elements
faster for manuplating data								slower for manuplating data
it is use  node 										it is use index
internally used circlur 								internaly uses arrays



7
List itreretor   											iteretor
list iteretor is accessing element 				iteretor it uses only forword direction accesing element
from forword and backword 

list iteretor it used in  priviousNext()		iteretor is used to hasnext(),remove(),next()
next(),peiviousindex(),next index 	

It helps traverse through a list only. 			It helps traverse through a map,
												list and a set.	
												
The iterator can’t modify or replace 			It can traverse through the elements present in Collection.
elements of a Collection.

8
remove the type casting return a subtype of the overridden method's 

9

memory likeage in java is one instance pointing to reference to the memory  is pointing to another memory location 
memory leakage like garbage collector



10

static polymorphisam  call the method from  compile time 
dynomic polymorphisam call the method from  run time
 
 
 11
 
 all the properties private 
to achive encapsulation  