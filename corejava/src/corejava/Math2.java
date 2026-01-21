package corejava;

class Math2 {
	public static int a=0;
	static int b=20;
	public static int maths3(int x, int y) {
		System.out.println(x+y);
		return maths4(40,60);
	}
	public static int maths4(int c, int d) {
		System.out.println(c+d);
		return maths5(a+b);
		
	}
	public static int maths5(int e) {
		a=70;
		return e;
	}

	public static void main(String[] args) {
		System.out.println(maths3(10,30));
		System.out.println(a);
		

	}

}
