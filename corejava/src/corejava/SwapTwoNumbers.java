package corejava;

public class SwapTwoNumbers {
	static int x=10;
	static int y=20;
	public static void swap() {
		int a=x;
		x=y;
		y=a;
		System.out.println("After swap: x = " +x+ ", y=" +y);
		
	}

	public static void main(String[] args) {	
		
		System.out.println("Before swap: x= "+x+",y="+y);
		swap();	

	}

}
