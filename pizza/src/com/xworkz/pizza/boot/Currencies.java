package com.xworkz.pizza.boot;

import java.util.Collection;
import java.util.TreeSet;

public class Currencies {

	public static void main(String[] args) {
		
		System.out.println("Currencies is running  ");
		Collection<String> currencies=new TreeSet<String>();
		
		String currencyName="Rupee";
		String currencyName1="Afghan afghani";
		String currencyName2="European euro";
		String currencyName3="Albanian lek";
		String currencyName4="United States dollar";
		String currencyName5="Algerian dinar";
		String currencyName6="Angolan kwanza";
		String currencyName7="Armenian dram";
		String currencyName9="Argentine peso";
		String currencyName10="Aruban florin";
		String currencyName11="Saint Helena pound";
		String currencyName12="Australian dollar";
		String currencyName13="Azerbaijan manat";
		String currencyName14="Bahamian dollar";
		String currencyName15="Bahraini dinar";
		String currencyName16="Bangladeshi taka";
		String currencyName17="Brazilian real";
		String currencyName18="Botswana pula";
		String currencyName19="Burundi franc";
		String currencyName20="Cabo Verdean escudo";
		String currencyName21="Cambodian riel";
		String currencyName22="Chilean peso";
		String currencyName23="Comorian franc";
		String currencyName24="Costa Rican colon";
		String currencyName25="Czech koruna";
		String currencyName26="Swazi lilangeni";

		
		currencies.add(currencyName);
		currencies.add(currencyName1);
		currencies.add(currencyName2);
		currencies.add(currencyName3);
		currencies.add(currencyName4);
		currencies.add(currencyName5);
		currencies.add(currencyName6);
		currencies.add(currencyName7);
		currencies.add(currencyName9);
		currencies.add(currencyName10);
		currencies.add(currencyName11);
		currencies.add(currencyName12);
		currencies.add(currencyName13);
		currencies.add(currencyName14);
		currencies.add(currencyName15);
		currencies.add(currencyName16);
		currencies.add(currencyName17);
		currencies.add(currencyName18);
		currencies.add(currencyName19);
		currencies.add(currencyName20);
		currencies.add(currencyName21);
		currencies.add(currencyName22);
		currencies.add(currencyName23);
		currencies.add(currencyName24);
		currencies.add(currencyName25);
		currencies.add(currencyName26);

		
		
		System.out.println("Collection Array Size is  :"+currencies.size());
		
		
		for(String name:currencies)
		{
			System.out.println(name);
		}
		
		
		currencies.clear();
		System.out.println("after Clearing Collection  :"+ currencies.size());

		
	}

}
