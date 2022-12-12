package com.apti.xworkz.boot;

public class Ovels {
	public static void main(String[] args) {
		String line = "manu hareesha 1 5 958 1 mahadev";
		int vowels = 0, consonants = 0,digit=0;

		line = line.toLowerCase();
		for (int i = 0; i < line.length(); ++i) {
			char ch = line.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowels++;
			}

			else if ((ch >= 'a' && ch <= 'z')) {
				consonants++;
			}
			else if(ch>='0'  && ch<='9') {
				digit++;
			}

		}

		System.out.println("Vowels: " + vowels);
		System.out.println("Consonants: " + consonants);
		System.out.println("Digit"+digit);


		String name = "Hareesha Good Boy";
		int ovels = 0, low = 0;
		String abc = name.toLowerCase();

		for (int i = 0; i < abc.length(); i++) {

			char ch = abc.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

				ovels++;

			} else if (ch >= 'a' && ch <= 'z') {
				low++;
			}
			

		}
		System.out.println(ovels);
		System.out.println(low);

	}

}
