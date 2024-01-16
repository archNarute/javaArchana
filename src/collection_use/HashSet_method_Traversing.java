package collection_use;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_method_Traversing {

	public static void main(String[] args)
	{
		HashSet<Object> hs=new HashSet<>();
		
		hs.add(66);
		hs.add(null);
		hs.add('S');
		hs.add("RAM");
		hs.add(null);
		hs.add(true);
		hs.add(66);
		hs.add(88.2f);
		System.out.println(hs);
		//cant use methods which are index basis--> get, element method
		//cant use for loop bcoz get method is used in this
		System.out.println("----traversing-- for each loop");

		for(Object h:hs)
		{
			System.out.println(h);
		}
		System.out.println("-----iterator--------------");
		Iterator<Object> it = hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
