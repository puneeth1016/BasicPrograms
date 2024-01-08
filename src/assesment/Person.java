package assesment;

import java.time.LocalDate;

public class Person {

	private String name;

	private LocalDate dob;

	private String skill;

	private int noOfMatches;

	private int runs;

	private int wickets;

	private String nationality;

	private double powerRating;




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public LocalDate getDob() {
		return dob;
	}




	public void setDob(LocalDate dob) {
		this.dob = dob;
	}




	public String getSkill() {
		return skill;
	}




	public void setSkill(String skill) {
		this.skill = skill;
	}




	public int getNoOfMatches() {
		return noOfMatches;
	}




	public void setNoOfMatches(int noOfMatches) {
		this.noOfMatches = noOfMatches;
	}




	public int getRuns() {
		return runs;
	}




	public void setRuns(int runs) {
		this.runs = runs;
	}




	public int getWickets() {
		return wickets;
	}




	public void setWickets(int wickets) {
		this.wickets = wickets;
	}




	public String getNationality() {
		return nationality;
	}




	public void setNationality(String nationality) {
		this.nationality = nationality;
	}




	public double getPowerRating() {
		return powerRating;
	}

	public void setPowerRating(double powerRating) {
		this.powerRating = powerRating;
	}



	public Person(String name, LocalDate dob, String skill, int noOfMatches, int runs, int wickets,
			String nationality, double powerRating) {
		super();
		this.name = name;
		this.dob = dob;
		this.skill = skill;
		this.noOfMatches = noOfMatches;
		this.runs = runs;
		this.wickets = wickets;
		this.nationality = nationality;
		this.powerRating = powerRating;
	}




	@Override
	public String toString() {
		return "Person [name=" + name + ", dob=" + dob + ", skill=" + skill + ", noOfMatches=" + noOfMatches
				+ ", runs=" + runs + ", wickets=" + wickets + ", nationality=" + nationality + ", powerRating="
				+ powerRating + "]";
	}



}