package practice_study;

public class Concrete_c  extends Abstract_Class{

	public static void main(String[] args) {
		Concrete_c cc=new Concrete_c();
		cc.sample();
		Concrete_c.group();
		cc.study();

	}

	@Override
	void sample() 
	{
		System.out.println("abstract class method implemented in concrete class");
		
	}
    public void study()
    {
    	System.out.println("own method of concrete class");
    }
}
