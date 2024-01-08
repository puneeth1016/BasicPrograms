package com.ty;
import java.util.Scanner;

public class Demotest {
	static int  count(int c)//c=5//c=4//c=3//c=2//c=1
	{
		if(c>=0)//5>=1//4>=1////3>=1//2>=11>=1
		{	

			return c+count(c-1);
			// 5+count(4)+
			//4+count(3)+
			//3+count(2)+
			//2+count(1)+
			//1+count(0)
			//5+4+3+2+1+
		}
		//
		return 0;

	}

	public static void main(String[] args) 
	{

		int b=count(5);
		System.out.println("Sum using recursion "+b);
		int sum=0;
		for(int i=1;i<=5;i++)
		{
			sum=sum+i;
		}
		System.out.println("using for "+sum);

	}
}