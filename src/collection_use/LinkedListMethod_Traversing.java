package collection_use;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListMethod_Traversing {

	public static void main(String[] args) 
	{
		LinkedList<Character> ld=new LinkedList<>();
		ld.add('A');
		ld.add('B');
		ld.add('C');
		ld.add('D');
		ld.add('E');
		
		System.out.println(ld);
		
		ld.add(0,'N');
		System.out.println(ld);
		
		ld.addFirst('M');
		ld.addLast('Z');
		System.out.println(ld);
		
		System.out.println(ld.contains('g'));
		
		ld.element();   //Retrieves, but does not remove, the head (first element) of this list
        System.out.println(ld.element());
        System.out.println(ld);
        System.out.println("====================");
        
        
        System.out.println(ld.peek());
        System.out.println(ld);
        System.out.println(ld.peekFirst());
        System.out.println(ld.peekLast());
        System.out.println("peek result "+ld);
        System.out.println("====================");
          
        //peek and element method are same but if list is empty then noSuchElementException is throw in elemnt
        //while in peek if list is empty then null value shows no exception comes 
        
        System.out.println(ld.poll());  //Retrieves and removes the head (first element) of this list
        System.out.println(ld);
        System.out.println("====================");
        
        System.out.println(ld.pollFirst());
        System.out.println(ld.pollLast());
        System.out.println("poll result "+ld);
        System.out.println("====================");
        //ld.pop(); Pops an element from the stack represented by this list.
        // In otherwords, removes and returns the first element of this list.
        //works like poll method but shows exception when empty
        System.out.println(ld.pop());
        System.out.println("pop result "+ld);
        System.out.println("====================");
        
        ld.push('T');  //Pushes an element onto the stack represented by this list. 
        //In otherwords, inserts the element at the front of this list. 
        System.out.println("Push result "+ld);
        System.out.println("====================");
        //ld.remove();
        System.out.println(ld.remove()); //Retrieves and removes the head (first element) of this list
        System.out.println(ld);
        
        /*ld.remove(1);
        System.out.println(ld.remove(1));
        //ld.removeFirst();
        System.out.println(ld.removeFirst());
        //ld.removeLast();
        System.out.println(ld.removeLast());
        System.out.println(ld);*/
        
        System.out.println("====================");
        System.out.println(ld.get(2));
        
        ld.getFirst();   //Returns the first element in this list

       System.out.println(ld.getFirst());  //work like element method
       System.out.println(ld.getLast());
       
       System.out.println(ld.indexOf('E'));
       System.out.println(ld);
       System.out.println("====================");
       ld.offer(null); //Adds the specified element as the tail (last element) of this list
       System.out.println(ld);
       
       //ld.offerFirst('K');
       System.out.println(ld.offerFirst('K')); //works like addfirst but return type is boolean
       System.out.println(ld.offerLast('P'));  // add method return type is null
       System.out.println(ld);
       System.out.println("====================");
       
       ld.size();
       System.out.println(ld.size());
       System.out.println(ld);
       
       
       System.out.println("===============TRAVERSING===================");
       System.out.println("------------------for loop-------------------------");
       for(int i=0; i<=ld.size()-1; i++)
       {
    	   System.out.println(ld.get(i));
       }

       System.out.println("------------------for each loop-------------------------");
       
       for(Character l:ld)
       {
    	   System.out.println(l);
       }
       
       System.out.println("------------------iterator-------------------------");

       Iterator<Character> l1 = ld.iterator();
       while(l1.hasNext())
       {
    	   System.out.println(l1.next());
       }

       System.out.println("------------------Listiterator-------------------------");
 
       ListIterator<Character> l2 = ld.listIterator();
       while(l2.hasNext())
       {
    	 System.out.println(l2.next());
       }
       System.out.println("------------------Listiterator reverse-------------------------");
     
       while(l2.hasPrevious())
       {
    	   System.out.println(l2.previous());
       }
	}

}
