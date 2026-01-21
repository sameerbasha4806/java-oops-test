package easyLevelProblems;

public class PerfectNumber {
	public boolean isPerfect(int num) {
		if(num<=0) {
			return false;
		}
		int temp=num;
		int sum=0;
			for(int i=1;i<=num/2;i++) {
				if(num%i==0) {
					sum=sum+i;
				}
			}
			return temp==sum;
	}

	public static void main(String[] args) {
		PerfectNumber obj=new PerfectNumber();
		System.out.println(obj.isPerfect(28)?"Perfect Number":"Not a Perfect Number");
		

	}

}
