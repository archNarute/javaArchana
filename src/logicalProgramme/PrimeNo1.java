package logicalProgramme;

public class PrimeNo1 {

	public static void main(String[] args) {
		/*int num=11, i, count=0;  //count is extra variable declared for loop(for
		                     // is continued upto whole given no
		
		for(i=1; i<=num; i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
         if(count==2)
         {
        	 System.out.println(num+" is prime no.");
         }
         else
         {
        	 System.out.println(num+" is not prime no.");
         } */
         
         
         
         
         int num=20, i, count=0;  //count is extra variable declared for loop(for
         // is continued upto whole given no

        for(i=1; i<=num; i++)
        {
            if(num%i==0)   //0 means reminder
         {
                 count++;
         }
          }
           if(count==2)  // 2means only divisible by 2 no.
            {
              System.out.println(num+" is prime no.");
            }
           else
            {
                   System.out.println(num+" is not prime no.");
             }
	}
	
	
	

}
