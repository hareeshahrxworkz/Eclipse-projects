package com.apti.xworkz.boot;

public class Practice {

	public static void main(String[] args) {

		// String Reverse
//		String  name="h a r e e s h a ",addition="";

//		for(int i=0;i<name.toCharArray().length;i++)
//		{
//			addition=addition+name.charAt(i);
//		}
//		
//		System.out.println(addition);

		// remove whitespace

//		for(int i=0;i<name.toCharArray().length;i++)
//		{
//			char ch=name.charAt(i);
//			if(ch>='a'&&ch<='z')
//				
//			{
//				char c=(char) ((char) ch -32);
//				addition=addition+c;
//			}
//			
//			
//
//			
//		}
//		System.out.println(addition);
//
//	}

		int rem = 0, rev = 0, num = 1634, ne = num, sum = 0, org = num, count = 0;

		while (ne > 0) {
			rem = ne % 10;
			ne = ne / 10;
			count++;
		}
		while (org > 0)

		{
			rem = org % 10;
			sum = (int) ((int) sum + Math.pow(rem, count));
			org = org / 10;

		}
		if (sum == num) {
			System.out.println("is armstrong number  " + sum);
		} else {
			System.out.println("is armstrong NOT number  " + sum);

		}
		System.out.println("counting  :" + count);

		System.out.println("===============================");
		int nu = 0;
		char na = ' ';
		String name = "hareesha123";

		for (int i = 0; i < name.toCharArray().length; i++) {
			char ch = name.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				nu = (int) ch;
				System.out.println(nu);

			} else if (ch >= '0' && ch <= '9') {
				
				
				System.out.println((char) ((char) ch+0));

			}
		}

	}

}
