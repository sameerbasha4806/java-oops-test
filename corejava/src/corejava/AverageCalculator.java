package corejava;

public class AverageCalculator {
	public static double averageOfThreeNumbers(double a,double b,double c) {
		return (a+b+c)/3;
	}
	public static void main(String[] args) {
		double result=averageOfThreeNumbers(3,4,5);
		System.out.println(result);
	}

}
