
package assesment;


import java.io.BufferedReader;

import java.io.InputStreamReader;

import java.time.LocalDate;

import java.util.ArrayList;

import java.util.List;

 

import assesment.Person;

import assesment.PersonBo;

 

public class Main {

 

	public static void main(String[] args)throws Exception {

		// TODO Auto-generated method stub

      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

      System.out.println("Ënter the number of Persons");

      int n=Integer.parseInt(br.readLine());

      List<Person> li=new ArrayList<Person>();

	  for(int i=0;i<n;i++) {

		  String value=br.readLine();

		  String []prvalue=value.split(",");

		  //System.out.println(prvalue[0]);

		 // String name, LocalDate dob, String skill, int noOfMatches, int runs, int wickets, String nationality,

			//double powerRating)

		  Person p=new Person(prvalue[0],LocalDate.parse(prvalue[1]),prvalue[2],Integer.parseInt(prvalue[3]),
				  Integer.parseInt(prvalue[4]),Integer.parseInt(prvalue[5]),prvalue[6],Double.parseDouble(prvalue[7]));

		  li.add(p);

	  }

	  

	  System.out.println("1. NAtionality");

	  System.out.println("2. Date of Birth");

	  int ch=Integer.parseInt(br.readLine());

	  PersonBo pb=new PersonBo();

	  if(ch==1) {

		  String nat=br.readLine();

		  List<Person> nlist=pb.findPlayers(li,nat);

		  for(Person p:nlist) {

			  System.out.println(p);

		  }

	  }

	  

	}

 

}