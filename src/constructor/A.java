package constructor;

public class A {

	String S;
	char gender;
	float f;
	
	public A()
	{
		S="Ram";
		gender='F';
		f=50.5f;
	}
	
	public static void main(String[] args)
	{
		A a=new A();
		a.test();

	}

	public void test()
	{
		System.out.println("my name is "+S);
		System.out.println("my gender is "+gender);
		System.out.println("my weight is "+f);
		
	}
}
