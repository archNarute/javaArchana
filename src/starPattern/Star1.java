package starPattern;

public class Star1 {

	public static void main(String[] args) {
		int row=6;
		for(int i=1; i<=6;i++)
		{
			for(int star=1; star<=i; star++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}

	}

}
