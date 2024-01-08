package com.ty;

public class Checkstringlen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="malayalam xyz";
		String s1=s.trim();
		char c[]=s1.toCharArray();
		int a=s.length();
		
		for(char i=0;i<a;i++)
		{
			int m=0;
			for(char j=(char)(i+1);j<a;j++)
			{
				if(c[i]==c[j])
				{
					System.out.println("cahracter repeated is : "+c[i]);
					m++;
					
				}
			}System.out.println(m);
		}
	}

}
