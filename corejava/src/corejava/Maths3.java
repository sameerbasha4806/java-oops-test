package corejava;

public class Maths3 {
	public static int a;
	static int b=20;
	public static int m1(int x, int y) {
		System.out.println(x+y);
		return m2(a+b,y-x);
	}
	public static int m2(int c, int d) {
		System.out.println(c+d);
		return m3(a+b);
	}
	public static int m3(int e) {
		a=50;
		return e;
	}
	public static void main(String[] args) {
		System.out.println(m1(10,30));
		System.out.println(a);
		

	}

}
