package elcBlc;
 class Student {
	 String name;
	 int marks;
 }
 
public class Details{
	
	public static void printDetails(Student s) {
		System.out.println("Student Name: "+ s.name); 
		System.out.println("Student Marks: "+s.marks);
	}
	public static void main(String[] args) {
		Student obj1=new Student();
		obj1.name="sameer";
		obj1.marks=92;
		printDetails(obj1);

	}

}
