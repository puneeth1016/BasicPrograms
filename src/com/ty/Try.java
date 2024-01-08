package com.ty;

public class Try {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
/*      int start=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(start + " ");
				start++;
			}
			System.out.println(" ");
		}             */
		for (int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i>j)
				{
				System.out.print(" ");	
				}
			}
			for(int j=i;j<=n+i;j++)
			{
				if(i==1 || i==n)
				{
					System.out.print("*");
				}
				System.out.print(" ");
			}
			System.out.println(" ");
		
		
			
		}
		
	}
}

