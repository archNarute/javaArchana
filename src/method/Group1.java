package method;

public class Group1 {

	public static void main(String[] args) 
	{   //calling from same class
		part1(); //calling static method without parameter
		part2("Rahul", 20, 5.5f); //calling static method with parameter
		
		Group1 g1=new Group1(); //object creation
		g1.part3();   //calling non static method without parameter
		g1.part4(90.50f, true);  //calling non static method with parameter
		
		//calling from different class
		Group2 g2=new Group2(); //object creation
		g2.test1(25000000L, 'A'); //calling non static method with parameter
		
		Group2.test2(); //calling static method without parameter

	}

	public static void part1() //this is static method without parameter
	{
	System.out.println("This is static regular method from group 1");
	}
	
	public static void part2(String name, int age, float height ) //this is static method with parameter
	{
		System.out.println("==========================================================");
		System.out.println("my name is "+name);
		System.out.println("my age is "+age);
		System.out.println("my height is "+height+" f");
		System.out.println("==========================================================");
	}
	
	public void part3() //this is non static method without parameter
	{
		System.out.println("This is non static regular method from group 1");
	}
	
	
	public void part4(float avg, boolean status) //this is non static method with parameter
	{
		System.out.println("============================================================");
		System.out.println("my avg marks is "+avg);
		System.out.println("my result status is "+status);
		System.out.println("==========================================================");
	}
	
	
	
	
	}