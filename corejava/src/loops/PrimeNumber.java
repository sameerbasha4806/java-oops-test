package loops;

public class PrimeNumber {
	public boolean prime(int num) {
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		 return count==2;
	}

	public static void main(String[] args) {
		boolean result=new PrimeNumber().prime(19);
		for(int j=1;j<=100;j++) {
			
		}
		System.out.println(result?"The Number Is Prime":"Not A Prime Number");
	}

}
 