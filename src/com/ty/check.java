package com.ty;

public class check {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		int a[]= {10,20,30,20,10};
		int n= a.length;
		int count=0;
		
		
	for(int i=0;i<=n/2 && n!=0;i++)
	{
		if(a[i]!=a[n-i-1])
		{
			count++;

		}
	}

	if(count==0)
	{
		System.out.println("palindrome");
	}
	else
	{
		System.out.println("not a palindrome");
	}
	}
	
}
