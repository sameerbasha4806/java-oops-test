package com.college.model;

public class Student extends Person{
		private int studentId;
		private String department;
		private String courseName;
		
		public Student() {
			
		}
		
		public Student(int studentId,String department,String courseName) {
			super();
			this.studentId=studentId;
			this.department=department;
			this.courseName=courseName;
		}

		
		public int getStudentId() {
			return studentId;
		}
		public String getDepartment() {
			return department;
		}
		public String getCourseName() {
			return courseName;
		}
		
		public void setStudentId(int studentId) {
			this.studentId=studentId;
			
		}
		public void setDepartment(String department) {
			this.department=department;
		}
		
		public void setCourseName(String courseName) {
			this.courseName=courseName;
		}
		
		public void displayStudentDetails() {
			System.out.println("--------------Student details---------");
			System.out.println("Name: "+getName());
			System.out.println("Age: "+getAge());
			System.out.println("Contact Number: "+getContactNumber());
			System.out.println("Student Id: "+studentId);
			System.out.println("Department: "+department);
			System.out.println("Course Name: "+courseName);
		}
			
	}


