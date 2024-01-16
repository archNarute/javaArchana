
public class Sample {

	public static void main(String[] args) 
	{
		Sample.main("xyz");
        Sample s1=new Sample();
        s1.main();
	}
	public static void main(String args) 
	{
		System.out.println("calling main method2");

	}
	public void main() 
	{
		System.out.println("calling main method3");

	}
}
