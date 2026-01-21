package instances;

public class DoubleValue {
	double d=77.9999d;
	public double getDoubleValue() {
		return d;
	}
	

	public static void main(String[] args) {
		DoubleValue obj2 = new DoubleValue();
		obj2.d = 44.90001d;
		System.out.println(obj2.d);
		

	}

}
