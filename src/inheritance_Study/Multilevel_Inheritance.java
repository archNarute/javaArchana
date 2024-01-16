package inheritance_Study;

public class Multilevel_Inheritance {

	public static void main(String[] args)
	{
		Grandfather gf=new Grandfather();
		gf.home();
		Grandfather.car();
		
		Father1 f1=new Father1();
		f1.skill();
		f1.home();
		Father1.look();
		Father1.car();
		
		Son1 s=new Son1();
		s.nature();
		s.home();
		s.skill();
		Son1.bike();
		Son1.look();
		Son1.car();
		
	}

}
