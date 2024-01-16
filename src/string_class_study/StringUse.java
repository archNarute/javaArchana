package string_class_study;

public class StringUse {

	public static void main(String[] args) 
	{
		//length
		
		String sub="science and maths";
		String s=new String("bike");
		
		int sublength = sub.length();
		int slength = s.length();
		
		System.out.println("length of science sub is "+sublength);
		System.out.println("length of bike is "+s.length());
		
		System.out.println(sub);
		System.out.println(s);
		System.out.println("=================================");
		
		// touppercase
		// tolowercase
		String a="Archana";
		String upper = a.toUpperCase();
		System.out.println(a.toUpperCase()); //can't use in future
		System.out.println(upper);  // use in future
		
		String lower = upper.toLowerCase();
		System.out.println(lower);
		System.out.println("=================================");
		
		//equals
		//equalIgnoreCase
		String a1="Watch";
		String a2="Watch";
		String a3="watch";
		String a4= new String("Watch");
		String a5= new String("Watch");
		String a6=new String("watch");
		
		System.out.println(a1.equals(a2));
		System.out.println(a2.equals(a3));
		System.out.println(a5.equals(a4));
		System.out.println("=================================");
		System.out.println(a2.equalsIgnoreCase(a3));
		System.out.println(a5.equalsIgnoreCase(a6));
		System.out.println("=================================");
		//.equals used for content comparision or sequence of character
		//==used for memory location
		
		System.out.println(a1==a2);
		System.out.println(a2==a3);
		System.out.println(a4==a5);
		System.out.println(a3==a6);
		System.out.println("=================================");
		
		//contains
		String name="vedakshi";
		System.out.println(name.contains("ved"));
		System.out.println(name.contains("k"));
        System.out.println(name.contains("shd"));
        System.out.println("=================================");
        
        //isempty
        String z=new String("ved");
        String z1="   ";
        String z2="";
        boolean empty = z.isEmpty();
        System.out.println(empty);
        System.out.println(z1.isEmpty());
        System.out.println(z2.isEmpty());
        System.out.println("=================================");
        
        //isBlank
        String x="  ";
        String q="ram";
        String n="";
        System.out.println(x.isBlank());
        System.out.println(q.isBlank());
        System.out.println(n.isBlank());
        System.out.println("=================================");
        
        //charAt input in int and result in char
        System.out.println(q.charAt(2));  //start to count from 0
        String m=" morning";
        System.out.println(m.charAt(3));
        
        //System.out.println(m.charAt(10)); result is exception case, after this no line is executed 
        System.out.println(m.charAt(1));
        System.out.println("=================================");
		 
        System.out.println(m.startsWith("m"));
        System.out.println(m.endsWith("i"));
        
        System.out.println(m.indexOf("m"));
        System.out.println(m.indexOf("g"));
        
        System.out.println(m.replace("morning", "night"));
        System.out.println(m.substring(3));
        System.out.println(sub.concat(s));
        System.out.println(m.trim());
        System.out.println(m.length());
        System.out.println("=================================");
		 
        //endsswith
        String y="climate";
        System.out.println(y.endsWith("mate"));
        System.out.println(y.endsWith("e"));
        
        //startswith
        System.out.println(y.startsWith("cli"));
        System.out.println(y.startsWith("C"));   //case sensitive
        
        System.out.println(y.startsWith("imate", 2));
        System.out.println(y.startsWith("m", 3));
        System.out.println("=================================");
		 
        //substring
        String r= "India is my Country";
        System.out.println(r.substring(9));
        System.out.println(r.substring(12));
        
        System.out.println(r.substring(6, 11));
        
        
        String myStr="Hello planet earth, you are a great planet.";
        System.out.println(myStr.lastIndexOf("planet", 40));
        System.out.println(myStr.lastIndexOf("p", 10));
        System.out.println(myStr.lastIndexOf("planet", 40));
        
        //compareTo
        //if both string are equal then it returns 0, if string 1>string2 then it returns positive no. and 
        //if string 2> string1 then it returns negative no.
        //case sensitive
        //difference between compareTo and equals method? 
        String str1="ABCdef";
        String str2="abcde";
        System.out.println(str1.compareTo(str2));
        
        System.out.println(str1.compareToIgnoreCase(str2));
        
        System.out.println("===================================");
        //splitMethod
        
        String str="India is my Country";
        
        String[] sentence = str.split(" ");
        System.out.println(sentence[0]);
        System.out.println(sentence[1]);
        System.out.println(sentence[2]);
        System.out.println(sentence[3]);
         
        //or
        for(int i=0; i<=sentence.length-1; i++)
        {
        	System.out.println(sentence[i]);
        }
        
        
	}

}
