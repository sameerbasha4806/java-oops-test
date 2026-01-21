package corejava;

public class CurrencyConverter {
	static double dollarRate=84.5;
	public static double convertToINR(double usd) {
		return usd*dollarRate;
	}

	public static void main(String[] args) {
		
      	double result=convertToINR(21);
      	double result2=convertToINR(100);
		System.out.println("INR: "+result);
		System.out.println("INR: "+convertToINR(50));
		System.out.println("INR: "+result2 );
		
		

	}

}
