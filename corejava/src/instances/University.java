package instances;

public class University {
	static String universityName;
	String facultyName;
	String department;
	public void showFacultyDetails() {
		System.out.println("University Name: "+universityName);
		System.out.println("Faculty Name: "+facultyName);
		System.out.println("Department: "+department);
		System.out.println("--------------------------------------");
	}

	public static void main(String[] args) {
		University obj1= new University();
		University.universityName="Stanford";
		obj1.facultyName="Dr.Robert Brown";
		obj1.department="Computer Science";
		obj1.showFacultyDetails();
		University obj2= new University();

		obj2.facultyName="Dr.Lisa Green";
		obj2.department="Physics";
		obj2.showFacultyDetails();
	}

}
