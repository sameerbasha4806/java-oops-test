package statements;

public class DivisiblilityCheck {
	public String divisible(int num) {
		if(num%5==0 && num%11==0) {
			return "Divisible by both 5 and 11";
		}else {
			return"Not divisible by 5 and 11";
		}
	}

	public static void main(String[] args) {
		DivisiblilityCheck obj = new DivisiblilityCheck();
		String result =obj.divisible(59);
		System.out.println(result);
	}

}
