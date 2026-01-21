package loops;

public class Factorial {
	public void getFactorial(int num) {
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println(fact);
	}

	public static void main(String[] args) {
		Factorial obj=new Factorial();
		obj.getFactorial(4);
		
	}

}
