package statements;

public class SwitchUsingOperators {

	public static void main(String[] args) {
		int num1=20;
		int num2=10;
		char a = '/';
		switch (a) {
		case '+':
			System.out.println((num1+num2));
			break;
		case '/':
			if(num2 != 0) {
				System.out.println((num1/num2));
			}else {
				System.out.println("invalid number 0 is not divisible ");
			}
			break;
		}
	}

}
