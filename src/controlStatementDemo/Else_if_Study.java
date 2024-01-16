package controlStatementDemo;

public class Else_if_Study {

	public static void main(String[] args) 
	{
		//marks and passing status //marks=x
		//marks range (<=100 &>=75-->1st class, <75&>=50-->2nd class, <50&>=40-->3rd class, <40-->fail)     
		int x=88;
		if(x>100)
		{
			System.out.println("marks are invalid");
		}
		else if(x>=75 && x<=100) //or operator||
		{
			System.out.println("I got 1st class");
		}
		else if(x>=50 && x<75)
		{
			System.out.println("I got 2st class");
		}
		else if(x>=40 && x<50)
		{
			System.out.println("I got 3rd class");
		}
		else 
		{
			System.out.println("I am fail");
		}
		
	}

}
