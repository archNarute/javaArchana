package collection_use;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linked_Hashset_use {

	public static void main(String[] args) {
		LinkedHashSet<String> ls=new LinkedHashSet<>();
		ls.add("HI");
		ls.add("HELLO");
		ls.add("HI");
		ls.add(null);
		ls.add("GM");
		ls.add(null);
		System.out.println(ls);
		
		System.out.println("----for each loop----------");
		for(String l:ls)
		{
			System.out.println(l);
		}
		System.out.println("----iterator----------");
		Iterator<String> l1 = ls.iterator();
		while(l1.hasNext())
		{
			System.out.println(l1.next());
		}
	}

}
