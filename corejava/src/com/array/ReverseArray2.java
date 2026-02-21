package com.array;
import java.util.Scanner;

public class ReverseArray2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int size=sc.nextInt();
		int arr[]=new int [size];
		System.out.println("Enter "+size+"Elements: ");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Array in Reverse order: ");
		for(int i=size-1;i>=0;i--) {
			System.out.println(arr[i]);
		}
		sc.close();
		

	}

}
