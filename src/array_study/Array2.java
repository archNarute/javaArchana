package array_study;

import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) 
	{
		// we also declare array by using {}
		System.out.println("=======same order=======");
		int marks[] = { 6,9,25,10,12};
		
		for(int i=0; i<=marks.length-1; i++)
		{
			System.out.println(marks[i]);
		}
		
		System.out.println("=======reverse order=======");
		
		for(int i=marks.length-1; i>=0; i--)
		{
			System.out.println(marks[i]);
		}
		
		System.out.println("=======ascending order=======");
		
		Arrays.sort(marks);    // inbuilt method array
		for(int i=0; i<=marks.length-1; i++)
		{
			System.out.println(marks[i]);
		}
		System.out.println("=======decending order=======");
		for(int i=marks.length-1; i>=0; i--)
		{
			System.out.println(marks[i]);
		}
		System.out.println("=======ascending order=======");
		String[] boys= {"Ram","Sham","Kittu","Zoya","Ashu"};
		
		Arrays.sort(boys);
		for(int a=0; a<=boys.length-1; a++)
		{
			System.out.println(boys[a]);
		}
		System.out.println("=======decending order=======");
		for(int a=boys.length-1; a>=0; a--)
		{
			System.out.println("Boy name of "+a+ " "+"is "+ boys[a]);
		}
	}

}
