package AccessSpecifiers;

public class Group2 {

	public static void main(String[] args)
	{
		Group1 g=new Group1();
		Group1.test();
		g.set();
		g.type();
		
		System.out.println(" value of b is "+g.b);
		System.out.println(" value of b is "+g.c);
		System.out.println(" value of b is "+Group1.d);
	}

}
