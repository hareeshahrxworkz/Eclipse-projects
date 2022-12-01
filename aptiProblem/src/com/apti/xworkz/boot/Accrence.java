package com.apti.xworkz.boot;

public class Accrence {

	public static void main(String[] args) {

		int [] a= {1,10,20,40,1,10};
		
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			if(a[i]==a[j])
			{
				count++;
			}
			System.out.println(a[i] +"||"+count);

		}

		System.out.println("=============");
		
		String name="Hareeeeesha";
		char [] ch=name.toCharArray();
		char chr='e';
		int coun=0;
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++){
				
			
		
//			System.out.println(ch[i]);
			if(ch[i]==chr)
			{
				coun++;
			}
			
		}
		System.out.println(coun);
		
		
		}
	}

}
