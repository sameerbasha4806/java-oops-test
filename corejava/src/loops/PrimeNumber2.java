package loops;

public class PrimeNumber2 {
	public boolean getPrime(int num) {
		if(num<=1) {
			return false;
		}
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		PrimeNumber2 obj=new PrimeNumber2();
		
//		for(int i=1;i<=100;i++) {
//			if(obj.getPrime(i)) {
//				System.out.println(i);
//			}
//		}
	System.out.println(obj.getPrime(7)?"prime number":"not a prime");

	}

}
