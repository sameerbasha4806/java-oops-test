package com.array;
import java.util.Scanner;
import java.util.Arrays;

public class CopyToArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Elements: ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter "+size+" Elements: ");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		int arr2[]=new int[arr.length];
		for(int i=0;i<size;i++) {
			arr2[i]=arr[i];
		}
		System.out.println("Elements copied to new array: ");
		
		for (int i = 0; i < size; i++) {
            System.out.print(arr2[i] + " ");
        }
		
		
//		System.out.println(Arrays.toString(arr2));
		
		
		
		
		sc.close();

	}

}
