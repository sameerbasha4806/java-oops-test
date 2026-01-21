package com.company;

public class Employee {
	private String employeeName;
	private int employeeId;
	private String employeeDesg;
	private double employeeSalary;
	
	public Employee(String employeeName,int employeeId,String employeeDesg,double employeeSalary) {
		
		this.employeeName=employeeName;
		this.employeeId=employeeId;
		this.employeeDesg=employeeDesg;
		this.employeeSalary=employeeSalary;
		System.out.println("Employee object has been created");
	}
	
	public String getemployeeName() {
		return employeeName;
	}
	
	public int getemployeeId() {
		return employeeId;
	}
	public String getemployeeDesg() {
		return employeeDesg;
   }
	
	public double getemployeeSalary() {
		return employeeSalary;
	}
	public void setemployeeName(String employeeName) {
		this.employeeName=employeeName;
	}
	public void setemployeeId(int employeeId) {
		this.employeeId=employeeId;
	}
	public void setemployeeDesg(String employeeDesg) {
		this.employeeDesg=employeeDesg;
	}
	public void setemployeeSalary(double employeeSalary) {
		this.employeeSalary=employeeSalary;
	}
	
	
	
}
