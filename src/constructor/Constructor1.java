package constructor;

    public class Constructor1
    {
      int a; //variable declaration
      float b;
      float c;
	
      public Constructor1() //Constructor without parameter
      { 
    	  a=10;
    	  b=5.5f;
    	  c=3.0f;
      }
      public Constructor1(int x) //Constructor with 1 parameter
      {
    	  a=x;
      }
      public Constructor1(int x, float y, float z) //Constructor with 3 parameter
      {
    	  a=x;  b=y; c=z;
      }
      
	 public static void main(String[] args) 
	{    //1.object created
		 Constructor1 c1=new Constructor1();
		 c1.subtraction();
		 c1.multiplication();
		 //2.object created
		 Constructor1 c2=new Constructor1(1);
		 c2.subtraction();
		 c2.multiplication();
		 //3.object created
		 Constructor1 c3=new Constructor1(2, 3.0f, 4.0f);
		 c3.subtraction();
		 c3.multiplication();
		 

	}
     public void subtraction()
    {
    	float sub =a-b-c;
    	System.out.println("============================================");
    	System.out.println("value of a is "+a);
    	System.out.println("value of b is "+b);
    	System.out.println("value of c is "+c);
    	System.out.println("value of sub is "+sub);
    	
    }
	
     public void multiplication()
     {
    	 float multiplication=a*b*c;
    	 System.out.println("============================================");
    	 System.out.println("multiplication is "+multiplication);
    
     }
}
