package polymorphism_study;

public class Run_timeB extends RunTimeA
{

	public static void main(String[] args)
	{
		RunTimeA a=new RunTimeA();
		Run_timeB b=new Run_timeB();
		
		a.set();
		b.set();
		a.sample();
		b.sample();
		b.group();
	}
 
	public void set()
	{
		boolean result=false;
		System.out.println("my covid test result is "+result);
	}
	
	public void group()
	{
		System.out.println("hello friends");
	}
}
