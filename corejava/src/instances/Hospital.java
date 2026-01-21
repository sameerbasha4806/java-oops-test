package instances;

public class Hospital {
	public static String hospitalName;
	String patientName;
	int age;
	public void printDetails() {
		System.out.println("Hospital Name: "+hospitalName);
		System.out.println("Patient Name: "+patientName);
		System.out.println("Patient Age: "+age);
		System.out.println("-----------------------------------");
	}

	public static void main(String[] args) {
		Hospital obj1 = new Hospital();
		Hospital.hospitalName="City Care Hospital";
		obj1.patientName="John Doe";
		obj1.age=45;
		obj1.printDetails();
		Hospital obj2 = new Hospital();
		
		obj2.patientName="Emma Watson";
		obj2.age=30;
		obj2.printDetails();
		
				
	}

}
