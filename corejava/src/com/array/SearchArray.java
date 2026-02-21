package com.array;
import java.util.Scanner;

public class SearchArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter "+size+ " Elements");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter element to Search: ");
		int ele=sc.nextInt();
		boolean found=true;
		for(int i=0;i<size;i++) {
		   if(ele==arr[i]) {
			   System.out.println("Element found at position : "+(i+1));
			   found=true;
			   break;
		   }
		   if(!found){
			   System.out.println("Element not found");
		   }
			
		}

	}

}
