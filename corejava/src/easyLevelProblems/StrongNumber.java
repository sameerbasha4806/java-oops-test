package easyLevelProblems;

public class StrongNumber {
	public static int fact(int num1) {
		int fact =1;
		for(int i=1;i<=num1;i++) {
			fact*=i;
		}
		
		return fact;
	}	
		
		static boolean isStrong(int num2) {
	    int temp =num2;
		int sum=0;
		while(temp>0) {
			int rem=temp%10;
			sum=sum+fact(rem);
			temp/=10;
		}
		return sum==num2;
		}		
	

	public static void main(String[] args) {
		
		System.out.println(isStrong(145)?"Strong Number":"Not a Strong Number");
		

	}

}
