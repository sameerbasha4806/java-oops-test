package inheritancepractice;

class Person{
	String name;
	int id;
	int age;
		void getPersonDetails() {
		System.out.println("Name: "+name);
	   System.out.println("Id: "+id);
		System.out.println("Age: "+age);
	}
}
class Patient extends Person{
	double weight;
	String testReport;
	void getPatient() {
		getPersonDetails();
		System.out.println("Weight: "+weight);
		System.out.println("TestReport: "+testReport);
		
		}
	
}
class Doctor extends Person{
	String specialist;
	int experience;
	
	void getDoctorDetails() {
		getPersonDetails();
		System.out.println("Specialist: "+specialist);
		System.out.println("Experience: "+experience);
	}
}

public class Hierarchial {

	public static void main(String[] args) {
		Patient p=new Patient();
		p.name="sameer";
		p.id=123;
		p.age=23;
		p.weight=44.0;
		p.testReport="negative";
		System.out.println("-------------------");
		Doctor d=new Doctor();
		d.name="Shanker";
		d.id=143;
		d.age=43;
		d.specialist="cardiology";
		d.experience=10;
		p.getPatient();
		d.getDoctorDetails();
		

	}

}
