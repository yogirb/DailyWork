package newproject;

public class StringDemo {

	public static void main(String[] args) {
		
		String city1="pune";
				
        String city2="Mumbai";
        
        String city3="pune";

        
       String city4=new String("pune"); 
       
       String city5=new String("Mumbai"); 
       
       String city6=new String("pune"); 
       System.out.println(city1==city2);
       System.out.println(city1.contentEquals(city6));
       String msg="i am Yogesh";
	System.out.println(msg.length());
	  
	String year="of 1997";
	msg.concat(year);
	
	System.out.println(msg);
	System.out.println(msg.substring(1,4));
	System.out.println(msg.substring(4));
	
	String Str9 = new String("Welcome to geeksforgeeks"); 
	 System.out.println(Str9.lastIndexOf('g')); 
	 
	 String msg1="i am yogesh";
	 System.out.println(msg1.toUpperCase() );
	 
	 String msg3="i am yogesh btde kk";
	 System.out.println(msg3.replace('k', 'j')); 
	 //System.out.println(msg3.replace('yogesh', 'akhalak')); 
	// String msg4="          i am yogesh btde kk";
	 
	 String s10="java string split method by javatpoint";  
	 System.out.println(s10.startsWith("java"));  
		 
	 
	 String s11="java by Pankaj sir";  
	 System.out.println(s11.endsWith("sir")); 
	 
	 String joinString1=String.join("","welcome", "to", "Cognizant");  
	 System.out.println(joinString1);  
	 
	}
}
