package method;

public class StudentDetails {

	public static void main(String[] args) 
	{
		StudentDetails sd=new StudentDetails();
		sd.studentInfo();
		sd.studentInfo();
		sd.studentInfo("Pradip", 28, 85.50f, 'B');
		sd.studentInfo("Sham", 24, 80.50f, 'A');

	}

	public void studentInfo() //method without parameter
	{ 
		//name, age, percentage, division
		
		String name;
		int age;
		float percentage;
		char division;
		
		name="Ram";
		age= 24;
		percentage= 89.50f;
		division='A';
		
		System.out.println("==================================================================================");
		System.out.println("Student name is "+name);
		System.out.println("Ram age is "+age);
		System.out.println("His percentage is "+percentage+"%");
		System.out.println("His division is "+division);
		System.out.println("===================================================================================");
		
	
	}
	 public void studentInfo(String name, int age, float percentage, char division) //method with parameter
		{
			System.out.println("==================================================================================");
			System.out.println("Student name is "+name);
			System.out.println("Age is "+age);
			System.out.println("Studentpercentage is "+percentage+"%");
			System.out.println("Division is "+division);
			System.out.println("He is very smart");
			System.out.println("===================================================================================");
			
		}
				
	
}
