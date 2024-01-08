
public class ThreadClass implements Runnable{

    public static void main(String[] args)

    {

        ThreadClass obj1= new ThreadClass();

        Thread t1= new Thread(obj1);

        System.out.println(t1.getState());

        t1.start();

        System.out.println(t1.getState());

    }

    @Override

    public void run() {

        for(int i=1;i<=5;i++)

        {

            System.out.println("Count "+i);

            try {

                Thread.sleep(2000);

            } catch (InterruptedException e) {

                // TODO Auto-generated catch block

                e.printStackTrace();

            }

            System.out.println("Going back to Runnable State");

        }

    }

}