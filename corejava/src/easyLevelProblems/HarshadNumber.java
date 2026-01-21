package easyLevelProblems;

public class HarshadNumber {
	public boolean findHarshad(int num) {
		int temp=num;
		int sum=0;
		while(num>0) {
			int remainder=num%10;
			sum=sum+remainder;
			num/=10;
		}
//			if(temp%sum==0) {
//				System.out.println("Harshad number");
//			}else {
//				System.out.println("Not a Harshad Number");
//			}	
			return temp%sum==0;
		
	}

	public static void main(String[] args) {
		HarshadNumber obj=new HarshadNumber();	
		for(int i=1;i<=100;i++) {
			if(obj.findHarshad(i)) {
				System.out.println(i);
			}
		}
		
		
	}

}
