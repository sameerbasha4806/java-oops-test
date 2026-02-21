package com.array;
import java.util.*;

public class MaxAndMin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Elements: ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter "+size+" Elements");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Array elements");
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]+" ");
		}
		int min=arr[0];
		int max=arr[0];
		for(int i=1;i<=arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("Minumum value: "+min);
		System.out.println("Maximum Value: "+max);
		
	}
}
