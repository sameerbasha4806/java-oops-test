package com.college.app;
import java.util.Scanner;
import com.college.model.Person;
import com.college.model.Student;
import com.college.service.StudentService;


public class MainApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Name:");
		String name=sc.nextLine();
		System.out.println("Enter Age: ");
		int age=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter contact Number: ");
		long contactNumber=sc.nextLong();
		sc.nextLine();
		System.out.println("Student Id: ");
		int studentId=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Department: ");
		String department=sc.nextLine();
		System.out.println("Enter Course Name: ");
		String courseName=sc.nextLine();
		System.out.println("Enter Course Fee: ");
		double courseFee=sc.nextDouble();
		
		Student student=new Student(studentId, department, courseName);
		student.setName(name);
		student.setAge(age);
		student.setContactNumber(contactNumber);
		
		double discountPercent;
		if(department.equalsIgnoreCase("IT")) {
			discountPercent=10;
		}else {
			discountPercent=0;
		}
		
		StudentService service=new StudentService();
		double finalFee=service.calculateDiscountedFee(courseFee, discountPercent);
		
		student.displayStudentDetails();
		 System.out.println("original fee:"+courseFee);
		 System.out.println("Discount Applied: "+(courseFee-finalFee));
		 System.out.println("Final payable Fee: "+finalFee);
		sc.close();

	}

}
