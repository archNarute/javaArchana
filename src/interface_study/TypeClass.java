package interface_study;

public class TypeClass implements Inter_type  //implementation class
{
    static int m=10;
    
	public static void main(String[] args) 
	{
		TypeClass tc=new TypeClass();
		tc.batch1();
		tc.batch2();
		tc.set2();
		set1();
        System.out.println("value of p is "+p);
        System.out.println("value of m is "+m);
	}

	@Override
	public void batch1() 
	{
		System.out.println("method 1 from interface");
		
	}
	@Override
	public void batch2() 
	{
		System.out.println("method 2 from interface");
		
	}
   public static void set1()
   {
	   int m=5; 
	   System.out.println("value of m is "+m);
   }
   private void set2()
   {
	   int p=20; int b=10;
	  int sum= p+b;
	  System.out.println("sum is "+sum);
	 
   }
   
}
