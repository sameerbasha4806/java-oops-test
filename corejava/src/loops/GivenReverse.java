package loops;

public class GivenReverse {
	public void reverse(int num) {
		int rev=0;
		while(num>0) {
			int remainder=num%10;
			rev=rev*10+remainder;
			num/=10;
		}
		System.out.println(rev);
	}

	public static void main(String[] args) {
		GivenReverse obj=new GivenReverse();
		obj.reverse(1234);
	}

}
