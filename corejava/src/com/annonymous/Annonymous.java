package com.annonymous;

class Example{
	void isEvenOrOdd(int num) {
//		System.out.println(" ");
	}
}

public class Annonymous {

	public static void main(String[] args) {
		Example ex=new Example() {
			
			void isEvenOrOdd(int num) {
				if(num%2==0) {
					System.out.println("even");
				}else {
					System.out.println("odd");
				}
			}
		};
		ex.isEvenOrOdd(20);

	}

}
