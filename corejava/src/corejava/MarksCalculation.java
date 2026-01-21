package corejava;

public class MarksCalculation {
	static int sub1=85;
	static int sub2=90;
	static int sub3=80;
	public static int totalMarks() {
		return sub1+sub2+sub3;
		
	}
	public static double averageMarks() {
	  double avg = totalMarks();
	  return avg/3;
	}
	public static void main(String[] args) {
		int result1= totalMarks();
		double result2= averageMarks();;
		System.out.println("The total marks obtained: " + result1);
		System.out.println("The average of total: "+result2);
		
	}
}
