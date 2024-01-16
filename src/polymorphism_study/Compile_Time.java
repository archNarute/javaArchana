package polymorphism_study;

public class Compile_Time {

	public static void main(String[] args) 
	{ 
		Compile_Time ct=new Compile_Time();
		ct.add();
		ct.add(10, 5);
		ct.add(5.5f, 2.0f);
		
    //called as method overloading
	}

	public void add()
	{int a=5; int b=2;
	 int sum=a+b;
		System.out.println("sum is "+sum);
	}
	public void add(int a, int b)
	{
		int sum =a+b;
		System.out.println("sum is "+sum);
	}
	 
	public void add(float a, float b)
	{
		float sum=a+b;
		System.out.println("sum is "+sum);
	}
}
