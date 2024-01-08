package com.ty;

public class Arraay 
{
	public static void main(String[] args)
	{
		int a[]= {12,1,-1,4,-9};
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
				max=a[i];
		}
		{
			System.out.println(max);
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
				min=a[i];
		}
		{
			System.out.println(min);
		}

	}
}


