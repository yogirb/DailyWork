package newproject;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeList {

	public static void main(String[] args) {

		ArrayList<Employee> list = new ArrayList<>();
		addEmployees(list);
		Collections.sort(list, new Sort());
		//Collections.sort(list, new SortByAge());
		//Collections.sort(list, new SortByName());
		//Collections.sort(list, new SortByAddress());
		//Collections.sort(list, new SortByDesignation());
		for (Employee emp : list) {
			System.out.println(emp);
		}
	}

	private static void addEmployees(ArrayList<Employee> list) {
		Employee emp1 = new Employee(12, "vijay", "pune", "Developer", 20, 41000.00, 7581823510L);
		Employee emp2 = new Employee(56, "yogesh", "mumbai", "Tester", 21, 41000.00, 75813510);
		Employee emp3 = new Employee(89, "nikhil", "Bhopal", "softwaree engg", 30, 4100.00, 75823510);
		Employee emp4 = new Employee(78, "mayuresh", "Indore", "Networking", 5, 41000.00, 75823510);
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
	}

}