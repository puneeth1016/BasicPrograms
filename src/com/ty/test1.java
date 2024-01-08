package com.ty;
import java.util.Arrays;
import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the string :");

		String str=sc.next();

		if(str.length()==1||str.length()==2) {
			System.out.println("The given string can be rearranged to form a palindrome");

			return;

		}

		char ch[]=str.toCharArray();

		Arrays.sort(ch);

		for(int i=0;i<ch.length;i++)

		{
			System.out.print(ch[i]);

		}

		int c=0;

		for(int i=0;i<ch.length;i++) {
			int cnt=1;

			if(ch[i]==0)

			{
				continue;

			}

			for(int j=i+1;j<ch.length;j++)	 {
				if(ch[i]==ch[j]&&ch[i]!=0)	 {
					cnt++;

					ch[j]=0;

				}

			}

			if(cnt>1) {
				if(cnt%2!=0)

					c++;

			}

			if(cnt==1)

				c++;

			if(c>1)

			{
				System.out.println("The given string cannot be rearranged to form a palindrome");

				return;

			}

		}

		System.out.println("The given string can be rearranged to form a palindrome");

	}

}
