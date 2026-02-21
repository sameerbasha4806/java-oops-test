package com.array;
import java.util.*;

public class Frequency {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number of elements: ");
	int size=sc.nextInt();
	int arr[]=new int[size];
	boolean visited[]=new boolean[arr.length];
	System.out.println("Enter "+size+" Elements: ");
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt(); 
	}
//	for(int i=0;i<arr.length;i++) {
//		System.out.println(arr[i]+" ");
//	}
	for(int i=0;i<arr.length;i++) {
		if(visited[i])continue;
		int count=0;
		for(int j=0;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				count++;
				visited[j]=true;
			}
		}
		System.out.println(arr[i] + " occurs " + count + " times");
	}
	
	

	}

}
