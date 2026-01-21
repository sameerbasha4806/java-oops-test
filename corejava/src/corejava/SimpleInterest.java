package corejava;

public class SimpleInterest {
	static int principle=5000;
	static int rate=5;
	static int time=2;
	public static int calculateInterest() {
		return principle*rate*time/100;
	}

	public static void main(String[] args) {
		System.out.println("the simple interest is: " +calculateInterest());
		

	}

}
