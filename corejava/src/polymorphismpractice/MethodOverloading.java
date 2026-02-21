package polymorphismpractice;

public class MethodOverloading {
	
	void add(int a,int b) {
		System.out.println("Interger: "+ (a+b));
	
	}
	void add(double a,double b) {
		System.out.println("Double: "+(a+b));
	}
	public static void main(String[] args) {
		MethodOverloading mo=new MethodOverloading();
		mo.add(20, 30);
		mo.add(30.555, 40.7899);

	}

}
