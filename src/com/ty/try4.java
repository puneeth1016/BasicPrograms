package com.ty;

public class try4 {

	public static void main(String[] args) {
		int n=11;
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if(i==0||j==n||i==j ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}

			for(int j=0;j<=n;j++)
			{
				if(i==n||j==n||i+j==n) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}

			System.out.println(" ");
		}

		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if(i==0||j==0||i+j==n) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}

			for(int j=0;j<=n;j++)
			{
				if(i==n||j==0||i==j ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}

			System.out.println(" ");
		}


	}

}
