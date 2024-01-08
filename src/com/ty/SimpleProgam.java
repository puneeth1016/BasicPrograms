package com.ty;

public class SimpleProgam {

	public static void main(String[] args)
	{
		String a[]= {"abhi","hema","manoj","sunil","chandupriya"};
		String key="manoj";
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(key==a[i])
			{
				System.out.println(key+" position of the element "+ i);
				count++;
			}

		}
		if(count==0) 
		{
			System.out.println("element not found");
		}

	}

}
