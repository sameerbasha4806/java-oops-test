package easyLevelProblems;

public class Reverse {
	public void reverseDigits(int num) {
	
		int rev=0;
		while(num>0) {
			int result=num%10;
			rev =rev*10 + result;
			num /=10;	
			
		}
		System.out.println(rev);
		
	}
	public void reversingDigit(int num) {
		int rev=0;
		while(num>0) {
			int remainder=num%10;
			rev=rev*10+remainder;
			num/=10;
		}
		System.out.println(rev);
	}

	public static void main(String[] args) {
		Reverse obj= new Reverse();
		Reverse obj2= new Reverse();
		obj.reverseDigits(721);
		obj2.reverseDigits(765);
		
	}

}
