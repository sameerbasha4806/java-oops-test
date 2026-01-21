package com.inheritance;

public class Y extends X{
	public void method2() {
		System.out.println("This is a child class");
	}

	public static void main(String[] args) {
//	Y y=new Y();
		X x=new X();
		x.method1();
//	y.method2();
//	y.method1();

	}

}
