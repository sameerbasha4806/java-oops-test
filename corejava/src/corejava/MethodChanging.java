package corejava;

public class MethodChanging {
	public static int a=20;
	public static int b=30;
	public static int sum() {
		return a+b;
	}
	public static double average() {
		int c = sum();
		return c/2;
	}
	public static void main(String[] args) {
		System.out.println(sum());
		System.out.println(average());
	}

}
