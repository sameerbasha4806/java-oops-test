package statements;

public class Divisible {
	public String divisiblityCheck(int a) {
		if((a%5==0) && (a%3==0)) {
			return "divisible by 5 and 3";
		}else if(a%5==0) {
			return "divisible by 5";
		}else if (a%3==0) {
			return "divisible by 3";
		}else {
		return "not divisible by 3 and 5";
		}
			
	}
	public static void main(String[] args) {
		Divisible obj = new Divisible();
		System.out.println(obj.divisiblityCheck(9));
		

	}

}
