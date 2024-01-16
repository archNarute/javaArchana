package starPattern;

public class Star3 {

	public static void main(String[] args) {
		
			int row=5;
			for(int i=1; i<=5;i++)
			{
				for(int space=1; space<i; space++)
				{
					System.out.print(" ");
				}
				for(int star=row; star>=i;star--)
				{
					System.out.print("*");
				}
				System.out.println();
			}

		}


	}


