package collection_use;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Priority_Quoue_Study {

	public static void main(String[] args)
	{
		PriorityQueue<Object>pq=new PriorityQueue<>();
		pq.add(100);
		pq.add(88);
		pq.add(26);
		//pq.add(null); null not accepted
		//pq.add(null);
		pq.add(100);
		pq.add(500);
		pq.add(300);
		System.out.println(pq);
		//duplicates are allowed but only homogeneous data is accepted
       System.out.println("----------------------------");
		System.out.println(pq.contains(88));
		System.out.println("----------------------------");
		System.out.println(pq.element());
		System.out.println(pq);
		System.out.println("----------------------------");
		System.out.println(pq.offer(400));
		System.out.println(pq);
		System.out.println("----------------------------");
		System.out.println(pq.peek());
		System.out.println(pq);
		System.out.println("----------------------------");
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println("----------------------------");
		System.out.println(pq.remove(500));
		System.out.println(pq);
		System.out.println("----------------------------");
		System.out.println(pq.size());
		
		System.out.println("-----------for each-----------------");
		for(Object p:pq)
		{
			System.out.println(p);
		}
		System.out.println("-----------iterator-----------------");
	    Iterator<Object> it = pq.iterator();
	    while(it.hasNext())
	    {
	    	System.out.println(it.next());
	    }
	}

}
