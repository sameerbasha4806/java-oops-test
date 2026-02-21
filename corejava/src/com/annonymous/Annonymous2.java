package com.annonymous;

interface Example2{
	boolean isEvenOrOdd(int num);
}

public class Annonymous2 {
	
	public static void main(String[] args) {
		Example2 example=new Example2() {
			@Override
		public boolean isEvenOrOdd(int num) {
				return num%2==0;
			}
		};
		System.out.println(example.isEvenOrOdd(32));

	}

}
