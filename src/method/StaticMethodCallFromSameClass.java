package method;

public class StaticMethodCallFromSameClass {

	public static void main(String[] args)
	{
		//call static regular method from same class
		//methodName();
		sample();
		test();
		sample();
		test();
		test();

	}

	
	public static void sample() //complete static regular method
	{
       System.out.println("Hello This is complete static regular method");
     }
	
	public static void test() // complete static regular method
	{
		System.out.println("This is complete static regular method");
	}
	
	
	
	
}
