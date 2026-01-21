package easyLevelProblems;

public class SumOFDigits {
	public void sum(int num) {
		
		int sum =0;
		while(num>0) {
			int result =num%10;
			sum +=result;
			num=num/10;
		}
		System.out.println(sum);
		System.out.println("------------------------");
	}
	public void sum2(int num) {
		int sum=0;
		while(num>0) {
			int rem=num%10;
			sum=sum+rem;
			num/=10;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		SumOFDigits obj =new SumOFDigits();
		SumOFDigits obj2 =new SumOFDigits();
		obj.sum(101);
		obj2.sum2(567);

	}

}
