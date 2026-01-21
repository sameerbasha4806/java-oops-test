package corejava;

public class EmployeeSalaryUpdate {
	static int basic =20000;
	static int bonus= 5000;
	public static int calculateSalary() {
		int c= basic+bonus;
		return c;
	}

	public static void main(String[] args) {
		System.out.println("The total salary : "+calculateSalary());
		

	}

}
