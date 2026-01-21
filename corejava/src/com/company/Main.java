package com.company;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
	    System.out.println("Enter EmployeeName: ");
	    String employeeName =scanner.next();
	    System.out.println("Enter EmployeeId");
	    int employeeId =scanner.nextInt();
	    System.out.println("Enter Employee Desg: ");
	    String employeeDesg =scanner.next();
	    System.out.println("Enter Employee Salary: ");
	    double employeeSalary=scanner.nextDouble();
	    
	    Employee employee=new Employee(employeeName,employeeId,employeeDesg,employeeSalary);
	    System.out.println("Enter Manager Name: ");
	    String managerName =scanner.next();
	    Manager manager=new Manager(managerName);
	    manager.checkDetails(employee);
		
		scanner.close();

	}

}
