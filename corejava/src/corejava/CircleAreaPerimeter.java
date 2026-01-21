package corejava;

public class CircleAreaPerimeter {
	public static int radius = 5;
	public static double area() {
		return 3.14*radius*radius;			
	}
	public static double perimeter() {
		return 2*3.14*radius;
		
	}

	public static void main(String[] args) {
		double result1 = area();
		double result2 = perimeter();
		System.out.println("The area of circle is :"+ result1);
		System.out.println("The area of perimeter is:" +result2);
		
		
	}

}
