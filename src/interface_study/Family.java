package interface_study;

public class Family implements Member1 , Member2
{

	public static void main(String[] args) 
	{
		Family f=new Family();
		f.attitude();
		f.knowledge();
		f.look();
		f.perfection();
		f.love();
		Member1.care();
		//Member2.care();
	}

	@Override
	public void look() 
	{
		System.out.println("Look of member 2 is nice");
		
	}

	@Override
	public void perfection() 
	{
		System.out.println(" Member2 is very perfectious to work");
		
	}

	@Override
	public void knowledge() 
	{
		System.out.println("knowledge of Member1 is good");
		
	}

	@Override
	public void attitude() 
	{
		System.out.println("Membe1's attitude is nice");
		
	}
    public void set()
    {
    	System.out.println("own method");
    }

	@Override
	public void love() 
	{
		Member1.super.love();
		Member2.super.love();
		
	}
}
