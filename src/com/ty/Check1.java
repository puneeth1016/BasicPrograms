package com.ty;

public class Check1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,10,30,50};
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
		}System.out.println(count);
	
	}

}
