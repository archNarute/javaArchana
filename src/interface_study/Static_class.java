package interface_study;

public class Static_class implements Static_inter2 {

	public static void main(String[] args)
	{
		System.out.println("value of a "+a);
		Static_class sc=new Static_class();
		sc.set();
		sc.test();
		sc.test1();
		Static_Inter.demo();

	}

	@Override
	public void set() {
		System.out.println("interface1");
		
	}

	@Override
	public void test() {
		System.out.println("interface2");
		
	}

	@Override
	public void test1() {
		System.out.println("interface2 test1");
		
	}

}
