package casting_study;

public class Upcasting1 {

	public static void main(String[] args)
	{
		Mother m=new Mother();
		m.love();
		m.look();
		m.nature();
		System.out.println("==================================");
		Son s=new Son();
		s.look();
		s.love();
		Son.status();  //static method of other class
		System.out.println("==================================");
		//upcasting
		//creating object of subclass with reference of superclass
		
		Mother m1=new Son();
		m1.look();
		m1.love();
		
		//cant call son's own method by using m1 object
		//m1.status(); //cant possible
		

	}

}
