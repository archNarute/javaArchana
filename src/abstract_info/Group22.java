package abstract_info;

public class Group22 extends Group11
{

	public static void main(String[] args) 
	{
		Group22 g=new Group22();
		g.set1();
		g.test();
		g.set2();
	}

	@Override
	public void set1() 
	{
		System.out.println("This method from abstact class and completed in Concrete class");
		
	}

	public void test()
	{
		System.out.println("This method from concrete class");
	}
}
