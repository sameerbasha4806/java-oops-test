package statements;

public class EvenOdd {
	public boolean isEven(int num) {
		if(num%2==0) {
			return true;
		}
		if(!(num%2==0)) {
		return false;
	}
		return true;
	}

	public static void main(String[] args) {
		EvenOdd obj=new EvenOdd();
		System.out.println("is 10 even?: "+obj.isEven(10));

	}

}
