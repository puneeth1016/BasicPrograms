class Ram implements Runnable

{
	void count()

	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Count "+i);
		}
	}

	@Override

	public void run() {

		count();

	}
}

class Sita implements Runnable

{
	void add()

	{
		for(int i=1;i<=5;i++)

		{
			System.out.println("Add : "+i+1);
		}
	}

	@Override
	public void run() 
	{
		add();
	}
}

public class Multithreading {

	public static void main(String[] args) throws InterruptedException {

		Ram r= new Ram();
		Sita s= new Sita();

		Thread t1= new Thread(r);
		Thread t2= new Thread(s);

		t1.start();
		t1.join();
		t2.start();
		t1.join();


	}
}


