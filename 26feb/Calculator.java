package newproject;

public class Calculator {
	
	public static void main(String[] args) 
	{
		
		Hello1 add=(a,b) -> a+b;
		System.out.println(add.calculate(2,3));  
	//	Hello2 mul=(a,b) -> a*b;
		//System.out.println(mul.calculate(2,3));  
		
		
		
	}
	
	
	
	
	

}

@FunctionalInterface
interface Hello1

{
	
	double calculate(double a,double b);
	
	
}