package com.ty;

public class Fibnocci 
{
	public static void main(String[] args)
	{
		int n1=0,n2=1,n3=0,i,count=10;
		for(i=2;i<count;i++)
		{
			System.out.print(n3+" ");
			n3=n1+n2;
			n1=n2;
			n2=n3;
		}
	}
}
