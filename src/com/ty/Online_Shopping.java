package com.ty;
public class Online_Shopping {
	public static void main(String[] args) {
		String s1="puneeth";
		String s2=new String("puneeth");
		 if(s1==s2)
		 {
			 System.out.println("references are equal");
		 }
		 else {
			 System.out.println("refrence are not equal ");
		 }
		 if(s1.equals(s2))

		 {
			 System.out.println("string is equal");
			 
		 }
		 else
		 {
			 System.out.println("String not equal");
		 }
	
	}

}
