package inheritancepractice;

class A{
	String a;
	String b;
	String getDetails() {
		return a+b;
	}
}	
class B extends A{
	String c;
	String getData() {
		return getDetails()+c;
//		System.out.println(getDetails()+c);
	}
}

class C extends B{
	String d;
	void get() {
		System.out.println(getData()+d);
	}
	
}
	

public class MainC {
	

	public static void main(String[] args) {
//		B b=new B();
//		b.a="Sameer ";
//		b.b="Basha ";
//		b.c=" shaik";
		
		
		C b=new C();
		b.a="Sameer ";
		b.b="Basha ";
		b.c=" shaik";
		b.d=" 77";
		b.get();

	}

}
