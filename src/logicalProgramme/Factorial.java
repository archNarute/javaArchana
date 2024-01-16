package logicalProgramme;

public class Factorial {

	public static void main(String[] args) {
		int i=1;
		int  factorial=1;
		int num=5;
		
		/*for( i=1; i<=num; i++)
		{
			factorial=factorial*i;
		}
		System.out.println("factorial of 5 is "+factorial);*/

		
	/*while(i<=num)
	{
		factorial=factorial*i;
		i++;
	}
	    System.out.println("factorial of 5 is "+factorial);*/
	    
	
	  do
	  {
		  factorial=factorial*i;
		  i++;
	  }while(i<=5);
	  System.out.println("factorial of 5 is "+factorial);
	}
         
        	 
        
}
