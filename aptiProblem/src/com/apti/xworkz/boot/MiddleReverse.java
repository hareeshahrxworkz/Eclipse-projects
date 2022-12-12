package com.apti.xworkz.boot;

import java.util.Scanner;

public class MiddleReverse {

	public static void main(String[] args) {

		String name="HI On Learning Happy World",ns="",rem="";
		String [] ne=name.split(" ");
		Scanner sc=new Scanner(System.in);
		String cmp=sc.nextLine();
		for(int i=0;i<ne.length;i++)
		{
			 rem=ne[i];
			if(rem.equals(cmp)) {
				for(int j=0;j<cmp.toCharArray().length;j++)
				{
					ns=cmp.charAt(j)+ns;
					
				}
				ne[i]=ns;
			}
			System.out.print( ne[i] +" ");

		}


		
	}

}
