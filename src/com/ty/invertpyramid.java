package com.ty;

public class invertpyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int n=15;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j<=i)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("* ");
				}
			}
			System.out.println();
	}
	}

}
