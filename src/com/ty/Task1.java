package com.ty;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args)
	{
		int account1_number;
		Scanner q=new Scanner(System.in);
		System.out.println("Enter the account number");
		int accno=q.nextInt();	
		if(accno<10002)
		{
		int balance=10000; 
		int bal=balance;
			System.out.println("select option");
			System.out.println("enter 1 to deposite");
			System.out.println("enetr 2 to withdraw");
			System.out.println("enter 3 to check balance");
			System.out.println("enter any number to exit"); 
		Scanner scan=new Scanner(System.in);
			int select=scan.nextInt();	
		
		switch(select)
		{
		case 1:
			System.out.println("deposite");
			break;
		case 2:
			System.out.println("withdraw");
			break;
		case 3:
			System.out.println("check balance");
			break;
		}
		{
if(select==1)
{
	System.out.println("enter the amount");
	Scanner a=new Scanner(System.in);
	int b=a.nextInt();	
	if(b==0)
	{
		System.out.println("enter a vaild amount--->");
	}
	System.out.println("confirm your of amount --->");
	System.out.println(b);
	System.out.println("amount " + b + " deposited");
	System.out.println("Total balance" +(bal+b));
}
	if(select==2)
	{
		Scanner a=new Scanner(System.in);
		int b=a.nextInt();	
		if(b==0)
		{
			System.out.println("enter a vaild amount--->");
		}
		System.out.println("confirm your of amount --->");
		System.out.println(b);
		System.out.println("amount " + b + " withdrawn");
		System.out.println("Total balance" +(bal-b));
	}
	if(select==3)
	{
		System.out.println("balance = " + bal);
		
	}
	}
		}
		else {
			System.out.println("Create an Acoount");
		}
}		
}
