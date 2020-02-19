package newproject;

public class Work {
	
	
	public static void main(String args[])
	{
		String str="Global Warming";
		int len=str.length();	
		
		//last four
		System.out.println("last 4 characters");
		
		System.out.println(str.substring(len-4,len));
		
		//index 4 to 8
		System.out.println(str.substring(4,9));	  
		
		//Alphanumeric
		System.out.println(str.matches("[A-Za-z0-9]+"));
		
		//last four trim
		String tr=str.substring(len-4);
		
	    System.out.println(tr);	   
	    
	    //trim first four
	    System.out.println(str.substring(0,4));	
	    
	   // System.out.println(str.indexOf('w'));
	    
	    
	    //uppercase
	    String str1="global warming";
	    System.out.println(str1.toUpperCase() );
	    
	    //index of Wa
	    int str3=str.indexOf("Wa");
	    System.out.println(str3 );
	    
	    //replace a with *
	    System.out.println(str.replace('a', '*')); 
	    
	    
	   
	    
	    
	    
	    }
	
	 //title case
	  
	public boolean IsTitleCase(String s1)
	{
		boolean result=false;
		String arr[]=s1.split("\\s1+");
		for(int i=0;i<arr.length;i++)
		{
			char ch=arr[i].charAt(0)
			if(ch>=65&& ch<=90)
		}
		
		
	}
	
}


