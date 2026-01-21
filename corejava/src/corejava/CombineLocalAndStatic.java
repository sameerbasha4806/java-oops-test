package corejava;

public class CombineLocalAndStatic {
	static int rate=10;
	public static int calculateAmount() {
		int amount=500;
		return rate+amount;		
	}
	public static void main(String[] args) {
		int total=calculateAmount();
		System.out.println(total);

	}

}
