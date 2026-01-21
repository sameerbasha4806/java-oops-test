package corejava;

public class StudentPercentage {
	static int marks1=78;
	static int marks2=85;
	static int marks3=90;
	public static int total() {
		return marks1+marks2+marks3;
	}
	public static double percentage() {
		int a=total();
		return (a/300.0)*100;		
	}
	public static void main(String[] args) {
		int add= total();
		double per=percentage();		
		System.out.println("the total marks : "			+ add);
		System.out.println("The overall percentage is: "+per);
		

	}

}
