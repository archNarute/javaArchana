package thisAndSuperStudy;

public class SuperDemo extends ThisDemo
{

	int x=47;
	int z=10;
	public static void main(String[] args) 
	{
		SuperDemo s=new SuperDemo();
		s.sample();

	}

	
	
	
	public void sample()
	{
		int x=99;
		System.out.println("value of x is "+x);
		System.out.println("value of x is "+this.x);
		System.out.println("value of b is "+b);
		System.out.println("value of a is "+super.x);
	}
}

