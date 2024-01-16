package casting_study;

public class Implicit_explicit {

	public static void main(String[] args) 
	{
		//implicit --convert lower datatype into higher datatype
		
		int a=500;
		float b=a;
		System.out.println(b);
		
		//explicit --convert higher datatype into lower datatype 
		
		float x=400.500f;
		short y=(short) x;   //need to write lower datatype infront of x
		System.out.println(y);
		

	}

}
