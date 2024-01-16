package variableuse;

public class GlobalVariable1 {
    String name="Ram";
    static int b= 500;
    int f=50;
    int a= 30;
	public static void main(String[] args) 
	{ 
	  // for non static variable we need to create object
	  GlobalVariable1 gv=new GlobalVariable1();
	  String friends= "Sham and "+ gv.name;
	 // System.out.println(friends+ " are friends");
	  
	  //for  static variable just call by variable name
	 // int prize= 400+b;
	  //System.out.println("Shirt prize is "+prize+ " rs");
	  
	  //calling to another class
	  Global2 g=new Global2(); //non static variable
	  float weight= g.a;
	 // System.out.println("His weight is "+weight+"kg");
	  
	  //static from another class
	  char division= Global2.c;
	  //System.out.println("His division is "+division);
	  
	  gv.test();
	 //System.out.println("value of f is "+gv.f);
	 // System.out.println("value of a is "+gv.a);
	  //gv.test1();
	}
	 public void test() 
	  { 
		 int a= 40;
		 System.out.println("value of a is "+a );
		 System.out.println("value of f is "+f);
		 System.out.println("value of b is "+b);
		 int prize= 400+b;
		 System.out.println("Shirt prize is "+prize+ " rs");
	  }
	 public void test1() 
	  { 
		 int a= 10;
		 System.out.println("value of a is "+a );
		  
	  } 
	  
}
