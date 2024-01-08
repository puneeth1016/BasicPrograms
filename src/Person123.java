import java.time.LocalDate;
import java.util.*;
class NameComparator implements Comparator<Person2> {
	@Override
	public int compare(Person2 o1, Person2 o2) {

		return o1.getName().compareTo(o2.getName());
	}
}

class Person2
{
	private String name;
	private String email;
	private int salary;
	private LocalDate dateOfBirth;

	public Person2(String name, String email, int salary, LocalDate dateOfBirth) {
		super();
		this.name = name;
		this.email = email;
		this.salary = salary;
		this.dateOfBirth = dateOfBirth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth)
	{
		this.dateOfBirth = dateOfBirth;
	}
	@Override
	public String toString() {
		return "Person2 name=" + name + ", email=" + email + ", salary=" + salary + ", dateOfBirth=" + dateOfBirth
				;
	}    
}
	class SalaryComparator implements Comparator<Person2> {
	    @Override
	    public int compare(Person2 o1, Person2 o2) {
	        // TODO Auto-generated method stub
	        if(o1.getSalary()<o2.getSalary()) {
	            return -1;
	        }
	        else if(o1.getSalary()> o2.getSalary()) {
	            return 1;    
	        }
	        else {
	        return 0;
	        }
	    }

	}
	class DobComparator implements Comparator<Person2>
	{
	    @Override
	public int compare(Person2 o1, Person2 o2) {
	        
	        return o1.getDateOfBirth().compareTo(o2.getDateOfBirth());
	    }
	}

	public class Person123 {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			ArrayList<Person2> al=new ArrayList<Person2>();

			al.add(new Person2("Thiru","th@th.com",12000,LocalDate.parse("2000-01-01")));
			al.add(new Person2("Ajay","aj@th.com",20000,LocalDate.parse("1998-07-21")));
			al.add(new Person2("Bala","ba@th.com",15000,LocalDate.parse("2001-03-11")));
			al.add(new Person2("Sachin","sa@th.com",11000,LocalDate.parse("2000-11-11")));
			al.add(new Person2("Rohit","ro@th.com",33000,LocalDate.parse("1997-02-03")));

			System.out.println("Given Order");
			for(Person2 p2:al)
			{
				System.out.println(p2);
			}

			Collections.sort(al,new SalaryComparator());

			System.out.println("Salary Order");
			for(Person2 p2:al) {
				System.out.println(p2);
			}
			Collections.sort(al,new NameComparator());

			System.out.println("name Order");
			for(Person2 p2:al) {
				System.out.println(p2);
			}

		}
	}


