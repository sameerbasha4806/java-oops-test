package statements;

public class SwitchEvenOrOdd {

	public static void main(String[] args) {
		int i=9;
		switch(i%2) {
		case 0:
			System.out.println("the number is even");
			break;
		case 1:
		case -1:
			System.out.println("the number is odd");
			break;
			default :
				System.out.println("the number is invalid");
			break;	
			
			
		}

	}

}
