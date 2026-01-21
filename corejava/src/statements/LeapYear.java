package statements;

public class LeapYear {
	public String checkLeapYear(int num) {
		if(num%4==0) {
			return "Leap year";
		}else {
			return "Not a Leap Year";
		}
	}

	public static void main(String[] args) {
		LeapYear obj = new LeapYear();
		System.out.println(obj.checkLeapYear(2025));
		

	}

}
