package statements;

public class PosNeg {
	public String checkNumber(int num) {
		if(num>0) {
			return "positive";
		}
		if (num<0) {
			return "negative";
		}
		return "Zero";
	}

	public static void main(String[] args) {
		PosNeg obj=new PosNeg();
		System.out.println("Check -5: "+obj.checkNumber(-5));
		

	}

}
