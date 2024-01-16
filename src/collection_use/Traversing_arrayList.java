package collection_use;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Traversing_arrayList {

	public static void main(String[] args) {
		ArrayList<String> s= new ArrayList<>();
		
		s.add("Archana");
		s.add("Narute");
		s.add("Barshi");
		s.add("Solapur");
		s.add("India");
		
		System.out.println(s);
		System.out.println("==============for loop=============");
		
		for(int i=0; i<=s.size()-1; i++)
		{
			System.out.println(s.get(i));
		}
		
		System.out.println("==============for each loop=============");
		
         for(String s1:s)
         {
        	 System.out.println(s1);
         }
         
         System.out.println("==============iterator============="); //iterator curser is unidirectional
         
         Iterator<String> a = s.iterator();
         /*System.out.println(a.next());
         System.out.println(a.next());
         System.out.println(a.next());
         System.out.println(a.next());
         System.out.println(a.next());*/
         //System.out.println(a.next());    no such element exception is there 
         
         while(a.hasNext())
         {
        	 System.out.println(a.next());
         }
         
         System.out.println("==============listiterator============="); //listiterator curser is bidirectional
	     
         ListIterator<String> l = s.listIterator();
         
         while(l.hasNext())
         {
        	 System.out.println(l.next());
         }
         
         System.out.println("==============listiterator in reverse dirn============="); //listiterator curser is bidirectional
	     while(l.hasPrevious())
	     {
	    	 System.out.println(l.previous());
	     }
	
	
	
	}

}
