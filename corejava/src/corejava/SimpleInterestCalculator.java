package corejava;

public class SimpleInterestCalculator {
	public static double CalculateSimpleInterest(double principle,double rate,double time) {
		return (principle*rate*time)/100;
	}
	public static void main(String[] args) {
		double result=CalculateSimpleInterest(1500,2,10);
		System.out.println(result);
	}

}
