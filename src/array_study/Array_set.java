package array_study;

public class Array_set {

	public static void main(String[] args)
	{
		//I want check status of switch
		
		boolean status[]=new boolean[2];
		
		status[0]=true;
		status[1]=false;
		 /*if(true==status[0]) 
		 { System.out.println("switch is on");
		 }
		 else
		 {
			 System.out.println("switch is of");
		 }*/
		 
		  for(int i=0; i<2; i++)
		  {
			  System.out.println("status is "+status[i]);
		  }
		 
		  for(int i=0; i<=status.length-1; i++)
		  {
			  System.out.println("status is "+status[i]);
		  }
		 
		  int[] arr= {60,70,80,90};
		  
		  for(int i=0; i<4; i++)
		  {
			  System.out.println("array is "+arr[i]);
		  }
		 
		   
		  int[] marks= {50,60,56,62,75};
		  
		  int total=0;
		  float per;
		  
		  //int sub=5;
		  for(int i=0; i<5; i++)
		  total=total+marks[i];
		  
		  System.out.println("total marks "+total);
		  per=(float)total/500*100;
		  
		  System.out.println("per is "+per);
		  
		  
		  
		 }

	
	}


