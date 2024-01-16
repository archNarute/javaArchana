package accessA;

import AccessSpecifiers.Group1;

public class Group3 extends Group1
{

	public static void main(String[] args) 
	{
		Group1 g2=new Group1();
		g2.type();
		
		Group3 g3= new Group3();
		g3.set();
		g3.type();
		
		System.out.println("value of c is "+g3.c);
		System.out.println("value of d is "+g3.d);
		System.out.println("value of d is "+g2.d);
		
		
	}

}
