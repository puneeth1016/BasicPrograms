import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;	
class ipl

{

	String playername;

	int score;

	public ipl(int score,String playername ) {

		super();

		this.playername = playername;

		this.score = score;

	}

	public int compareTo(ipl o) {

		return this.score-o.score;

	}

	@Override

	public String toString() {

		return "\n list [score=" + score + ", playername=" + playername + "]";

	}

}

class comparetoname1 implements Comparator<ipl>

{

	public int compare(ipl o1, ipl o2) {

		return o1.score-o2.score;

	}

}

public class Assign {

	public static void main(String[] args) {



		ipl a1=new ipl(60,"shubham gill");

		ipl a2=new ipl(110,"virat");

		ipl a3=new ipl(80,"ABD");

		ipl a4=new ipl(120,"virat");


		ipl b1=new ipl(70,"rohith");

		ipl b2=new ipl(100,"virat");

		ipl b3=new ipl(80,"hardhik");

		ipl b4=new ipl(80,"hardhik");


		
		TreeSet<ipl> season1=new TreeSet<ipl>(new comparetoname1());



		Collections.addAll(season1, a1,a2,a3,a4);

		System.out.println("season1 players are :");

		for(ipl s:season1)

		{

			System.out.println(s.playername);

		}



		TreeSet <ipl> season2=new TreeSet<ipl>(new comparetoname1());



		Collections.addAll(season2, b1,b2,b3,b4);

		System.out.println();

		System.out.println("season2 players are ");

		for(ipl s:season1)

		{

			System.out.println(s.playername);

		}

		System.out.println();

		
		for(ipl f:season1)

		{

			for(ipl g:season2)

			{

				if(f.playername.equals(g.playername))

				{

					System.out.println("consistent player is : "+f.playername );

					System.out.println("and score is: "+f.score);

				}

			}



		}


	}

}
