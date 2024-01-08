package com.ty;

public class Test 
{
	static int  count(int c)//c=5//c=4//c=3//c=2//c=1
	{
		if(c>=1)//5>=1//4>=1////3>=1//2>=11>=1
		{	

			return c*count(c-1);
			// 5+count(4)+                       
			//4+count(3)+                   8088469895
			//3+count(2)+
			//2+count(1)+
			//1+count(0)
			//5+4+3+2+1+0
		}
		//
		return 1;

	}

	public static void main(String[] args) 
	{

		int b=count(6);
		System.out.println("factorial using recursion "+b);
		int sum=1;
		for(int i=1;i<=6;i++)
		{
			sum=sum*i;
		}
		System.out.println("using for "+sum);

	}
}
