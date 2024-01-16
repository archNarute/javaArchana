 package logicalProgramme;

public class PrimeNo2 {

	public static void main(String[] args) {
		int i, m=0,flag=0;
		int num=20; // it is prome no or not check it
		
		m=num/2;
		
		if(num==0||num==1)
		{
			System.out.println(num+" is not prime no");
		}
		
		else
		{
			for(i=2; i<=m; i++)
			{
				if(num%i==0)
				{
					System.out.println(num+" is not prime no");
					flag=1;
					break;
				}
				if(flag==0)
				{
					System.out.println(num+" is prime no");
				}
				
			}
		}

	}

}
