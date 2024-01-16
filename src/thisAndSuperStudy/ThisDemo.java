package thisAndSuperStudy;

public class ThisDemo {

	String name= "veda";
    static float a=45.5f;
    int b=50;
    int x=9;
	
	public static void main(String[] args) 
	{
		ThisDemo td=new ThisDemo();
		td.test();
		
		//System.out.println("my name is "+);
		System.out.println("my weight is "+a);
		
		
	}

	
	
	
	void test()
	{
		String name= "sham";
		System.out.println("my name is "+name);
		System.out.println("my name is "+this.name);
	}
	
	
	
	
}
