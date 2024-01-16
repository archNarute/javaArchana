package controlStatementDemo;

public class Nested_If_Else_Use {

	public static void main(String[] args) {
		//if nationality is Indian then we can vote
        //if age is above 18 then we can vote
		//else you are not eligible to vote(age less than 18 year)
		//else your nationality is not Indian
		
		String nationality="Indian";
		int age=19;
		
		if(nationality=="Indian") //outer if statement
		{
			   if(age>=18) //inner if statement
			   {
				  System.out.println("we can vote");
				  System.out.println("thanks for voting");
			   }
			   else //inner else statement
			   {
				   System.out.println("you are not eligible to vote");
			   }
		}
		else //outer else statement
		{
		  System.out.println("please enter applicable nationality");
		}
	}

}
