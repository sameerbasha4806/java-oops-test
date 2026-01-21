package loops;

public class NeonNumbers {
	public void getNeon(int num) {
		 int sum=0;
		 int square=num*num;
		 
		 while(square>0) {	
			 int remainder=square%10;
			 sum=sum+remainder;
			 square/=10;
		 }
//		 System.out.println(sum);
		 System.out.println((sum==num)?"neon number":"not a neon number");
	}

	public static void main(String[] args) {
		NeonNumbers obj =new NeonNumbers();
		obj.getNeon(9);

	}

}
