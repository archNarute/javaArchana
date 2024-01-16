package interface_study;

public class Practice1 implements Practice {

	public static void main(String[] args) {
		Practice1 p=new Practice1();
		p.study();

	}

	@Override
	public void study() 
	{
		System.out.println("study hard");
		
	}

}
