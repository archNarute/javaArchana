package method;

public class StaticClassA {

	public static void main(String[] args) 
	{ 
		set1(); //from own class
		set2(); //from own class
		StaticClassB.group1(); //from different class
		StaticClassB.group2(); //from different class

	}

	public static void set1()
	{
		System.out.println("This is complete static regular method from static class A ");
		
	}
	
	public static void set2()
	{
		System.out.println("This is complete static regular method from static class A");
	}
	
	
	
	
	
	
	
	
}
