package statements;

public class EvenOrOdd {
	public void evenodd(int num) {
		if(num%2==0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
	}
	public static void main(String[] args) {
		EvenOrOdd obj = new EvenOrOdd();
		obj.evenodd(3);
	}

}
