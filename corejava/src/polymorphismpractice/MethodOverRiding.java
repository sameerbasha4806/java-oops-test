package polymorphismpractice;

class A{
	int getData(int a,int b) {
		return a+b;
	}
}
class B extends A{
	@Override
	int getData(int a,int b) {
		super.getData(a, b);
		return a*b;
	}
	
}

public class MethodOverRiding {

	public static void main(String[] args) {
		A a;
		a = new B();
		System.out.println(a.getData(2, 3));
		a = new A();
		System.out.println(a.getData(2, 3));
		
		

	}

}
