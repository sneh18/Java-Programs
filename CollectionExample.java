
import java.util.*;

class CollectionExample
{	
	public static void main(String[] args)
	{
		ArrayList  a = new ArrayList();
		LinkedList l = new LinkedList();
		
		Date start;
		Date end;
		long difference1, difference2;
		long difference3, difference4;
		
		
		start = new Date();
		populate(a);
		end   = new Date();
		difference1 = end.getTime() - start.getTime();
		
		
		start = new Date();
		populate(l);
		end   = new Date();
		difference2 = end.getTime() - start.getTime();
		
		
		
		start = new Date();
		print(a);
		end   = new Date();
		difference3 = end.getTime() - start.getTime();
		
		start = new Date();
		print(l);
		end   = new Date();
		difference4 = end.getTime() - start.getTime();
		
		System.out.println("Time in Populating ArrayList elements  :: " + difference1);
		System.out.println("Time in Printing   ArrayList elements  :: " + difference3);
		
		System.out.println("Time in Populating LinkedList elements :: " + difference2);
		System.out.println("Time in Printing   LinkedList elements :: " + difference4);
		
	}
	
	public static void populate(AbstractList a)
	{
		for(int i=0; i < 5000; i++)
		{
			a.add("Element #" + Integer.toString(i+1));
		}
	}	
	
	public static void print(AbstractList a)
	{
		for(int i=0; i < a.size(); i++)
		{
			System.out.println(a.get(i));
		}
	}
}