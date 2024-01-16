package practice_study;

public class Access2 {

	public static void main(String[] args) {
		Access_Specifiers ac=new Access_Specifiers();
		ac.set3();
		ac.set4();
		//ac.set2(); //private specifier
		Access_Specifiers.set1();
		
		System.out.println("value of a is "+ac.a);
		System.out.println("value of name is "+ac.name);
		System.out.println("value of b is "+ac.b);
		//System.out.println("value of c is "+ac.c); private 
		

	}

}
