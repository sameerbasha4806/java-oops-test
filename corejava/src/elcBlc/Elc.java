package elcBlc;

public class Elc {

	public static void main(String[] args) {
//		Students s1=new Students();
		
	Students s1 = Students.getStudentDetails(10,20,"sameer");
		System.out.println("Id: "+s1.getId());
		System.out.println("Rollno: "+s1.getRollNo());
		System.out.println("name: "+s1.getName());

	}

}
