package com.apti.xworkz.boot;

public class WhiteSpace {

	public static void main(String[] args) {
		
		
		String name="Hands on learning happens here" ,ns="" ,newname="";
		int count=0;
		String [] cn=name.split(" ");
		for(String ch:cn) {
			System.out.println(ch);
		}
		System.out.println();
		
		for(int i=0;i<name.toCharArray().length;i++){
			
			char ch=name.charAt(i);
			
			if(ch!=' ')
			{
				ns=ns+ch;
			}
			else
			{
				count++;
			}
			if(count>1&& count<=2)
			{
				newname=ch+newname;
			}
			
		}
		System.out.println("space remove    :"+ns);
		System.out.println("Counting no of space   :"+ count);
		System.out.println("New name=    :"+newname);
		

	}

}
