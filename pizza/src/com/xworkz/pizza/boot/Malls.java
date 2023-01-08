package com.xworkz.pizza.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.TreeSet;

public class Malls {

	public static void main(String[] args) {

		List<String> malls=new LinkedList<String>();
		
		String mallName="LuLu International Shopping Mall, Kochi";
		String mallName1="DLF Mall of India, Noida";
		String mallName2="Sarath City Capital Mall, Hyderabad";
		String mallName3="Square Mall, Kanpur";
		String mallName4="World Trade Park Mall, Jaipur";
		String mallName5="Phoenix Marketcity Mall, Chennai";
		String mallName6="Elante Mall, Chandigarh";
		String mallName7="Mantri Square Mall, Bangalore";
		String mallName8="Select Citywalk, Delhi";
		String mallName9="Phoenix Market City, Mumbai";
		String mallName10="Phoenix Market City, Pune";
		String mallName11="Orion Mall, Bangalore";
		String mallName12="Ambience Mall, Gurgaon";
		String mallName13="Nexus Esplanade, Bhubaneshwar";
		String mallName14="Ambience Mall, Delhi";
		String mallName15="Royal Meenakshi Mall, Bannerghatta Road";
		String mallName16="Gopalan Mall, Bannerghatta Road";
		String mallName17="The Forum, Kormangala";
		String mallName18="Phoenix Market City, Whitefield";
		String mallName19=" Bangalore Central, Jayanagar";
		String mallName20="The Collection UB City";
		String mallName21="Garuda Mall, Magrath Road";
		String mallName22="Inorbit Mall, Whitefield";
		String mallName23="Leela Galleria, Old Airport Road";
		String mallName24="Cosmos Mall, Kundanahalli";
		String mallName25="Total Mall, Madiwala";
		String mallName26="The Forum Value, Whitefield";
		String mallName27="Park Square Mall, Whitefield";
		String mallName28="Spar Hypermarket - Bangalore";
		String mallName29="Sigma Mall - Vasanth Nagar - Bangalore";
		String mallName30="Tibet Mall - Bangalore";
		String mallName31="Gopalan Signature Mall - Old Madras Road - Bangalore";
		String mallName32="The High Street Mall - Jayanagar - Bangalore";
		String mallName34="Bangalore Central Mall - Bellandur - Bangalore";
		String mallName35="Forum Mall - Koramangala 7th Block - Bangalore";
		String mallName36="Ledo Mall - Bengaluru";
		String mallName37="Housuja's Mall - Bengaluru";
		String mallName38="Inorbit Mall - Whitefield - Bangalore";
		String mallName39="Plama Mall - Bangalore";


		malls.add(mallName);
		malls.add(mallName1);
		malls.add(mallName2);
		malls.add(mallName3);
		malls.add(mallName4);
		malls.add(mallName5);
		malls.add(mallName6);
		malls.add(mallName7);
		malls.add(mallName8);
		malls.add(mallName9);
		malls.add(mallName10);
		malls.add(mallName11);
		malls.add(mallName12);
		malls.add(mallName13);
		malls.add(mallName14);
		malls.add(mallName15);
		malls.add(mallName16);
		malls.add(mallName17);
		malls.add(mallName18);
		malls.add(mallName19);
		malls.add(mallName20);
		malls.add(mallName21);
		malls.add(mallName22);
		malls.add(mallName23);
		malls.add(mallName24);
		malls.add(mallName25);
		malls.add(mallName26);
		malls.add(mallName27);
		malls.add(mallName28);
		malls.add(mallName29);
		malls.add(mallName30);
		malls.add(mallName31);
		malls.add(mallName32);
		malls.add(mallName34);
		malls.add(mallName35);
		malls.add(mallName36);
		malls.add(mallName37);
		malls.add(mallName38);
		malls.add(mallName39);

		System.out.println("Before  clearing collection mall   :"+malls.size());
//		malls.clear();
		System.out.println("After  clearing collection mall   :"+malls.size());

		
		ListIterator<String> iterator=malls.listIterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);

			
		}
		System.out.println("reverse order ///////////////////////////////////////////////");
		
		while(iterator.hasPrevious())
		{
		
			String ref=iterator.previous();
			System.out.println(ref);
			
		}
		
		
		
		
		
	}

}
