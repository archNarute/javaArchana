package interface_study;

public interface Member1
{   
    void knowledge();
    void attitude();
    
    default void love()
    {
    	System.out.println("member1's love");
    }
    static void care()
    {
    	System.out.println("member1's care");
    }
}
