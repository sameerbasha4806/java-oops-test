package com.array;
import java.util.Scanner;
import java.util.*;
import java.util.Arrays;

public class ArrayMerge {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array1: ");
		int size=sc.nextInt();
		sc.nextLine();
		int arr1[]=new int[size];
		System.out.println("Enter "+size+" Elements: ");
		for(int i=0;i<size;i++) {
			arr1[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println("Enter size of array2: ");
		int size2=sc.nextInt();
		sc.nextLine();
		int arr2[]=new int[size2];
		System.out.println("Enter "+size2+" Elements: ");
		for(int i=0;i<size2;i++) {
			arr2[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr2));
		int arr3[]=new int[arr1.length+arr2.length];
		
		for(int i=0;i<size;i++) {
			arr3[i]=arr1[i];
		}
		for(int i=0;i<size2;i++) {
			arr3[size+i]=arr2[i];
		}
		System.out.println("After merging array1 and array2: ");
		for(int i=0;i<arr3.length;i++) {
		}
		System.out.println(Arrays.toString(arr3));
		sc.close();
	}
		
}


