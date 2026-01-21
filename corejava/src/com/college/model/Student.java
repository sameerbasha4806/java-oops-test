package com.college.model;

public class Student extends Person{
	private String studentId;
	private String department;
	private String courseName;
	public Student() {
		
	}
	public Student(String studentId, String department, String courseName) {
		this.studentId=studentId;
		this.department=department;
		this.courseName=courseName;
	}
	public String getStudentId() {
		return studentId;
	}
	public String getdepartment() {
		return department;
	}
	public String getcourseName() {
		return courseName;
	}
	public void setStudentId(String studentId) {
		this.studentId=studentId;
	}
	public void setdepartment(String department) {
		this.department=department;
	}
	public void setcourseName(String courseName) {
		this.courseName=courseName;
	}
	public void displayStudentDetails() {
//		System.out.println("Name: "+getName());
//		System.out.println("Age: "+getAge());
//		System.out.println("contact: "+getcontactNumber());
		System.out.println("Student Id: "+studentId);
		System.out.println("Department: "+department);
		System.out.println("course: "+courseName);
	}
	
}
