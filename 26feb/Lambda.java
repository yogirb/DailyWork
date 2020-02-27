package newproject;

public class Lambda {

	public static void main(String[] args) 
	{
	
		
		Runnable r =()  ->  System.out.println("Hello Runnable ");  
		Thread t=new Thread(r);
		t.start();
		
		//MyThread t=new MyThread();
		///Thread thread=new Thread(t);
		//thread.start();
		
		
		
		
		Hello h = () -> "Good Morging";
		
		 System.out.println(h.greetings());  
		 
		 
		 Hello h1 = () -> "Good Afternoon";
		 System.out.println(h1.greetings());  

	
	}
	
	
	
	
}


@FunctionalInterface
interface Hello
{
	
	String greetings();
	
	//public void display();
	
	
	
}