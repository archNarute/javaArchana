package collection_use;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector_Method {

	public static void main(String[] args)
	{
		Vector<Integer> v = new Vector<>();
		v.add(2);
		v.add(44);
		v.add(33);
		v.add(25);
		v.add(98);
		v.add(75);
		
		System.out.println(v);
		
		v.add(1, 20);
		System.out.println(v);
		
		//v.capacity();
       System.out.println("capacity is "+v.capacity());
       System.out.println("size is "+v.size());
       //v.add(null);
       v.add(50);
       //v.add(null);
       v.add(33);
       v.add(27);
       System.out.println(v);
       System.out.println("-------------------------------------");
       System.out.println("capacity is "+v.capacity());
       System.out.println("size is "+v.size());
       System.out.println("-------------------------------------");
       Object v2 = v.clone();
       //Object v4 = v.clone();
       System.out.println("clone vactor is "+v2);
       System.out.println("-------------------------------------");
       //v.contains(50);
       System.out.println(v.contains(50));
       System.out.println(v.contains(99));
       System.out.println("-------------------------------------");
       
       //v.elementAt(4);   like get method
       System.out.println(v.elementAt(4));
       System.out.println("-------------------------------------");
       
       v.remove(5);
       System.out.println(v);
       System.out.println("-------------------------------------");
       
      //v.equals(v2);
       System.out.println(v.equals(v2));
       System.out.println("-------------------------------------");
       
       //v.firstElement();
       System.out.println(v.firstElement());
       System.out.println(v.lastElement());
       System.out.println("-------------------------------------");
       
      System.out.println(v.get(2));
      System.out.println("-------------------------------------");
      System.out.println("first index of 33 is "+v.indexOf(33));
      System.out.println("last index of 33 is "+v.lastIndexOf(33));
      System.out.println("-------------------------------------");
     
      v.insertElementAt(null, 2);
      System.out.println(v);
      System.out.println("-------------------------------------");
      System.out.println(v.isEmpty());
      System.out.println("-------------------------------------");
      //v.remove(1)
      System.out.println(v.remove(1));
      System.out.println("-------------------------------------");
      //v.remove(25) //in case of string this method work
      //System.out.println(v.remove(25)); 
      System.out.println(v);
      v.set(0, 10);
      System.out.println(v);
      //System.out.println();
      System.out.println("-------------------------------------");
      v.setElementAt(100, 1);
      System.out.println(v);
      System.out.println("-------------------------------------");
     // v.setSize(15);
      //System.out.println(v); //remaing elements shows null values
      System.out.println("-------------------------------------");
      v.removeElement(75);
      System.out.println(v);
      System.out.println("-------------------------------------");
      v.removeElement(null);
      System.out.println(v); //remove 1st null element only
      
      System.out.println("==========traversing===============");
      System.out.println("-----------------for loop--------------------");
      
      for(int i=0; i<=v.size()-1; i++)
		{
			System.out.println(v.get(i));
		}
      System.out.println("-----------------for each loop--------------------");
		
      for(Integer z:v)
      {
    	  System.out.println(z);
      }
      System.out.println("-----------------iterator--------------------");
      
      Iterator<Integer> it = v.iterator();
      while(it.hasNext())
      {
    	  System.out.println(it.next());
      }
      System.out.println("----------------list iterator--------------------");
      
      ListIterator<Integer> lit = v.listIterator();
      while(lit.hasNext())
      {
    	  System.out.println(lit.next());
      }
      System.out.println("-----------------reverse list iterator--------------------");
      
      while(lit.hasPrevious())
      {
    	  System.out.println(lit.previous());
      }
      System.out.println("-----------------enumeration--------------------");
      
      Enumeration<Integer> ve = v.elements();
      while(ve.hasMoreElements())
      {
    	  System.out.println(ve.nextElement());
      }
       
       
       
       
       
	}

}
