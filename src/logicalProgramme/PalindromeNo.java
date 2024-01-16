package logicalProgramme;

public class PalindromeNo {

	public static void main(String[] args) {
		int r, sum=0, temp;
		int n=44; // check it is palindrome or not 131 if reverse it, gives same no. 343,232,212
		
		temp=n;
		while(n>0)
		{
			r=n%10; //reminder
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println(sum+" is a palindrome no");
			
		}
		else
		{
			System.out.println(sum+" is not a palindrome no");
		}

	}

}
