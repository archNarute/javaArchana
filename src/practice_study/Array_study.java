package practice_study;

import java.util.Arrays;

public class Array_study {

	public static void main(String[] args) {
		int [] marks = new int [5];
		marks[0]=89;
		marks[1]=91;
		marks[2]=66;
		marks[3]=98;
		marks[4]=69;
		
		for(int i=0; i<=marks.length-1; i++)
		{
			System.out.println(marks[i]);
		}
		System.out.println("========reverse order================");
		for(int n=marks.length-1; n>=0; n--)
		{
			System.out.println(marks[n]);
		}
		System.out.println("========ascending order================");
		Arrays.sort(marks);
		for(int m=0; m<=marks.length-1; m++)
		{
			System.out.println(marks[m]);
		}
		System.out.println("========decending order================");
		for(int p=marks.length-1; p>=0; p--)
		{
			System.out.println(marks[p]);
		}
		
	}

}
