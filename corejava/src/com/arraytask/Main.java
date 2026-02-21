package com.arraytask;
import java.util.Scanner;
import java.util.Arrays;

class Employee{
	int empId;
	String empName;
	int [] monthlySalaries;
	public Employee(int empId, String empName, int[] monthlySalaries) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.monthlySalaries = monthlySalaries;
	}
	public double calculateAnnualSalary() {
		double sum=0;
		for(int ele:monthlySalaries) {
			sum+=monthlySalaries.length;
		}
		return sum;
	}

	public void displayEmployeeDetails() {
//		double annualSalary=0;
//		for(int i=0;i<monthlySalaries.length;i++) {
//			annualSalary=monthlySalaries[i]*12;
//		}
		
		System.out.println("Employee Id: "+empId);
		System.out.println("Employee Name: "+empName);
		System.out.println("Employee Total annual salary: "+calculateAnnualSalary());
	}
	
}

public class Main {

	public static void main(String[] args) {
	Employee  emp1=new Employee(420,"sameer",new int[] {5000,6000,7000,8000});
	emp1.displayEmployeeDetails();
	emp1.calculateAnnualSalary();

	}

}
