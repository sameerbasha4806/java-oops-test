package com.annonymous;

import java.util.Arrays;

interface Sorter{
	int[] isSort(int[] arr);
}

public class Sorting {

	public static void main(String[] args) {
		int arr[]= {4,5,2,1,3};
		Sorter s=new Sorter() {
			@Override
			public int[] isSort(int[] arr) {
//				Arrays.sort(arr);
				for(int i=0;i<arr.length;i++) {
					for(int j=0;j<arr.length;j++) {
						if(arr[i]<arr[j]) {
							int temp=arr[i];
							    arr[i]=arr[j];
							    arr[j]=temp;
						}
					}
				}
				
				return arr;
				
			}
		
			
		};
	     System.out.println(Arrays.toString(s.isSort(arr)));

	}

}
