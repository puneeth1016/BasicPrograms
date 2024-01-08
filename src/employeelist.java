import java.util.ArrayList;
import java.util.Collections;

public class employeelist {
	String name;
	int id;
	int salary;
	String dept;
	
	employeelist(String a,int b,int c,String d)
	{
		name=a;
		id=b;
		salary=c;
		dept=d;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		employeelist emp1=new employeelist("karthik",101,15000,"testing");
		employeelist emp2=new employeelist("manoj",102,25000,"developing");
		employeelist emp3=new employeelist("puneeth",103,1000,"testing");
		
		ArrayList<employeelist> elist=new ArrayList<>();
		Collections.addAll(elist,emp1,emp2,emp3);
		for(employeelist e:elist)
		{
			
		
			System.out.println("Name : "+e.name);
			System.out.println("Id : "+e.id);
			System.out.println("Salary : "+e.salary);
			System.out.println("Department : "+e.dept);
			System.out.println();
		}
		
		
	}

}
