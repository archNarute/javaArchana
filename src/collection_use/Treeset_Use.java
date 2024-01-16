package collection_use;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset_Use {

	public static void main(String[] args) 
	{
		TreeSet<Integer> ts= new TreeSet<>();
		ts.add(10);
		ts.add(70);
		ts.add(56);
		ts.add(22);
		ts.add(33);
		ts.add(20);
		ts.add(199);
		
		System.out.println(ts);

		System.out.println(ts.ceiling(21));
		System.out.println(ts.ceiling(99));
		//ts.floor(9);
		System.out.println(ts.floor(9));
		System.out.println(ts.floor(15));
		System.out.println(ts.floor(100));
		
		//ts.contains(50)
		System.out.println(ts.contains(50));
		System.out.println(ts);
		System.out.println(ts.contains(199));
		System.out.println(ts);
		//ts.descendingSet()
		System.out.println(	ts.descendingSet());
		
		//ts.first();
		System.out.println(ts.first());
		System.out.println(ts.last());
		System.out.println(ts.size());
		
		//ts.remove(25)
		System.out.println(ts.remove(25));
		System.out.println(ts.remove(22));
		System.out.println(ts);
		//ts.higher(22)
		System.out.println(ts.higher(22));
		System.out.println(ts.lower(10));
		System.out.println(ts.lower(199));
		
		System.out.println("===========for each ===========");
		for( Integer t :ts)
			
		{
			System.out.println(t);
		}
		System.out.println("===========iterator ===========");
		Iterator<Integer> t1 = ts.iterator();
		while(t1.hasNext())
		{
			System.out.println(t1.next());
		}
		System.out.println("===========descendingIterator ===========");
		Iterator<Integer> t2 = ts.descendingIterator();
		while(t2.hasNext())
		{
			System.out.println(t2.next());
		}
	}

}
