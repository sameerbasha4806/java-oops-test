package com.employee;

public class EmployeeProcessor {

	public static void main(String[] args) {
		Employee obj=new Employee(420,"Sameer","Software Developer",90000,5);
		System.out.println("Employee Id: "+obj.getempId());
		System.out.println("Employee Name: "+obj.getname());
		System.out.println("Employee Designation: "+obj.getdesignation());
		System.out.println("Employee Current Salary: "+obj.getsalary());
		System.out.println("Employee Performance Rating: "+obj.getperformanceRating());
		
		System.out.println("------------After updated------------------ ");
		obj.promoteEmployee("Senior Sofware Developer");
		System.out.println("Updated Salary: "+obj.getsalary());
		System.out.println("Updated Designation: "+obj.getdesignation());
		
		System.out.println("=========================================================");
		
		Employee obj2=new Employee(421,"Basha","Full Stack Developer",80000,3);
		System.out.println("Employee Id: "+obj2.getempId());
		System.out.println("Employee Name: "+obj2.getname());
		System.out.println("Employee Designation: "+obj2.getdesignation());
		System.out.println("Employee Current Salary: "+obj2.getsalary());
		System.out.println("Employee Performance Rating: "+obj2.getperformanceRating());

		
		System.out.println("------------After updated------------------ ");
		obj2.promoteEmployee("Senior Full Stack Developer");
		System.out.println("Updated Salary: "+obj2.getsalary());
		System.out.println("Updated Designation: "+obj2.getdesignation());

	}

}
