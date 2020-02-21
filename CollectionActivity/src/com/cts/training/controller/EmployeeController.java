package com.cts.training.controller;

import java.util.List;
import java.util.Scanner;

import com.cts.training.bean.Employee;
import com.cts.training.dao.impl.EmployeeDAOImpl;
;

public class EmployeeController {

	public static void main(String[] args) {
		EmployeeDAOImpl empObj = new EmployeeDAOImpl();
//		Employee emp = new Employee(111, "Disha", "Bhopal", "Digital Engineer", 22, 46566.77, 46546656L);
//		empObj.addEmployee(emp);
//		
		
//		Employee empl = empObj.getEmployeeById(1234);
//		empObj.deleteEmployee(empl);
		
		Employee em = empObj.getEmployeeById(4234);
		 em.setName("aj");
		 empObj.updateEmployee(em);
		
		List<Employee> list = empObj.getAllEmployees();
		list.forEach(System.out::println);
		
		System.out.println("Add Employee");
		System.out.println("Update Employee");
		System.out.println("Delete Employee");
		System.out.println("Get Emp By Id");
		System.out.println("Display all");
		System.out.println("Exit");
		Scanner  s=new Scanner(System.in);
		
		
		
		switch(Choice)
		{
		case 1:
			int id=s.nextInt();
			String name=s.nextint();
		    String address=s.NextInt();
		    String designation=s.NextInt();
		    int age=s.nextInt();
		
		
	
	}


	}
	
}


