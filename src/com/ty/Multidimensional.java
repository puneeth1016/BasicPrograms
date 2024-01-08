//write a program 

package com.ty;

import java.util.Scanner;
public class Multidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*	int arr[][]=new int[3][3];
		arr[0][0]=20;
		arr[0][1]=21;
		arr[0][2]=22;
		arr[1][0]=23;
		arr[1][1]=24;
		arr[1][2]=25;
		arr[2][0]=26;
		arr[2][1]=27;
		arr[2][2]=28;  */


		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of rows");
		int m=sc.nextInt();

		System.out.println("enter the number of columns");
		int n=sc.nextInt();

		int arr[][]=new int[m][n];

		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}			

		System.out.println("the values are");
		{
			for(int i=0;i<m;i++)
			{
				for(int j=0;j<n;j++)
				{
					System.out.print(arr[i][j] + "  ");
				}
				System.out.println();
			}

		}

	}
}