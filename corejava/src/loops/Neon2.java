package loops;

public class Neon2 {
	public boolean getNeon(int num) {
		 int sum=0;
		 int square=num*num;
		 int temp=num;
		 while(square>0) {	
			 int remainder=square%10;
			 sum=sum+remainder;
			 square/=10;
		 }
		 return temp==sum;
	}

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			boolean result=new Neon2().getNeon(i);
			if(result) {
				System.out.println(i);
			}
		}
		

	}

}
