package elcBlc;

public class Swap {
	int a;
	int b;
	public void swapNumbers() {
	    a=a+b;
	    b=a-b;
		a=a-b;
	}

	public static void main(String[] args) {
		
		Swap obj1=new Swap();
		obj1.a=1;
		obj1.b=2;
		obj1.swapNumbers();
		System.out.println("a= "+obj1.a);
		System.out.println("b= "+obj1.b);

	}

}
