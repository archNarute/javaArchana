package collection_use;

import java.util.ArrayList;

public class ArrayListMethod {

	public static void main(String[] args) 
	{
	ArrayList<Object> a1 = new ArrayList<>();
	//Add method----result gives in ELEMENT is succesfully add or not so return type is boolean
	//a1.add("Hi");
	System.out.println(a1.add("Hi"));
	//a1.add("GM")
	System.out.println(a1.add("GM"));
	
	a1.add(1, "beautiful");
	System.out.println(a1);
	
	//CLEAR method
	//a1.clear();
	//System.out.println(a1); output is []
	
	//CLONE method --make exact copy or duplicate
	Object a1new = a1.clone();
	System.out.println("clone of arraylist is "+a1new);
	
	//CONTAINS Method--return type is boolean
	//a1.contains(Hi)
	System.out.println(a1.contains("Hi"));
	//a1.contains("gn");
	System.out.println(a1.contains("gn"));
	
	
	}
}



