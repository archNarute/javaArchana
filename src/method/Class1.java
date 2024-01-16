package method;

public class Class1 {

	public static void main(String[] args) 
	{
		//create object 
		//className objectName=new className
		Class1 boys=new Class1(); 
		//calling non static method from same class
		boys.ram();
		boys.sham();
		
		//calling non static method from different class
		//create object
		Class2 girls = new Class2();
				
		//calling from another class	
		girls.sita();
		girls.gita();
		
	}

	public void ram()
	{
		System.out.println("Hey its a nonstatic regular method from MyClass1");
	}
	
	public void sham()
	{
		System.out.println("Hey its a nonstatic regular method from MyClass1");
	}
	
}
