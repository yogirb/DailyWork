package newproject;

import java.util.Comparator;

public class Sort implements Comparator<Employee> {

	public int compare(Employee emp1, Employee emp2) {
		if (emp1.getId() > emp2.getId()) {
			return 1;
		} else if (emp1.getId() == emp2.getId()) {
			return 0;
		} else {
			return -1;
		}
	}
}