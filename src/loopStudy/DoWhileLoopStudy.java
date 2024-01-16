package loopStudy;

public class DoWhileLoopStudy {

	public static void main(String[] args) 
	{
		/*I want series of multiplication of 3 between 3 to 300  
		initialization    condition      updation
          a=3               <=300          a*3 */
		
		int a=3;
	    
		do
		{
			System.out.println(a);
			a=a*3;
		} while(a<=300);
		
		 System.out.println("=====================================");
		/*I want series of division of 5 between 1000 to 1   
		initialization    condition      updation
          b=1000              >=1          b/5 */
		
		int b= 1000;
		
		do
		{
			System.out.println(b);
			b=b/5;
			
		}while(b>=1);
		
	}

}
