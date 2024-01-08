package com.ty;

public class Mul_matrix {

	public static void main(String[] args) 
	{
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int b[][]= {{9,8,7},{6,5,4},{3,2,1}};
		int c[][]=new int[a.length][b.length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				for(int k=0;k<c.length;k++)
				{
					c[i][j]=c[i][j]+(a[i][k]*b[k][j]);
				}
			}
		}
		System.out.println("the addition elements are :");	
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				System.out.print(c[i][j] + "  ");
			}
			System.out.println();
		}

	}

}
