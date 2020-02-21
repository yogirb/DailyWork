package newproject;



import java.util.Comparator;

public class SortByDesignation implements Comparator<Employee> 
{

	public int compare(Employee emp1, Employee emp2)
	{
		
		
		return emp1.getDesgination().compareTo(emp2.getDesgination());
		
		
		
		
		

	}
	

}