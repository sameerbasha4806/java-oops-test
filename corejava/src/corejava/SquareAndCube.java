package corejava;

public class SquareAndCube {
	static int num=5;
	public static int square() {
		return num*num;
	}
	public static int cube() {
		int num2= square();
		return num2*num;
		
	}

	public static void main(String[] args) {
		System.out.println("The cube of the number is: "+cube());
		

	}

}
