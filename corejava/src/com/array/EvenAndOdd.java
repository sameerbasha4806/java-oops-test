package com.array;
import java.util.Scanner;
import java.util.Arrays;

public class EvenAndOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of Elements: ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the Elements: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int evenCount=0;
		int oddCount=0;
		
		for(int ele: arr) {
		
			if(ele%2==0) {
				evenCount++;
				
			}
			
			else {
				oddCount++;
				
			}
			
		}
		System.out.println("Even count: "+evenCount);
		System.out.println("Odd count: "+oddCount);
		sc.close();

	}

}
