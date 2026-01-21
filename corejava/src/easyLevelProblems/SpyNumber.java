package easyLevelProblems;

public class SpyNumber {
	public boolean isSpyNumber(int num) {
		int sum=0;
		int mul=1;
		while(num>0) {
			int rem=num%10;
			sum=sum+rem;
			mul=mul*rem;
			num/=10;
		}
		return sum==mul;
	}

	public static void main(String[] args) {
	SpyNumber obj=new SpyNumber();
	System.out.println(obj.isSpyNumber(123)?"Spy Number":"Not a Spy Number");

	}

}
