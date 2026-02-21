package com.array;

class Hospital{
	int patientId;
	String name;
	int arr[];
	
	public Hospital(int patientId, String name, int[] arr) {
		super();
		this.patientId = patientId;
		this.name = name;
		this.arr = arr;
	}
	

	public double getAverageResult() {
		double sum=0;
		for(int ele:arr) {
			sum+=ele;
		}
			return sum/arr.length;
	}
	
	public boolean hasCriticalValues() {
		for(int value:arr) {
			if(value<50) {
				return true;
			}
		}
		return false;
	}
	
	public void displayPatientReport() {
		if(hasCriticalValues()) {
			System.out.println("Patient Id: "+patientId);
			System.out.println("Patient Name: "+name);
			System.out.println("Patient medical tests: ");
			for (int value : arr) {
                System.out.println(value+" ");
            }
			System.out.println("Patient average details: "+getAverageResult());
			System.out.println("Is Critical : "+hasCriticalValues()); 
		}
		
	}
		
}



public class HospitalManagementSystem {

	public static void main(String[] args) {
		
		Hospital h=new Hospital(123,"Santhosh",new int[] {20,30,40,50,60});
		Hospital h2=new Hospital(173,"Sudharshan",new int []{10,90,80,70,85});
		
		h.displayPatientReport();
		h2.displayPatientReport();
		

	}

}
