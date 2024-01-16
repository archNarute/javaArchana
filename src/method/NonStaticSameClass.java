package method;

public class NonStaticSameClass {

	public static void main(String[] args)
	{
	//for calling non static method from same class we need to create object
	//to create object
	//className objectName=newClassName();
	NonStaticSameClass doctor= new NonStaticSameClass();
	NonStaticSameClass teacher= new NonStaticSameClass();
	//how to run
	//objectName.methodName(); 
	doctor.profession1();
	teacher.profession2();
	
	}

	public void profession1()
	{
		System.out.println("Non static complete regular method from own class");
	}
	
	public void profession2()
	{
		System.out.println("Non static complete regular method from own class");
	}
	
}
