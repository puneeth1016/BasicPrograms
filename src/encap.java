class Employee{

	private int salary;

	private String empname;
	
	
	public	void setsal(int sal)

	{

		salary=sal;

	}

	public void setname(String name)



	{

		empname=name;

	}



	int getsal()

	{



		if (salary>=10000)

		{

			System.out.println("salary before hike is "+salary);

			System.out.println("salary after hike is "+ (salary= salary+(salary*10/100)));

			return salary;

		}else

		{

			System.out.println("salary after hike is "+salary);

		}

		return salary;

	}

	String getname()

	{

		System.out.println(empname);

		return empname;

	}





}



public class encap {



	public static void main(String[] args) {

		// TODO Auto-generated method stub



		Employee e=new Employee();

		e.setname("manoj");

		e.setsal(15000);

		e.getname();

		e.getsal();

		System.out.println();

		Employee e1=new Employee();

		e1.setname("karthik");

		e1.setsal(25000);

		e1.getname();

		e1.getsal();


		System.out.println();

		Employee e2=new Employee();

		e1.setname("Puneeth");

		e1.setsal(10000);

		e1.getname();

		e1.getsal();


	}



}

