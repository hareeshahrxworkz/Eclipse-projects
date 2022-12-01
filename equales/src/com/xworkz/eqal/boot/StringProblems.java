package com.xworkz.eqal.boot;

public class StringProblems {

	public static void main(String[] args) {
		String movie="Triple Riding is a Kannada movie released on 25 Nov, 2022. The movie is directed by Mahesh Gowda and featured Aditi Prabhudeva, Rachana Inder, Sadhu Kokila and Rangayana Raghu as lead characters";
		
		String [] str=movie.split(" ");//splict by space convert to array
		System.out.println(str.length);//no of splicted String
		
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i]);//Read and Pring splicted String
		}
		int count=0;
		int word=0;
		char word1='r';

		char [] stingChar=movie.toCharArray();
		for(int i=0;i<stingChar.length;i++)
		{
			count++;	
			
			if (word1==stingChar[i]) {
			word++;	
			}
		}
		
		System.out.println(word);
		
		
		
		
		
		

		
	}

}
