package statements;

public class Discount {
	public String discountEligiblity(int a) {
		if(a>=500) {
			return "Eligible for 10% discount"; 
		}else {
			return "Not eligible for discount";
		}
	}

	public static void main(String[] args) {
		Discount obj =new Discount();
		int bill=600;
		String result=obj.discountEligiblity(bill);
		System.out.println(result);

	}

}
