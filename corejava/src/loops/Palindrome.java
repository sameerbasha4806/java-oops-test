package loops;

public class Palindrome {
	public void getPalindrome() {
		int num=12321;
		int rev=0;
		int temp=num;
		while(num>0) {
			int remainder=num%10;
			rev=rev*10+remainder;
			num/=10;
		}
		if(temp==rev) {
			System.out.println("The given Number is Palindrome");
		}else {
			System.out.println("Not a palindrome");
		}
	}

	public static void main(String[] args) {
		Palindrome obj =new Palindrome();
		obj.getPalindrome();

	}

}
