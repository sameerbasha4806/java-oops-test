package com.employee;

public class Employee {
	private int empId;
	private String name;
	private String designation;
	private double salary;
	private int performanceRating;
	
	public Employee(int empId,String name,String designation,double salary,int performanceRating) {
		this.empId=empId;
		this.name=name;
		this.designation=designation;
		this.salary=salary;
		this.performanceRating=performanceRating;
	}
	public int getempId() {
		return empId;
	}
	public String getname() {
		return name;
	}
	public String getdesignation() {
		return designation;
	}
	public double getsalary() {
		return salary;
	}
	public int getperformanceRating() {
		return performanceRating;
	}
	public void setempId(int empId) {
		this.empId=empId;
	}
	public void setname(String name) {
		this.name=name;
	}
	public void setdesignation(String designation) {
		this.designation=designation;
	}
	public void setsalary(int salary) {
		this.salary=salary;
		
	}
	public void setperformanceRating(int performanceRating) {
		this.performanceRating=performanceRating;
	}
	public void promoteEmployee(String newdesignation) {
		if(performanceRating>=4) {
			salary+=salary*0.2;
			this.designation=newdesignation;
			System.out.println("Promote to Next Level");
//			System.out.println("Updated Salary: "+salary);
		}
		else {
			System.out.println("No Promotion");
		}
	}

}
