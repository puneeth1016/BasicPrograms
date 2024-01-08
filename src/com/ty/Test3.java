package com.ty;

public class Test3 {
public static void main(String[] args) {
		String a="puneet";
		String rev= " ";
		char c='t';
		int d=a.length();
		for(int i=d-1;i>=0;i--)
		{
			rev=rev+a.charAt(i);
		}
		System.out.println(rev);
		for(int j=0;j<d;j++)
		{
			if(c==a.charAt(j))
			{
				System.out.println(j);
			}
			
		}
		
	}

}
