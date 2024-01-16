package AccessSpecifiers;

public class Group1 {   //for class access specifiers is only public and default
   
	private char a='A';
	int b=50;
	protected String c="ram";
	public static int d=40;
	
	
	public static void main(String[] args)  //for class access specifiers is
	{ Group1 as=new Group1();
	as.sample();
	as.set();
	as.type();
	
	test();
	
	System.out.println("value of a is "+as.a);
	System.out.println("value of b is "+as.b);
	System.out.println("value of c is "+as.c);
	System.out.println("value of d is "+d);
		
	}

	private void sample()
	{
		System.out.println("This is private access specifier-->valid only within class");
	}
	
	 static void test()
	{
		System.out.println("This is default access specifier-->valid only within package");
	}
	protected  void set()
	{
		System.out.println("This is proteced access specifier-->valid only within package and valid outside the class by inheritance use");
	}
	public void type()
	{
		System.out.println("This is public access specifier-->valid only within project");
	}
}
