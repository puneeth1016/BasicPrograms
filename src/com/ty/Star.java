package com.ty;

import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
	/*	int n=8;
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if(i==(n/2) || j==(n/2))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}

			}
			System.out.println(" ");

		}  */
		
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();//enter 3 digit number only
		int rem=0;
		int arm=0;
		int b=n;
		for(int i=0;i<=3;i++)
		{
			rem=n%10;
			arm=arm+rem*rem*rem;
			n=n/10;
		}
		  
System.out.println(arm);
if(arm==b)
{
	System.out.println("It is armstrong number");
}
else
{
	System.out.println("It is not a armstrong number");
}
	}

}
