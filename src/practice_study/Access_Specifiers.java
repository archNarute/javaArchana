package practice_study;

   class Access_Specifiers //make only public and default
   {
   int a=20;
   public String name="sachin";
   protected int b=44;
   private int c=55;
	   
	public static void main(String[] args)  // main method always remain public
	{
		//we want to print table of 10
	for(int i=10; i<=100; i=i+10)
	{
		System.out.println(i);
	}

	System.out.println("=====================");
	Access_Specifiers as=new Access_Specifiers();
	as.set2();
	set1();
	as.set3();
	as.set4();
	
	System.out.println("value of a is "+as.a);
	System.out.println("value of name is "+as.name);
	System.out.println("value of b is "+as.b);
	System.out.println("value of c is "+as.c);
	
	
	}
    public static void set1()
    {
    	int a=22;
    	int b=20;
    	int m=a+b;
    	System.out.println(m);
    	
    }
    private void set2()
    {
    	System.out.println("this is private method--access within class only ");
    }
    protected void set3()
    {  
    	System.out.println("protected method");
    }
    void set4()
    {
    	System.out.println("default method");
    }
}
