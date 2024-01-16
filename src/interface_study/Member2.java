package interface_study;

public interface Member2
{
     void look();
     void perfection();
     
     default void love()
     {
    	 System.out.println("member2's love");
     }
     //static void care()
     //{
    	// System.out.println("member2's care");
    // }
}
