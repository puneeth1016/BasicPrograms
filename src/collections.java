import java.util.LinkedList;
import java.util.Collections;
import java.util.Iterator;

public class collections {

	String name;
	int price;
	int quantity;
	String brand;
	
	collections(String nam,int pric,int quantiti,String brandd)
	{
		name=nam;
		price=pric;
		quantity=quantiti;
		brand=brandd;
	}
	
	public static void main(String[] args) {
		collections c1=new collections("rice",1500,25,"Kaveri");
		collections c2=new collections("dal",2800,25,"Jairam");
		collections c3=new collections("soap",349,4,"LUX");
		collections c4=new collections("shampoo",250,2,"Dove");
		LinkedList<collections>list1=new LinkedList<>();
		Collections.addAll(list1,c1,c2,c3,c4);
		
		
		Iterator<collections> i=list1.iterator();
		while(i.hasNext())
		{
			collections c=(collections)i.next();
			System.out.println("Name : "+c.name);
			System.out.println("Price : "+c.price);
			System.out.println("Quantity : "+c.quantity);
			System.out.println("Brand : "+c.brand);
			System.out.println();
	
		}

	}
	

}
