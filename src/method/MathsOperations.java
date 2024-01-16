package method;

public class MathsOperations {

	public static void main(String[] args)
	{ 
		MathsOperations mo=new MathsOperations();
		mo.multiplication();
		mo.multiplication();
        mo.subtraction(150, 50);
        mo.subtraction(200, 180);
	}
   public void multiplication() //without parameter
   {
	   float p;
	   int q;
	   float multiplication;
	   
	   p=5.5f;
	   q=5;
	   multiplication=p*q;
	   
	   System.out.println("multiplication is "+multiplication);
   }
   public void subtraction(int m,int n) //wit parameter
   {
	   int sub;
	   sub=m-n;
	   System.out.println("subtraction is "+sub);
   }
   
   
   
}
