package loopStudy;

public class WhileLoopStudy {

	public static void main(String[] args)
	{
	   //I want odd no. between 61to 80
		//Initialization     condition     updation
        // m=61               <=80            m=m+2
		
		int m=61;
				
		while(m<=80)
		{
			System.out.println(m);
			m=m+2;
		}
		System.out.println("==============================");
		
		//I want table of 11 in reverse order
		//Initialization     condition     updation
	     // m=110            >=11            m=m-11
		
		int x=110;
		while(x>=11)
		{
			System.out.println(x);
			x=x-11;
		}
		
	}

}
