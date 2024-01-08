package assesment;


import java.util.ArrayList;

import java.util.List;

 

import assesment.Person;

 

public class PersonBo {

	

	public List<Person> findPlayers(List<Person> li,String nationality){

		List<Person> rli=new ArrayList<Person>();

		

		for(Person p:li) {

			if(p.getNationality().equals(nationality)) {

				rli.add(p);

			}

		}

		

		return rli;

		

	}
}
