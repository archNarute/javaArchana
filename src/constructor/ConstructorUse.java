package constructor;

public class ConstructorUse {
     
	int a;  //variable declaration
	int b;
	
	
	
	public static void main(String[] args)
	{
		ConstructorUse cu=new ConstructorUse();
	    ConstructorUse cu1=new ConstructorUse(10,20);
        cu1.test();
        ConstructorUse cu2=new ConstructorUse(5,10);
        cu2.test();
	}

	public ConstructorUse()
	{
		System.out.println("This is constructor with zero parameter");
	}
	
	public ConstructorUse(int x, int y)
	{
		a=x; b=y;
	}
   
	
	public void test()
	{
		int multiplication=a*b;
		System.out.println("multiplication is "+multiplication);
		System.out.println("value of a is "+a);
	}
	
}
