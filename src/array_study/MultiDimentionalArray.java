package array_study;

public class MultiDimentionalArray {

	public static void main(String[] args)
	{
		// A   B
		// C   D
		
		char[][] div = new char[2][3];
		div[0][0]='A';  
		div[0][1]='B';
		div[1][0]='C';
		div[1][1]='D';
		
		System.out.print(div[0][0]+" ");
		System.out.println(div[0][1]);
		System.out.print(div[1][0]+" ");
		System.out.println(div[1][1]);
		System.out.println("=================================");
		//or use nested for loop
		// outer for loop-- rows
		for(int i=0; i<=div.length-1; i++)
		{
			  for(int j=0; j<=div.length-1; j++)    //column=inner loop
 			  {
				  System.out.print(div[i][j]+" ");
 			  }
	       System.out.println();
		}
		System.out.println("=================================");
		//String[][] name= new String[3][2];
		
		// Sam    Sham    
		// Ram    Star    
		// Pam    zoya    
		
		/*name[0][0]="Sam";
		name[0][1]="Sham";
		name[1][0]="Ram";
		name[1][1]="Star";
		name[2][0]="Pam";
		name[2][1]="Zoya";*/
		
		/*for(int i=0; i<=name.length-1; i++)
		{
			  for(int j=0; j<=name.length-1; j++)
			  {
				  System.out.print(name[i][j]+" ");
			  }
			  System.out.println();
		}
		System.out.println("=================================");*/
		String[][] student= new String[3][3];
		
		// Sam    Sham    As
		// Ram    Star    AW
		// Pam    zoya    QW
		
		student[0][0]="Sam";
		student[0][1]="Sham";
		student[0][2]="AS";
		student[1][0]="Ram";
		student[1][1]="Star";
		student[1][2]="AW";
		student[2][0]="Pam";
		student[2][1]="Zoya";
		student[2][2]="QW";
		
		for(int i=0; i<=student.length-1; i++)
		{
			  for(int j=0; j<=student.length-1; j++)
			  {
				  System.out.print(student[i][j]+" ");
			  }
			  System.out.println();
		}
		System.out.println("========================================");
		  
		int[][] age={{10,20,30},{15,25,35},{40,50,60}};
		
		for(int i=0; i<=age.length-1; i++)
		{
			  for(int j=0;j<=age.length-1; j++)
			  { 
				  System.out.print(age[i][j]+" ");
			  }
			  System.out.println();
		}
		
	}   
	
	

}
