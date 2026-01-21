package statements;

public class MenuDriven {

	public static void main(String[] args) {
		double a=20.0;
		double b=10.0;
		String operator = "/";
		double result;
		switch(operator){
		
		    case "+":
		      	System.out.println("the addition is: "+(a+b));
		    	break;

			case "-":
				result = a-b;
				System.out.println("the substraction is: "+result );
				break;
			case "*":
				result = a*b;
				System.out.println("the multiplication is: "+result);
				break;
			case "/":
				result = a/b;
				if(b==0) {
					System.out.println("0 is not divisible or undefined");
				}else {
				System.out.println("the division is: "+a/b);
				}
				break;
			case "%":
				result =a%b;
				if(b==0) {
					System.out.println("In denominatior 0 is restricted");
				}else {
					System.out.println("the modulus id : "+a%b);
				}
				break;
			
				default:
					System.out.println("not a valid ");
					break;
				
		}

	}

}
