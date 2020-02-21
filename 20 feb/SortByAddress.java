package newproject;


import java.util.Comparator;

public class SortByAddress implements Comparator<Employee> 
{

	public int compare(Employee emp1, Employee emp2)
	{
		
		
		return emp1.getAddress().compareTo(emp2.getAddress());
		
		
		
		
		

	}
	

}