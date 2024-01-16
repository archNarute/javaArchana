package array_study;

public class ArrayUse {

	public static void main(String[] args) 
	{
		String[] names = new String[5];  //array declaration
		
		names[0]="Veda";    // array initialization
		names[1]="Ram";
		names[2]="Sham";
		names[3]="Sweety";
		//names[4]="Om";    exception shows index is out of bond
		
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[3]);
		//System.out.println(names[4]); exception shows index is out of bond 
		System.out.println(names[4]);   //if without initialize we use array then it shows the default value of datatype
		 
		System.out.println("====================================");
		// by using this step usage is length so use for loop
		
		for(int i=0; i<=4; i++)    // static loop, we give condition in specific no.
		{
			System.out.println(names[i]);
		}
		System.out.println("====================================");
		for(int i=0; i<=names.length-1; i++)   //dynamic loop
		{
			System.out.println(names[i]);
		}	

	}

}
