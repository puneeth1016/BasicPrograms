package com.ty;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the two numbers");
		int a=sc.nextInt();
		Scanner scan=new Scanner(System.in);
		int b=scan.nextInt();
		System.out.println("before swapping");
		System.out.println("value of a : "+a +" "+"value of b : "+b);
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("after swapping: ");
		System.out.println("value of a : "+a +" "+"value of b : "+b);
		}

}
