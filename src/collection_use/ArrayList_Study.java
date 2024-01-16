package collection_use;

import java.util.ArrayList;

public class ArrayList_Study {

	public static void main(String[] args)
	{
		ArrayList<Object> al = new ArrayList<>(); 
		
		al.add("study");
		al.add(17);
		al.add('A');
		al.add(50.6f);
		al.add(null);
		al.add(true);
		al.add("asd");
		
		System.out.println(al);
		
		ArrayList<Object> al1=new ArrayList<>();  //generic
		ArrayList<String> al2=new ArrayList<>();  //specific

	}

}
