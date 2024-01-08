package com.ty;

public class Test2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a=1721;
		int revrse=0;
		int b=a;
		while(a!=0)
		{
			revrse=revrse*10+a%10;
			a=a/10;
		}
		if(b==revrse)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
	}

}
