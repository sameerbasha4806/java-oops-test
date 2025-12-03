package easyLevelProblems;

public class Factorial {

	public void fact(int num) {	
		long fact=1;
		for(int i=1;i<=num;i++) {
			fact*=i;
		}
		System.out.println(fact);
		
	}
	public static void main(String[] args) {
	Factorial obj =new Factorial();
	obj.fact(5);
	
	}

}
