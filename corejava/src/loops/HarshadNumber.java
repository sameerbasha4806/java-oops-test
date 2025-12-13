package loops;

public class HarshadNumber {
		public boolean isHarshadNumber(int num) {
			if(num<=0) {
				return false;
			}
			int temp=num;
			int sum=0;
			while(num>0) {
				int rem=num%10;
				sum=sum+rem;
				num/=10;
			}
			if(temp%sum==0) {
				return true;
			}
			return false;
	}
	
	public static void main(String[] args) {
		HarshadNumber obj =new HarshadNumber();
		System.out.println(obj.isHarshadNumber(24)?"Harshad Number":"Not a Harshad Number");
	}
}
	
