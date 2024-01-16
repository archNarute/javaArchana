package controlStatementDemo;

public class ElseIfStudy {

	public static void main(String[] args) 
	{
		//signal status
		String colour="white";
		if(colour=="green")
		{
			System.out.println("you should go now");
			
		}
		else if(colour=="red")
		{
			System.out.println("You must stop now");
		}
		else if(colour=="yellow")
		{
			System.out.println("you should wait");
		}
		else
		{
			System.out.println("please enter valid colour");
		} 
		
	}

}
